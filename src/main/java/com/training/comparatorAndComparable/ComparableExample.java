package com.training.comparatorAndComparable;

import java.util.ArrayList;

public class ComparableExample implements Comparable<ComparableExample>{

    String value;

    public ComparableExample(String value){
        this.value = value;
    }

    @Override
    public int compareTo(ComparableExample e1) {
        return this.value.length() - e1.value.length();
    }

    @Override
    public String toString(){
        return value;
    }

    public static void main(String[] args) {
        ArrayList<ComparableExample> arr = new ArrayList<>();

        arr.add(new ComparableExample("Dhanush"));
        arr.add(new ComparableExample("Sidharth"));
        arr.add(new ComparableExample("Nasir"));
        arr.add(new ComparableExample("Gagan"));

        arr.sort(null);

        System.out.println(arr);
    }
}
