package com.training.executors;

import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 10 + 1;
        };

        Future<Integer> result = executorService.submit(task);

        System.out.println(result.isDone());

        System.out.println(result.get());
    }
}
