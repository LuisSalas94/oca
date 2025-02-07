package com.oca.javabasics.data;

public class SignedNumericValues {
    public static void main(String[] args) {
        // Signed Integer Values
        byte smallNumber = -128;     // Minimum value for byte
        short mediumNumber = 32_767; // Using underscore for readability
        int standardNumber = -2_147_483_648; // Minimum value for int
        long largeNumber = 9_223_372_036_854_775_807L; // Long requires 'L' suffix

        // Floating-Point Values
        float pi = 3.14_159F;  // 'F' suffix for float
        double preciseValue = -1.234_567_890_123_456; // Double by default

        // Printing values
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + standardNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + preciseValue);
    }
}
