package com.training.collectionFrameworkExample.SetInterfaceExample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);   // Duplicate ignored

        System.out.println("TreeSet elements:");
        System.out.println(set);
    }


}
