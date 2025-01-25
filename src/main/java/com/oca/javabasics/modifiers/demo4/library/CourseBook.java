package com.oca.javabasics.modifiers.demo4.library;

public class CourseBook {
    public void accessBook() {
        Book book = new Book();
        book.issueCount = 5;
        book.issueHistory();
        System.out.println("CourseBook accessed issueCount: " + book.issueCount
        );
    }
}
