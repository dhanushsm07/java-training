package com.training;

public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    Thread t1 = new Thread(() -> {
        synchronized (lock1) {
            System.out.println("Thread 1 has lock1");
            synchronized (lock2) {
                System.out.println("Thread 1 has lock2");
            }
        }
    });

    Thread t2 = new Thread(() -> {
        synchronized (lock2) {
            System.out.println("Thread 2 has lock2");
            synchronized (lock1) {
                System.out.println("Thread 2 has lock1");
            }
        }
    });
}
