package com.oca.javabasics.scope.overlapping;
//* Comparing Variable Lifetimes
// This example demonstrates how local, instance, and class variables have different lifetimes.
public class VariableLifetime {
    static String classVar = "Class Variable"; // Exists for the entire program
    String instanceVar = "Instance Variable"; // Exists as long as the object exists

    public void showVariables(String methodParam) { // Method parameter exists only during method execution
        String localVar = "Local Variable"; // Exists only inside this method
        System.out.println(methodParam); // ✅ Accessible inside the method
        System.out.println(localVar); // ✅ Accessible inside the method
        System.out.println(instanceVar); // ✅ Accessible throughout the object's life
        System.out.println(classVar); // ✅ Accessible throughout the program
    }

    public static void main(String[] args) {
        VariableLifetime obj = new VariableLifetime();
        obj.showVariables("Method Parameter Value");
    }
}
//* 📝 Explanation:
//Local variables exist only inside the method.
//Method parameters disappear after the method execution ends.
//Instance variables exist as long as the object exists.
//Class (static) variables persist as long as the class is loaded in memory.