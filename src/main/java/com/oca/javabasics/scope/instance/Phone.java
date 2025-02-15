package com.oca.javabasics.scope.instance;

// 📌 Phone class representing a phone with an instance variable.
public class Phone {
    // 📝 Instance Variable: This belongs to the object and persists as long as the object exists.
    private boolean tested;

    // ✅ Method to set the tested value
    public void setTested(boolean val) {
        tested = val;  // Instance variable 'tested' is accessible within this method.
    }

    // ✅ Method to get the tested value
    public boolean isTested() {
        return tested;  // Instance variable 'tested' is also accessible here.
    }

    // 📌 Main class to demonstrate the behavior of instance variables
    public static void main(String[] args) {
        // ✅ Creating a Phone object
        Phone myPhone = new Phone();

        // ✅ Setting the tested status using an instance method
        myPhone.setTested(true);

        // ✅ Checking the tested status
        System.out.println("Is the phone tested? " + myPhone.isTested());
        // 📝 Expected Output: Is the phone tested? true
    }
}

//* 📌 Explanation
//What is an Instance Variable?
//
//An instance variable is declared inside a class but outside any method.
//It is associated with an object, not with a specific method.
//Exists as long as the object exists and is accessible to all instance methods in the class.
//Scope of Instance Variable
//
//The instance variable tested is accessible across all instance methods (setTested() and isTested()).
//Unlike local variables, it is not lost when the method ends.
//Cannot be accessed directly from main() (because it is private).
//InstanceVariableDemo Class
//
//A Phone object (myPhone) is created.
//The instance variable tested is set using setTested(true).
//The value of tested is retrieved using isTested().