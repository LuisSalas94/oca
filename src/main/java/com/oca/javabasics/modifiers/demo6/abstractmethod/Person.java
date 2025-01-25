package com.oca.javabasics.modifiers.demo6.abstractmethod;

abstract class Person {
    private String name;

    /**
     * Regular method with an empty body
     */
    public void displayName() {
    }

    /**
     * Abstract method with no body
     */
    public abstract void perform();
}
