package com.training.synchronizationExample;

public class Count {
    private int count = 0;

    //with the help of synchronized keyword we can avoid multiple threads trying to access
    //the shared resources

    //we can either make the whole method synchronized or we can also make a particular  block of code which
    //is critical section i.e, the code which will lead to race condition as synchronized
    public void counter(){
        synchronized (this) {
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
