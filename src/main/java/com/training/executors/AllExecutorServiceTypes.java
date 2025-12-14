package com.training.executors;

import java.util.concurrent.*;

public class AllExecutorServiceTypes {

    public static void main(String[] args) throws Exception {

        // SingleThreadExecutor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.submit(() -> {
            System.out.println("SingleThreadExecutor → Task executed by: "
                    + Thread.currentThread().getName());
        });
        singleThreadExecutor.shutdown();


        // FixedThreadPool (size = 3)
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 3; i++) {
            int taskId = i;
            fixedThreadPool.submit(() ->
                    System.out.println("FixedThreadPool → Task " + taskId
                            + " executed by: " + Thread.currentThread().getName()));
        }
        fixedThreadPool.shutdown();


        // CachedThreadPool (creates threads as needed)
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 1; i <= 3; i++) {
            int taskId = i;
            cachedThreadPool.submit(() ->
                    System.out.println("CachedThreadPool → Task " + taskId
                            + " executed by: " + Thread.currentThread().getName()));
        }
        cachedThreadPool.shutdown();


        // ScheduledThreadPool (delay or repeated tasks)
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

        scheduledThreadPool.schedule(() ->
                        System.out.println("ScheduledThreadPool → Delayed Task executed by: "
                                + Thread.currentThread().getName()),
                2, TimeUnit.SECONDS);

        scheduledThreadPool.shutdown();

    }
}
