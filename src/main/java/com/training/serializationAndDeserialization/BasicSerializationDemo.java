package com.training.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicSerializationDemo {
    public static void main(String[] args) {

        String filename = "student.ser";

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s = new Student("John", 21);
            oos.writeObject(s);
            System.out.println("Object Serialized Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s = (Student) ois.readObject();
            System.out.println("Deserialized Object:");
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}