package com.oca.javabasics.identifiers;

public class IdentifierDemo {
    // Valid variable names
    int examTotal = 100;  // Camel case
    int _score = 90;      // Underscore allowed
    int $price = 50;      // Dollar sign allowed
    int value123 = 10;    // Digits allowed (not at the start)
    int ₹currency = 200;  // Unicode characters like currency symbols allowed

    // Invalid Identifiers (Uncommenting these will cause compilation errors)
    // int 1stValue = 10;   // Cannot start with a digit
    // int exam-Total = 90; // Hyphens are not allowed
    // int class = 5;       // Cannot use Java reserved keywords
    // int @name = 20;      // Special characters (except _ and $) are not allowed

    public static void main(String[] args) {
        IdentifierDemo obj = new IdentifierDemo();
        System.out.println("Exam Total: " + obj.examTotal);
        System.out.println("Score: " + obj._score);
        System.out.println("Price: " + obj.$price);
        System.out.println("Value: " + obj.value123);
        System.out.println("Currency: " + obj.₹currency);
    }
}
