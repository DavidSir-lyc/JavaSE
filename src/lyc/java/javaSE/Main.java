package lyc.java.javaSE;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * file类的学习
         * */
        LFile lfile= new LFile();
        // lfile.fileFun();
        // lfile.createFile();
        // lfile.createDirectory();
        // lfile.fileFilterFun();
        // lfile.rafFun();

        /**
         * thread类的学习
         * 启动一个新的线程，不是直接调用 Thread  子类对象的 run() 方法，而是调用 Thread 子类的 start() 方法
         * Thread 类的 start() 方法会产生一个新的线程，该线程用于执行 Thread 子类的 run() 方法。
         * */
        LThread lthread = new LThread();
        // lthread.start(); // 开启子线程
        /**
         * Runnable接口实现学习
         * */
        LRunnable lrunnable = new LRunnable();
        Thread thread = new Thread(lrunnable);
        // thread.start(); // 开启子线程
        /**
         * String类学习
         * */
        LString lstring = new LString();
        // lstring.testString();
        // lstring.testStringBuilder();
        /**
         * socket类学习
         * */
        LSocket lSocket = new LSocket();
        // lSocket.someFun();
        /**
         * collection接口实现学习
         * */
        LCollection lCollection = new LCollection();
        // lCollection.arrayListFun();
        // lCollection.linkedListFun();
        // lCollection.hashSetFun();
        // lCollection.treeSetFun();
        /**
         * LMap接口实现学习
         * */
        LMap lmap = new LMap();
        lmap.mapFun();
    }
}
