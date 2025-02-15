package com.oca.javabasics.scope.method;
//* Class Definition
//The following class models a Phone object and demonstrates method parameters:
//
//A method setTested(boolean val) accepts a method parameter val and assigns it to an instance variable.
//A method isTested() attempts to access val (which is not allowed).
//A method showScope(int num) compares method parameters, local variables, and loop variables.

//* Key Observations:
//The method parameter val is only accessible within setTested().
//Trying to use val in isTested() would cause a compilation error.
public class Phone {
    private boolean tested; // Instance variable

    // Method with a parameter
    public void setTested(boolean val) {
        // 'val' is a method parameter, accessible only within this method
        tested = val;
        System.out.println("Inside setTested: tested = " + tested);
    }

    // Method attempting to use 'val' (which is NOT valid)
    public boolean isTested() {
        // The following line would cause a compilation error because 'val' is not accessible here:
        // val = false;  // ❌ Compilation Error: 'val' cannot be found
        return tested;
    }
}
