package com.training.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                System.out.println(Thread.currentThread().getName() + "attempting to withdraw " + amount);

                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + "withrawn " + amount);
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "remaining balance " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println("Insufficient balance");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock, try later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println("Thread got interrupted");
        }

    }

}
