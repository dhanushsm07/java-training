package com.training.concurrentUtilities;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " : " + threadLocal.get());
            threadLocal.set(threadLocal.get() );
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
