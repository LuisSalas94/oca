package com.oca.javabasics.operators;

public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        // Example 1: Basic usage of prefix and postfix increment
        int a = 5;
        int b = ++a;  // Prefix: a increments first, then assigned to b
        System.out.println("Prefix Increment: a = " + a + ", b = " + b); // a=6, b=6

        int x = 5;
        int y = x++;  // Postfix: x is assigned first, then incremented
        System.out.println("Postfix Increment: x = " + x + ", y = " + y); // x=6, y=5

        // Example 2: Prefix and postfix in expressions
        int p = 10;
        int q = 20;
        int result1 = ++p + q--; // p increments first, q used before decrementing
        System.out.println("Expression Result 1: p = " + p + ", q = " + q + ", result1 = " + result1);
        // Output: p=11, q=19, result1=31

        // Example 3: Complex Expression Evaluation
        int m = 10;
        m = m++ + m + m-- - m-- + ++m;
        System.out.println("Complex Expression Result: m = " + m);
        // Breakdown:
        // m = 10 (post-increment: m becomes 11 after usage)
        //   + 11
        //   + 11 (post-decrement: m becomes 10 after usage)
        //   - 10 (post-decrement: m becomes 9 after usage)
        //   + 10 (pre-increment: m becomes 10 before usage)
        // Expected Output: m = 32

        // Example 4: Decrement operators
        int d = 10;
        System.out.println("Before decrement: d = " + d);
        System.out.println("Prefix Decrement (--d): " + --d); // d decrements first, then prints
        System.out.println("Postfix Decrement (d--): " + d--); // d prints first, then decrements
        System.out.println("After both decrements: d = " + d);
    }
}
