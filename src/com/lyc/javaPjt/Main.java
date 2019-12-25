package com.lyc.javaPjt;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /**file类的学习*/
        LFile lfile= new LFile();
        lfile.fileFun();
        lfile.createFile();
        /**
         * thread类的学习
         * 启动一个新的线程，不是直接调用 Thread  子类对象的 run() 方法，而是调用 Thread 子类的 start() 方法
         * Thread 类的 start() 方法会产生一个新的线程，该线程用于执行 Thread 子类的 run() 方法。
         * */
        LThread lthread = new LThread();
        lthread.start(); // 开启子线程
        /**Runnable接口实现学习*/
        LRunnable lrunnable = new LRunnable();
        Thread thread = new Thread(lrunnable);
        thread.start(); // 开启子线程
    }
}
