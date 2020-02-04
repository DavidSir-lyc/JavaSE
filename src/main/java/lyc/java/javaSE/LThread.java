package lyc.java.javaSE;

/**
 * 多线程编程
 * 1. 继承thread类
 * 2. 重写run方法
 * 3. 用新建的线程类实例化对象，调用start()方法开启线程，调用run()方法体。
 * start() --调用--> run()
 * */
public class LThread extends Thread {
    private String name;
    private int age;
    @Override
    public void run () {
        super.run();
        System.out.println("这是线程类LThread!");
        // curentThread() 方法可返回代码段正在被哪个线程调用的信息
        Thread.currentThread().setName("lyc");
        System.out.println("这是哪个线程?--->" + Thread.currentThread().getName());
        //  isAlive() 方法判断线程是否活动的标准
        System.out.println("当前线程活着没?--->"+this.isAlive());
    }
}
