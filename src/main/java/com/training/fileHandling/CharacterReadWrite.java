package com.training.fileHandling;

import java.io.*;

public class CharacterReadWrite {
    public static void main(String[] args) {
        String filename = "data.txt";

        // Writing characters
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("A\nB\nC\n");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading characters
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("File content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
