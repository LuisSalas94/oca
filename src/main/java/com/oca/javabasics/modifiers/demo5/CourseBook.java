package com.oca.javabasics.modifiers.demo5;

public class CourseBook {
    public void accessBook() {
        Book book = new Book();
        book.modifyTemplate();
        System.out.println("Accessed public method of Book, but not private members");
    }

}
