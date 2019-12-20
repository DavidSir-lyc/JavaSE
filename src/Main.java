/**
 * separator (n.) 分离器
 * */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // file类的学习
        Lfile lfile= new Lfile();
        lfile.fileFun();
        lfile.createFile();
        /**
         * thread类的学习
         * 启动一个新的线程，不是直接调用 Thread  子类对象的 run() 方法，而是调用 Thread 子类的 start() 方法
         * Thread 类的 start() 方法会产生一个新的线程，该线程用于执行 Thread 子类的 run() 方法。
         * */
        Lthread lthread = new Lthread();
        lthread.start();
        // System.out.println("运行结束！");
        // Runnable接口实现学习
        Lrunnable lrunnable = new Lrunnable();
        Thread thread = new Thread(lrunnable);
        thread.start();
    }
}
