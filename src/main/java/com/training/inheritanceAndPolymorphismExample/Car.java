package com.training.inheritanceAndPolymorphismExample;

public class Car extends Vehicle{

    public String type = "Car";

    @Override
    void start(){
        System.out.println("Car started");
    }

    @Override
    void stop(){
        System.out.println("Car stopped");
    }

    void showTypes(){
        System.out.println("This is parent type : " + super.type);
        System.out.println("This is child class : " + type);
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("This is a car");
    }
}
