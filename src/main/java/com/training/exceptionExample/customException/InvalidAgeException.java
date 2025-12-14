package com.training.exceptionExample.customException;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}
