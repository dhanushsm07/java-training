package com.training.threadImplementation;

public class ThreadTest {
    public static void main(String[] args) {

        //thread created by extending Thread class
        ThreadClassExtending threadClassExtending = new ThreadClassExtending();
        threadClassExtending.start();

        //thread created by implementing Runnable interface
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread t1 = new Thread(runnableInterface);
        t1.start();


    }
}
