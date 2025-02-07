package com.oca.javabasics.operators;

public class ComparePrimitives {
    public static void main(String[] args) {
        // **1. Comparing integers using == and !=**
        int a = 10;
        int b = 20;

        // == checks if the values of a and b are equal
        System.out.println("a == b: " + (a == b));  // Prints false (10 is not equal to 20)

        // != checks if the values of a and b are not equal
        System.out.println("a != b: " + (a != b));  // Prints true (10 is not equal to 20)

        System.out.println("\n------------------------------\n");

        // **2. Comparing boolean values using == and !=**
        boolean b1 = false;

        // == checks if b1 is equal to true (b1 is false, so the result is false)
        System.out.println("b1 == true: " + (b1 == true));  // Prints false

        // != checks if b1 is not equal to true (b1 is false, so the result is true)
        System.out.println("b1 != true: " + (b1 != true));  // Prints true

        // == checks if b1 is equal to false (b1 is false, so the result is true)
        System.out.println("b1 == false: " + (b1 == false));  // Prints true

        // != checks if b1 is not equal to false (b1 is false, so the result is false)
        System.out.println("b1 != false: " + (b1 != false));  // Prints false

        System.out.println("\n------------------------------\n");

        // **3. Compilation Error when comparing incompatible types**
        int x = 10;
        boolean b2 = false;

        // The following line will cause a compilation error:
        // System.out.println(x == b2); // ❌ Compilation Error: incomparable types: int and boolean

        // The error occurs because you cannot compare an int with a boolean.
        // Compiler Error: incompatible types: int and boolean

        // Uncommenting the above line will result in the following error:
        // incompatable types: int and boolean
        // System.out.println(x == b2);

        System.out.println("\n------------------------------\n");

        // **EXAM TIP:**
        // The result of a relational operation (== or !=) is always a boolean value.
        // You cannot assign the result of such an operation to variables of types other than boolean,
        // such as char, int, byte, short, long, float, or double.
    }
}
