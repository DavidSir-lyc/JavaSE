public class LRunnable implements Runnable {
    //  run() 方法正是对,Runnable 接口中 run() 方法的具体实现
    @Override
    public void run() {
        System.out.println("Runnable实现类!");
    }
}
