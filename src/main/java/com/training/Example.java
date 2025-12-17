package com.training;

import java.util.Scanner;

public class Example {
    //input = HeLLo

    public static void main(String[] args) {
        int lowercase = 0, uppercase =0;

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        for(int i=0; i < ip.length(); i++){
            if('z' - (ip.charAt(i)) <= 26){
                lowercase++;
            }
            else{
                uppercase++;
            }
        }

        System.out.println("hi");
        System.out.println(uppercase);
        System.out.println(lowercase);
    }


}
