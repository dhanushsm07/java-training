package com.training.collectionFrameworkExample.mapInterfaceExample;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("LinkedHashMap elements:");
        System.out.println(map);
    }
}
