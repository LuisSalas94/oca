package com.oca.javabasics.scope.overlapping;
//* 3 Overlapping Class and Instance Variables
// Java does NOT allow a static (class) variable and an instance variable to have the same name in the same class.

public class MyPhone {
    static boolean softKeyboard = true; // Class variable
    // boolean softKeyboard = false; ❌ ERROR! Class variable and instance variable cannot have the same name.

    public static void main(String[] args) {
        System.out.println("Class Variable: " + MyPhone.softKeyboard);
    }
}
//* 📝 Explanation:
//Java does not allow an instance variable and a class (static) variable to have the same name in the same class.
//The program will not compile if both exist together.