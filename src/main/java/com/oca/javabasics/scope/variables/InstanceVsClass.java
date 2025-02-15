package com.oca.javabasics.scope.variables;
//* ✅ Class: InstanceVsClass
// Demonstrates the difference between instance and class variables.
public class InstanceVsClass {
    // Instance variable (unique per object)
    int instanceVar = 10;

    // Class variable (shared across all objects)
    static int classVar = 20;

    public static void main(String[] args) {
        // Creating two objects
        InstanceVsClass obj1 = new InstanceVsClass();
        InstanceVsClass obj2 = new InstanceVsClass();

        // Modifying instanceVar (only affects obj1)
        obj1.instanceVar = 50;

        // Modifying classVar (affects all objects)
        obj1.classVar = 100;

        // Checking values
        System.out.println("obj1.instanceVar: " + obj1.instanceVar); // 50
        System.out.println("obj2.instanceVar: " + obj2.instanceVar); // 10

        System.out.println("obj1.classVar: " + obj1.classVar); // 100
        System.out.println("obj2.classVar: " + obj2.classVar); // 100
    }
}
