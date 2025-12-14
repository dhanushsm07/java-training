package com.training.exceptionExample.customException;

public class CustomExceptionDemo {
    public static void validateAge(int age){
        if(age < 18){
            throw new InvalidAgeException("Age is below 18 so it is invalid");
        }
        System.out.println("Age verified successfully.");

    }
    public static void main(String[] args) {
        try {
            validateAge(19);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Exec");
    }
}
