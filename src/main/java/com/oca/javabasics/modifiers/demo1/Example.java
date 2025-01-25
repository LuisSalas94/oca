package com.oca.javabasics.modifiers.demo1;

public class Example {
    /**
     * Restricted to this class
     */
    private int value;

    /**
     * Accessible to subclasses and same package
     */
    protected String name;

    public void display() {
        System.out.println("Hello!");
    }

//    public void myMethod() {
//        private int localVar = 10;
//    }
}
