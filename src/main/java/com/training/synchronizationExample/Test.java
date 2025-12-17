package com.training.synchronizationExample;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();

        MyThread t1 = new MyThread(count);
        MyThread t2 = new MyThread(count);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.print(count.getCount());
    }
}
