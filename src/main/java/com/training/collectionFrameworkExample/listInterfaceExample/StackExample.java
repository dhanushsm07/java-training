package com.training.collectionFrameworkExample.listInterfaceExample;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Book");
        stack.push("Pen");
        stack.push("Notebook");

        System.out.println("Stack elements:");
        System.out.println(stack);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());

        System.out.println("Stack after pop:");
        System.out.println(stack);
    }
}
