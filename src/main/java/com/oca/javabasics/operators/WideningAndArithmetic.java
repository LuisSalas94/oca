package com.oca.javabasics.operators;

public class WideningAndArithmetic {
    public static void main(String[] args) {
        // **1. ASCII Arithmetic with `char`**
        char char1 = 'a'; // ASCII value of 'a' is 97
        System.out.println("Character: " + char1);
        System.out.println("Character + Character: " + (char1 + char1)); // 97 + 97 = 194
        System.out.println("Character - Character: " + (char1 - char1)); // 97 - 97 = 0

        System.out.println("\n------------------------------\n");

        // **2. Implicit Widening of Data Types**
        byte byteValue = 10;
        short shortValue = 20;
        char charValue = 'A'; // ASCII 65

        int resultInt = byteValue + shortValue + charValue;
        System.out.println("Implicit Widening (byte + short + char) to int: " + resultInt); // 10 + 20 + 65 = 95

        long resultLong = byteValue + shortValue + 1000L; // Widened to long
        System.out.println("Implicit Widening (byte + short + long) to long: " + resultLong); // 1030

        float resultFloat = resultInt + 5.5f; // Widened to float
        System.out.println("Implicit Widening (int + float) to float: " + resultFloat); // 95 + 5.5 = 100.5

        double resultDouble = resultFloat + 3.14; // Widened to double
        System.out.println("Implicit Widening (float + double) to double: " + resultDouble); // 100.5 + 3.14 = 103.64

        System.out.println("\n------------------------------\n");

        // **3. Lossy Conversion Error in Arithmetic Operations**
        byte age1 = 10;
        byte age2 = 20;
        // short sum = age1 + age2;  // ❌ Compilation Error: possible lossy conversion from int to short
        int sum = age1 + age2; // ✅ Correct approach
        System.out.println("Correct way: Storing byte addition in int: " + sum); // 10 + 20 = 30

        System.out.println("\n------------------------------\n");

        // **4. Using `final` to allow direct assignment to smaller types**
        final byte finalAge1 = 10;
        final byte finalAge2 = 20;
        short validSum = finalAge1 + finalAge2; // ✅ Allowed because values are known at compile time
        System.out.println("Using final for safe assignment: " + validSum); // 30

        System.out.println("\n------------------------------\n");
    }
}
