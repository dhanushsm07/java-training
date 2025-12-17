package com.training.collectionFrameworkExample.SetInterfaceExample;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // Duplicates are not allowed

        System.out.println("HashSet elements:");
        System.out.println(set);

        System.out.println(set.contains("Java"));
    }
}