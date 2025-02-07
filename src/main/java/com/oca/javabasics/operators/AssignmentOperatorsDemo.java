package com.oca.javabasics.operators;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {

        // Simple assignment - Slide 1
        int a = 10;
        int b = 5;

        System.out.println("Initial values:");
        System.out.println("a = " + a + ", b = " + b);

        // Shorthand Assignment Operators
        a += b;  // a = a + b
        System.out.println("After a += b: a = " + a);  // a = 15

        a -= b;  // a = a - b
        System.out.println("After a -= b: a = " + a);  // a = 10

        a *= b;  // a = a * b
        System.out.println("After a *= b: a = " + a);  // a = 50

        a /= b;  // a = a / b
        System.out.println("After a /= b: a = " + a);  // a = 10

        a %= b;  // a = a % b
        System.out.println("After a %= b: a = " + a);  // a = 0


        // Valid assignments - Slide 2
        double myDouble = 10.2;  // OK: double can store a decimal value
        int myInt = 10;          // OK: int can store an integer value
        float myFloat = 10.2F;   // OK: float can store a decimal value with F

        System.out.println("\nValid assignments:");
        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);

        // Invalid assignments
        // Uncommenting the below lines will give compile-time errors:
        // double myDouble2 = true;    // Error: boolean cannot be assigned to double
        // boolean b1 = 'c';           // Error: char cannot be assigned to boolean

        // Slide 3: Multiple Assignments
        int x = 7, y = 10, z = 8;
        x = y = z;  // Multiple assignments: z -> y, then y -> x
        System.out.println("\nMultiple assignments:");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);  // All should be 8


        // Slide 4: Assignment with Type Compatibility
        // Assigning a smaller value to a bigger data type (OK)
        int intVal = 1009;
        long longVal = intVal;  // Implicit casting (int to long)
        System.out.println("\nAssigning smaller type (int) to larger type (long):");
        System.out.println("intVal = " + intVal);
        System.out.println("longVal = " + longVal);  // long can hold int values

        // Assigning a larger value to a smaller data type (requires casting)
        // Uncommenting the below line will give a compile-time error:
        // int smallVal = num;  // Error: long cannot be assigned to int directly

        // Example of forced casting from larger to smaller type
        int castedVal = (int) longVal;  // Explicit casting from long to int
        System.out.println("Casted longVal to int: " + castedVal);
    }
}
