package com.oca.javabasics.object.first;
//* 1️⃣ Object Creation & Reference Assignment
//This demonstrates declaring vs. initializing a reference variable.
//* Person person1; declares a reference variable (but no object is created).
//person1 = new Person("Alice"); creates an object and assigns it to person1.
public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Person's name: " + name);
    }

    public static void main(String[] args) {
        // Declaring a reference variable (No object created yet)
        Person person1;

        // Initializing the reference variable with a new object
        person1 = new Person("Alice");

        // Using the object through its reference
        person1.display();
    }

}

