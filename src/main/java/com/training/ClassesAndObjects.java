package com.training;

public class ClassesAndObjects {
    int a;
    int b;

    //no args constructor
    public ClassesAndObjects() {
    }

    //overidden constructor with arguments
    public ClassesAndObjects(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static  void  main(String args[]){

        //initialization of object using no args constructor
        ClassesAndObjects o1 = new ClassesAndObjects();
        int a = 2, b=3;

        //initialization of object using constructor with arguments
        ClassesAndObjects o2 = new ClassesAndObjects(a, b);

        System.out.println(o2.a +","+ o2.b);

    }
}


