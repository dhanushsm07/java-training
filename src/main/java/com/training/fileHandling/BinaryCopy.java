package com.training.fileHandling;

import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        String source = "source.bin";
        String destination = "copy.bin";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("Binary file copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
