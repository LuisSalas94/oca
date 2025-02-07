package com.oca.javabasics.operators;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        // Declare and initialize variables
        int int1 = 10, int2 = 20, int3 = 30;

        // Expression with multiple operators (modulus, multiplication, division, and addition)
        // The precedence order is evaluated as: (((int1 % int2) * int3)) + (int1 / int2)
        System.out.println("Expression 1 result: " + (int1 % int2 * int3 + int1 / int2)); // Expected output: 300
        // Breakdown: ((10 % 20) * 30) + (10 / 20)
        //            = (10 * 30) + 0
        //            = 300

        // Expression with parentheses to change the order of operations
        // Parentheses change the precedence to: (int1 % int2 * (int3 + int1)) / int2
        System.out.println("Expression 2 result: " + (int1 % int2 * (int3 + int1) / int2)); // Expected output: 20
        // Breakdown: (10 % 20 * (30 + 10)) / 20
        //            = (10 * 40) / 20
        //            = 400 / 20
        //            = 20

        // More complex expression with parentheses to prioritize different operations
        System.out.println("Expression 3 result: " + ((int1 % int2) * (int3 + int1) / int2)); // Expected output: 20
        // Breakdown: (10 % 20) * (30 + 10) / 20
        //            = (10 * 40) / 20
        //            = 400 / 20
        //            = 20
    }
}
