package com.training.collectionFrameworkExample.hashTableAndConcurrenyMap;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");

        // table.put(null, "Test");   // Null key not allowed
        // table.put(4, null);        // Null value not allowed

        System.out.println("Hashtable elements:");
        System.out.println(table);
    }
}
