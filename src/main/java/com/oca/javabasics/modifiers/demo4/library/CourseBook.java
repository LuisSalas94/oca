package com.oca.javabasics.modifiers.demo4.library;

public class CourseBook {
    public void accessBookDetails() {
        Book book = new Book();
        book.issueCount = 10;
        book.issueHistory();
    }
}
