package com.oca.javabasics.data;

public class UnderscoreRules {
    public static void main(String[] args) {
        // ✅ Valid Use of Underscores
        int decimalValue = 1_000_000;  // Improves readability
        long hexValue = 0x1A_BC_12L;   // Hexadecimal with underscores
        int binaryValue = 0b1010_1011; // Binary format with underscores
        float pi = 3.14_159F;          // Underscore in floating-point values

        // 🚫 Invalid Usages (Uncommenting these will cause compilation errors)
        // int invalidStart = _1000;      // ❌ Cannot start with an underscore
        // int invalidEnd = 1000_;        // ❌ Cannot end with an underscore
        // int invalidHex = 0x_ABCD;      // ❌ Cannot place an underscore after 0x
        // int invalidBinary = 0b_1010;   // ❌ Cannot place an underscore after 0b
        // long invalidLong = 1234_L;     // ❌ Cannot place an underscore before 'L'

        // Printing valid values
        System.out.println("Decimal: " + decimalValue);
        System.out.println("Hexadecimal: " + hexValue);
        System.out.println("Binary: " + binaryValue);
        System.out.println("Float: " + pi);
    }
}
