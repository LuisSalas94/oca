package com.oca.javabasics.operators;

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        // Comparing integer values
        int num1 = 10, num2 = 20;
        System.out.println("num1 > num2: " + (num1 > num2));   // false
        System.out.println("num1 < num2: " + (num1 < num2));   // true
        System.out.println("num1 >= num2: " + (num1 >= num2)); // false
        System.out.println("num1 <= num2: " + (num1 <= num2)); // true
        System.out.println("num1 == num2: " + (num1 == num2)); // false
        System.out.println("num1 != num2: " + (num1 != num2)); // true

        // Comparing floating-point values
        double price1 = 50.5, price2 = 50.5;
        System.out.println("\nprice1 == price2: " + (price1 == price2)); // true
        System.out.println("price1 != price2: " + (price1 != price2)); // false

        // Comparing char values (using ASCII codes)
        char letterA = 'A', letterB = 'B';
        System.out.println("\nletterA < letterB: " + (letterA < letterB)); // true ('A' = 65, 'B' = 66)

        // Invalid comparison (Uncommenting the line below will cause a compilation error)
        // boolean isJavaFun = true;
        // System.out.println(isJavaFun > 5); // ERROR: boolean cannot be compared with int

        // Using relational operators in conditions
        int age = 18;
        if (age >= 18) {
            System.out.println("\nYou are eligible to vote!");
        } else {
            System.out.println("\nYou are NOT eligible to vote.");
        }
    }
}
