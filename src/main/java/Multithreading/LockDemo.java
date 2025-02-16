package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo extends Thread{

    private int balance = 100;

    public LockDemo(String name) {
        super(name);
    }

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw");
        try {
            if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println("Withdraw successful by " + Thread.currentThread().getName());
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Insufficient balance !");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if (Thread.currentThread().isInterrupted()){
            System.out.println("Interrupted thread: "+Thread.currentThread().getName());
        }
    }
}
