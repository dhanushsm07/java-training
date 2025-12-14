package com.training.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleTextReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.text";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello, this is a simple text file");
            writer.write("Java, file i/o");
        }catch (IOException e){
            System.out.println("Error writing file :"+e.getMessage());
        }

        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("File content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
