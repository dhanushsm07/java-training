package com.training.collectionFrameworkExample.QueueInterfaceExample;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue elements:");
        System.out.println(pq);

        System.out.println("Head element (peek): " + pq.peek());
        System.out.println("Removed element (poll): " + pq.poll());

        System.out.println("After poll:");
        System.out.println(pq);
    }
}
