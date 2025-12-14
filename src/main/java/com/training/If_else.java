package com.training;

public class If_else {
    public static void main(String args[]){
        int a=10, b=5;

        if(a>b) {
            System.out.println("a is greater");
            System.out.println("b is smaller");
        } else if (a==b) {
            System.out.println("a is equal to b");

        } else{
            System.out.println("a is smaller than b");
        }

        //ternary operator
        System.out.println((a>b)?"a is bigger":"b is bigger");
    }
}