package com.oca.javabasics.object.second;
//1* Object Accessibility
//This example shows how an object can be accessed through its reference variable
// and how setting the reference to null makes the object inaccessible.
//* Explanation:
//1️⃣ myBook is a reference variable pointing to an object of Book.
//2️⃣ The object’s method setTitle() is called using myBook.
//3️⃣ The reference is set to null, making the object inaccessible.
class Book {
    String title;

    void setTitle(String newTitle) {
        title = newTitle;
    }

    void displayTitle() {
        System.out.println("Book title: " + title);
    }
}

public class ObjectAccess {
    public static void main(String[] args) {
        Book myBook = new Book();  // Object created
        myBook.setTitle("Java Programming");  // Accessing object method
        myBook.displayTitle();

        myBook = null;  // Object becomes inaccessible
        // myBook.displayTitle();  // This would cause a NullPointerException
    }
}
