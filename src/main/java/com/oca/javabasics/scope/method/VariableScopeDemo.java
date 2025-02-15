package com.oca.javabasics.scope.method;

//* Comparing Method Parameters, Local Variables, and Loop Variables
//The following method shows how different types of variables behave in terms of scope:

//*  Scope Breakdown:
//Method Parameter (num)
//Exists throughout the method showScope().
//Local Variable (localVar)
//Exists only within showScope() and is not accessible outside it.
//Loop Variable (loopVar)
//Exists only inside the loop block and cannot be accessed outside the loop.
//Attempting to access loopVar outside the loop will cause a compilation error.

public class VariableScopeDemo {
    public void showScope(int num) {
        // 'num' is a method parameter, exists throughout this method
        int localVar = 100; // Local variable, exists only inside this method

        for (int i = 0; i < 3; i++) {
            int loopVar = i * num; // Loop variable, exists only inside the loop
            System.out.println("Loop iteration " + i + ": loopVar = " + loopVar);
        }

        // System.out.println(loopVar); // ❌ Compilation Error: 'loopVar' is out of scope
    }
}
