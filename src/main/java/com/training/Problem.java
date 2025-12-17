package com.training;

public class Problem {
    public static void main(String[] args) {

        String input = "   Dhanush";
        input.trim();

        StringBuilder sb = new StringBuilder();
//        for(int i=input.length(); i>=0; i--){
//            int pos = 0;
//            while(input.charAt(i) != ' '){
//                i--;
//            }
//            pos = i;
//            while(i != input.length()-1 || i != ' '){
//                sb.append(input.charAt(i));
//                i++;
//            }
//            i = pos;
//        }

        String[] a = input.trim().split("\\s+");

        for(int i=a.length-1; i >= 0; i--){
            sb.append(a[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
