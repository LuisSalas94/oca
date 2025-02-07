package com.oca.javabasics.data;

public class FloatingPointDemo {
    public static void main(String[] args) {

        // ✅ Correct usage of float and double
        float piApprox = 3.1415F;       // 'F' is required for float
        float gravity = 9.81f;          // 'f' (lowercase) is also valid
        double precisePi = 3.141592653589793;  // More precision than float
        double goldenRatio = 1.61803398875;   // High precision stored in double

        // ✅ Using Scientific Notation
        double speedOfLight = 2.998E8;   // 2.998 × 10^8 = 299,800,000
        float atomSize = 5.3E-11F;       // 5.3 × 10^-11 (very small number)

        // ✅ Using underscores for readability (Java 7+)
        float largeFloat = 123_456.789F;
        double largeDouble = 1_000_000.000_123;

        // 🚨 INVALID Examples (Will cause compilation errors)
        // float invalidFloat = 100._48F;  // ❌ Can't have underscore next to decimal point
        // double invalidDouble = 100_.87; // ❌ Can't place underscore before/after decimal point
        // double wrongUnderscore = 100.87_D; // ❌ Can't place underscore before 'D' or 'F'

        // ✅ Printing values
        System.out.println("Approximate Pi (float): " + piApprox);
        System.out.println("Precise Pi (double): " + precisePi);
        System.out.println("Golden Ratio: " + goldenRatio);
        System.out.println("Speed of Light: " + speedOfLight);
        System.out.println("Atom Size: " + atomSize);
        System.out.println("Large Float: " + largeFloat);
        System.out.println("Large Double: " + largeDouble);
    }
}
