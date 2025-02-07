package com.oca.javabasics.reference;

class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }
}

public class ReferenceVsPrimitive {
    public static void main(String[] args) {
        // Primitive variable (stores actual value)
        int a = 77;

        // Object reference variable (stores memory address of object)
        Human human1 = new Human("Linda");

        // Printing primitive and reference values
        System.out.println("Primitive variable a: " + a);  // Direct value
        System.out.println("Human object reference: " + human1); // Memory address

        // Creating another reference variable pointing to the same object
        Human human2 = human1;

        // Modifying the object through second reference
        human2.name = "Sofia";

        // Checking the values again
        System.out.println("Updated name via human1: " + human1.name);
        System.out.println("Updated name via human2: " + human2.name);

        // Changing primitive variable
        int b = a;
        b = 99;
        System.out.println("Original primitive variable a: " + a); // 77 (unchanged)
        System.out.println("New primitive variable b: " + b); // 99 (separate copy)
    }
}
