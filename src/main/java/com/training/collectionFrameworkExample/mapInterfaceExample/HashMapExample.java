package com.training.collectionFrameworkExample.mapInterfaceExample;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(1, "Spring");   // Duplicate key (value replaced)

        System.out.println("HashMap elements:");
        System.out.println(map);
    }
}
