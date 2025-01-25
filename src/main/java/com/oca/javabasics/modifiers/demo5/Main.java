package com.oca.javabasics.modifiers.demo5;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        //book.countPages();
        book.modifyTemplate();

        CourseBook courseBook = new CourseBook();
        courseBook.accessBook();
    }
}

