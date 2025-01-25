package com.oca.javabasics.modifiers.demo3.library;

public class Librarian {
    public void manageBooks() {
        Book book = new Book();
        book.author = "Carl Sagan";
        book.modifyTemplate();
        System.out.println("Author: " + book.author);
    }

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.manageBooks();
    }
}
