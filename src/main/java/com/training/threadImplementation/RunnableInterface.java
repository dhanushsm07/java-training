package com.training.threadImplementation;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        for( ; ;){
            System.out.println("runnable interface ");
        }
    }
}
