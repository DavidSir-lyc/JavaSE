package lyc.java.test;

import org.junit.Test;

/**
 线程间通信(------ 这段程序在junit实现不了？放在main方法可行 ------)
 new 新建状态，还未启用，还未调用start方法
 runnable 运行状态，抢到CPU时间片
 blocked 阻塞状态，未抢到CPU时间片。
 该线程试图获取对象锁，而对象锁被其他线程持有，则进入blocked状态；
 当该线程持有锁，则进入runnable状态。
 timed_waiting 计时等待。调用sleep方法进入该状态。
 waiting 无线永久等待。调用wait方法进入该状态。必须等另一个线程调用notify或notifyAll方法才会唤醒。
 terminated 死亡状态
 */

public class LThreadStatus {
    @Test
    public void threadStatusTest () {
        Object lock = new Object();

        // 顾客线程
        new Thread() {
            @Override
            public void run() {
                // 保证等待和唤醒 只能有一个线程在执行
                synchronized (lock) {
                    System.out.println("我想吃包子，快点给我做！");
                    // 进入waiting阻塞状态
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("开吃，真香！");
                }
            }
        }.start();

        // 店家线程
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("正在做，稍等...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock) {
                    System.out.println("包子做好了，请品尝！");
                    lock.notify();
                }
            }
        }.start();
    }
}
