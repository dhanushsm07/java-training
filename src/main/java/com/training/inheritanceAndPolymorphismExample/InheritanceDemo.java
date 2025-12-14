package com.training.inheritanceAndPolymorphismExample;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.start();
        car1.stop();
        car1.showTypes();
        car1.displayInfo();


        //run-time polymorphism and dynamic method dispatch
        Vehicle v;


        v = new Vehicle();
        v.start();

        v= new Car();
        v.start();
    }
}
