package com.training.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorSingleThread {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Task is running in thread : " + Thread.currentThread().getName());
        };

        executor.execute(task);
    }
}
