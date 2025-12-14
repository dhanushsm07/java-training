package com.training.fileHandling;

import java.io.*;

public class BufferedReadWrite {
    public static void main(String[] args) {
        String filename = "buffered.txt";

        // Writing using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This is written using BufferedWriter.\n");
            writer.write("It is more efficient for large text files.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
