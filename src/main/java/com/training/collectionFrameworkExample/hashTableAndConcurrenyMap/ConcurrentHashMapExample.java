package com.training.collectionFrameworkExample.hashTableAndConcurrenyMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(101, "Spring");
        map.put(102, "Hibernate");
        map.put(103, "Microservices");

        // map.put(null, "Test");   // Null key not allowed
        // map.put(104, null);      // Null value not allowed

        System.out.println("ConcurrentHashMap elements:");
        System.out.println(map);
    }
}
