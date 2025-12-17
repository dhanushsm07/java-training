package com.training.stringsExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegexExample {
    public static void main(String[] args) {

        // Sample input
        String email = "test@example.com";

        // Regex pattern for a simple email format
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Step 1: Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Step 2: Match the pattern with input
        Matcher matcher = pattern.matcher(email);

        // Step 3: Print result
        if (matcher.matches()) {
            System.out.println(email + " is a VALID email.");
        } else {
            System.out.println(email + " is NOT a valid email.");
        }
    }
}
