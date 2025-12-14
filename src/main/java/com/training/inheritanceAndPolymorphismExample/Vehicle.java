package com.training.inheritanceAndPolymorphismExample;

public class Vehicle {
    public String type = "Generic class";

    void start(){
        System.out.println("Vehicle has started");
    }

    void stop(){
        System.out.println("Vehicle Stopped");
    }

    void displayInfo() {
        System.out.println("This is a Vehicle");
    }
}
