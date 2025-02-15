package com.oca.javabasics.scope.variables;

//* ✅ Class: AccessByObject
// Demonstrates that modifying a static variable through one object affects all objects.
public class AccessByObject {
    public static void main(String[] args) {
        // Creating two objects of Phone
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        // Checking initial values using objects
        System.out.println("p1: " + p1.softKeyboard); // false
        System.out.println("p2: " + p2.softKeyboard); // false

        // Modifying the variable using p1
        p1.softKeyboard = true;

        // Checking values again after modification
        System.out.println("p1: " + p1.softKeyboard); // true
        System.out.println("p2: " + p2.softKeyboard); // true


    }
}
