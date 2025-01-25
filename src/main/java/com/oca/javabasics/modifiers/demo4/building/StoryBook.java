package com.oca.javabasics.modifiers.demo4.building;

import com.oca.javabasics.modifiers.demo4.library.Book;

public class StoryBook {
    public void readBook() {
        Book book = new Book();
//        book.issueCount = 3;
//        book.issueHistory();
        System.out.println("StoryBook cannot access default members of Book.");
    }
}
