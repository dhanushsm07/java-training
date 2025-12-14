package com.training.synchronizationExample;

public class MyThread extends Thread{

    public Count count;

    public MyThread(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            count.counter();
        }
    }
}
