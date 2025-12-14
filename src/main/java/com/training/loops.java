package com.training;

public class loops {
    public static  void main(String args[]){
        for(int i=0;i<=10;i++){
            System.out.println("for loop ");
            System.out.println(i);
        }

        int j=1;
        while(j<10){
            System.out.println("while loop ");
            System.out.println(j);
            j++;
        }

        int a=2;
        do{
            System.out.println("do-while loop ");
            System.out.println(a);
            a++;

        }while(a<10);

        int[] c={10,20,30};
        for(int x:c){
            System.out.println(x);
        }
    }
}
