package com.training.comparatorAndComparable;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Dhanush");
        arr.add("Sidharth");
        arr.add("Nasir");
        arr.add("Gagan");

        arr.sort(new StringLengthSort());

        System.out.println(arr);
    }
}
