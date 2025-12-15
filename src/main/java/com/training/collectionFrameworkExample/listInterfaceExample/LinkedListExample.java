package com.training.collectionFrameworkExample.listInterfaceExample;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.addFirst("Orange");
        list.addLast("Grapes");

        list.remove(2);
        System.out.println("LinkedList elements:");
        System.out.println(list);
    }
}
