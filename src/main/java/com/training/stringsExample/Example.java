package com.training.stringsExample;

public class Example {

    public static void main(String[] args) {

        String string = "Hello";
        string = string + " world";

        System.out.println(string.length());

        for(int i=0; i<string.length(); i++){
            System.out.println(string.charAt(i));
        }

        System.out.println(string);

        System.out.println(string.substring(3));

        System.out.println(string.substring(3, 8));

        StringBuilder sb = new StringBuilder("String");
        sb.append("bulder");

        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer("String");
        stringBuffer.append("Buffer");

        System.out.println(stringBuffer);
    }
}
