package com.training.collectionFrameworkExample.SetInterfaceExample;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");   // Duplicate ignored

        System.out.println("LinkedHashSet elements:");
        System.out.println(set);
    }
}
