package com.training.comparatorAndComparable;

import java.util.Comparator;

public class StringLengthSort implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(s1.charAt(0) > s2.charAt(0)){
            return 1;
        }
        else{
            return -1;
        }

    }
}
