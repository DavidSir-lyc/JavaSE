package lyc.java.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题---lock锁
 * */
class Tickets implements Runnable {
    // 第1步：实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        int tickets = 10;
        while (tickets > 0) {
            try{
                // 第2步：调用lock()，上锁
                lock.lock();
                System.out.println(Thread .currentThread().getName()+"正在售卖第"+tickets+"张票");
                tickets--;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 第3步：释放锁
                lock.unlock();
            }
        }
    }
}

