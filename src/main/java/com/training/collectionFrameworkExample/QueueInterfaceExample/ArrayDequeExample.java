package com.training.collectionFrameworkExample.QueueInterfaceExample;

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);

        deque.addFirst(50);
        deque.addLast(100);

        System.out.println("ArrayDeque elements:");
        System.out.println(deque);

        System.out.println("Removed element (poll): " + deque.poll());

        System.out.println("After poll:");
        System.out.println(deque);
    }
}