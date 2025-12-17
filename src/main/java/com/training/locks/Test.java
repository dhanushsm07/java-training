package com.training.locks;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bank.withdraw(50);
            }
        };
        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");

        t1.start();
        t2.start();
    }
}
