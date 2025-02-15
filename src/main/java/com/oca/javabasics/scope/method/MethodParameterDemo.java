package com.oca.javabasics.scope.method;

public class MethodParameterDemo {
    public static void main(String[] args) {
        // Creating an object of Phone class
        Phone obj = new Phone();

        // Using a method parameter to pass a value
        obj.setTested(true);

        // Calling method that returns boolean
        System.out.println("Is tested? " + obj.isTested());

        // Creating an object of VariableScopeDemo
        VariableScopeDemo scopeObj = new VariableScopeDemo();

        // Calling a method to show scope of parameters, local, and loop variables
        scopeObj.showScope(3);
    }
}
