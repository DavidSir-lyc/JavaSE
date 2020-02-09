package lyc.java.test;

import org.junit.Test;

public class TestTickets {
    @Test
    public void fun() {
        Tickets tickets = new Tickets();
        Thread thread1 = new Thread(tickets);
        Thread thread2 = new Thread(tickets);
        Thread thread3 = new Thread(tickets);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}