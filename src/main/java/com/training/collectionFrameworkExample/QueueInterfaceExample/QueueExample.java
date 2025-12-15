package com.training.collectionFrameworkExample.QueueInterfaceExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(20);
        queue.offer(19);
        queue.offer(12);

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
