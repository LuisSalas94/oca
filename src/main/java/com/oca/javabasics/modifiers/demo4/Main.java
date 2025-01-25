package com.oca.javabasics.modifiers.demo4;

import com.oca.javabasics.modifiers.demo4.building.StoryBook;
import com.oca.javabasics.modifiers.demo4.library.CourseBook;

public class Main {
    public static void main(String[] args) {
//        CourseBook courseBook = new CourseBook();
//        courseBook.accessBook();

        StoryBook storyBook = new StoryBook();
        storyBook.readBook();
    }
}
