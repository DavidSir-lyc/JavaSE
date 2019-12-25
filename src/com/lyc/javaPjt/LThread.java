package com.lyc.javaPjt;

public class LThread extends Thread {
    private String name;
    private int age;
    @Override
    public void run () {
        super.run();
        System.out.println("这是线程类LThread!");
        // curentThread() 方法可返回代码段正在被哪个线程调用的信息
        System.out.println("这是哪个线程?--->" + Thread.currentThread().getName());
        //  isAlive() 方法判断线程是否活动的标准
        System.out.println("当前线程活着没?--->"+this.isAlive());
    }
}
