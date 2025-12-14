package com.training.concurrentUtilities;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("Task done");
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("All tasks completed!");

    }
}
