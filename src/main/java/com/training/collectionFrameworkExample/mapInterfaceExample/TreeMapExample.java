package com.training.collectionFrameworkExample.mapInterfaceExample;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

//        TreeMap<Integer, String> map = new TreeMap<>();
//
//        map.put(30, "Thirty");
//        map.put(10, "Ten");
//        map.put(20, "Twenty");

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Thirty", 30);
        map.put("Twenty", 20);
        map.put("Ten", 10);

        System.out.println("TreeMap elements:");
        System.out.println(map);
    }
}
