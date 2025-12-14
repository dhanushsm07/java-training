package com.training.serializationAndDeserialization;

import java.io.*;

// Simple Serializable class
class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}