package com.training.threadImplementation;

public class ThreadClassExtending extends Thread{
    @Override
    public void run() {
        for(; ; ){
            System.out.println("Thread class ");
        }
    }
}
