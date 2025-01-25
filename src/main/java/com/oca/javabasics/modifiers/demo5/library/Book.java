package com.oca.javabasics.modifiers.demo5.library;

public class Book {
    private void countPages() {
        System.out.println("Counting pages...");
    }

    protected void modifyTemplate() {
        countPages();
    }
}
