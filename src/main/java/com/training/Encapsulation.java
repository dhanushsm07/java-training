package com.training;

public class Encapsulation {

    private String name;
    private int age;

    //setters and getters
    public String getName(){
        return this.name;
    }

    public void setName(String name1){
        this.name = name1;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age1){
        this.age = age1;
    }

    public static void main(String args[]){
        Encapsulation s1 = new Encapsulation();

        s1.setName("Dhanush");
        s1.setAge(21);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
