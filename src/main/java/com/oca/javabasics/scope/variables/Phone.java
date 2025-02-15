package com.oca.javabasics.scope.variables;

//* ✅ Class: Phone
// Defines a class variable (static variable) that is shared across all instances
public class Phone {
    // Class variable shared by all instances of Phone
    static boolean softKeyboard = false;

    public static void main(String[] args) {
        // Accessing class variable using class name
//        System.out.println("Initial value: " + Phone.softKeyboard);
//
//        // Modifying the class variable
//        Phone.softKeyboard = false;
//        System.out.println("Modified value: " + Phone.softKeyboard);
    }
}
