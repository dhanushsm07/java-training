package com.training.exceptionExample;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try{
            readFile("a.text");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        return fr.toString();
    }
}
