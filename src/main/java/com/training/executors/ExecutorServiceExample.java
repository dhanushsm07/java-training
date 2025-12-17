package com.training.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<5; i++){
            int taskNumber = i;

            executorService.submit(() -> {
                System.out.println("Task" + taskNumber + "running in thread : " + Thread.currentThread().
                        getName());

            });
        }
        executorService.shutdown();
    }
}
