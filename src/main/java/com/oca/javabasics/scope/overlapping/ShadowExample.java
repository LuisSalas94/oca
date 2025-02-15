package com.oca.javabasics.scope.overlapping;
//* 1 Overlapping Instance and Local Variables
// If a local variable has the same name as an instance variable,
// the local variable shadows the instance variable inside that method.
public class ShadowExample {
    int number = 10; // Instance variable

    public void displayNumber() {
        int number = 20; // Local variable with the same name
        System.out.println("Local variable: " + number); // ✅ Prints 20 (local variable takes precedence)
        System.out.println("Instance variable: " + this.number); // ✅ Using 'this' to access the instance variable (prints 10)
    }

    public static void main(String[] args) {
        ShadowExample obj = new ShadowExample();
        obj.displayNumber();
    }
}

//* 📝 Explanation:
//
//The local variable number shadows the instance variable number inside the method.
//The instance variable is still accessible using this.number.
