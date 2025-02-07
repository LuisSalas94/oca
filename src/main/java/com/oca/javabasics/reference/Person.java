package com.oca.javabasics.reference;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " , Age: " + age);
    }

    public static void main(String[] args) {
        /*
        * new Person("Maria", 22);
        * Allocates memory for an object of type Person.
        * Calls Person(String name, int age) constructor.
        * Assigns "Alice" to name and 25 to age.
        * Returns the memory address, stored in person1.
        */
        Person person1 = new Person("Maria", 22);
        System.out.println("Person 1 details");
        person1.displayInfo();
    }
}
