package com.oca.javabasics.modifiers.demo3.building;

import com.oca.javabasics.modifiers.demo3.library.Book;

public class StoryBook extends Book {
    public void accessProtectedMembers() {
        this.author = "George Orwell";
        this.modifyTemplate();
        System.out.println("Author: " + this.author);
    }

    public static void main(String[] args) {
        StoryBook storyBook = new StoryBook();
        storyBook.accessProtectedMembers();

    }

}
