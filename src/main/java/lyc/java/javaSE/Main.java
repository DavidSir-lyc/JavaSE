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
        // lmap.mapFun();
        /**
         * JDBC接口实现学习
         * */
        LJDBC ljdbc = new LJDBC();
        // ljdbc.testJDBC();
        /**
         * 反射学习
         * 使用反射的N种方式
         * */
        // 通过实例化对象的.getClass()方法获取
        /*LReflection LR = new LReflection();
        LR.getClass();*/
        // 通过类获取class对象，只有lei才有.class属性
        /*Class<LReflection> lR = LReflection.class;*/
        // 用类的全限定名，运行时，加载类到JVM
        /*Class.forName("lyc.java.javaSE.LReflection");*/
        // 通过类加载器获取
        /*LReflection.class.getClassLoader("lyc.java.javaSE.LReflection")*/

    }
}
