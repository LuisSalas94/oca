package com.oca.javabasics.operators;

public class OperatorComparison {
    public static void main(String[] args) {
        // **1. Using the Assignment Operator (`=`)**
        int a = 10; // Assigning 10 to variable a
        int b = 20; // Assigning 20 to variable b
        System.out.println("Using = (Assignment Operator):");
        System.out.println(a = b);  // ❌ This will assign b to a and print 20

        boolean b1 = false; // Assigning false to b1
        System.out.println(b1 = true); // ❌ This assigns true to b1 and prints true
        System.out.println(b1 = false); // ❌ This assigns false to b1 and prints false

        // **2. Correct Way: Using the Equality Operator (`==`)**
        System.out.println("\nUsing == (Equality Operator):");
        System.out.println(a == b);  // ✅ This compares a and b, prints false (since a != b)
        System.out.println(b1 == true);  // ✅ This compares b1 and true, prints false (since b1 is false)
        System.out.println(b1 == false);  // ✅ This compares b1 and false, prints true (since b1 is false)

        // **3. Demonstrating Compilation Error for Invalid Comparison**
        // Uncommenting the following line will cause a compilation error:
        // System.out.println(a == b1); // ❌ Error: incomparable types: int and boolean
    }
}
