package com.training.serializationAndDeserialization.externalizable;

import week_2.serializationAndDeserialization.externalizable.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableVersionDemo {
    public static void main(String[] args) {

        String file = "employee_version.ser";

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            Employee e = new Employee("John", 101, "supersecret");
            oos.writeObject(e);
            System.out.println("Object Serialized!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee e = (Employee) ois.readObject();
            System.out.println("After Deserialization:");
            System.out.println(e);    // password will be null
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}