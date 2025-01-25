package com.oca.javabasics.modifiers.demo6.abstractclass;

abstract class Person {
    private String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public abstract void role();
}
