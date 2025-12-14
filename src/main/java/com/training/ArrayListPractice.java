package com.training;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Dhanush");
        names.add("Nasir");

        System.out.println("ArrayList after adding elements: " + names);

        // Accessing elements
        System.out.println("First element: " + names.get(0));

        // Removing an element
        names.remove("Alice");
        System.out.println("After removing 'Alice': " + names);


        System.out.println("\nIterating using for-loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nIterating using enhanced for-loop:");
        for (String s : names) {
            System.out.println(s);
        }


        names.add("Gagan");
        names.add("Sujan");

        System.out.println("\nBefore Sorting: " + names);

        // Sorting ArrayList
        Collections.sort(names);
        System.out.println("After Sorting: " + names);

    }
}
