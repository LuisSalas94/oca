package com.oca.javabasics.wrapper;

public class ParsingDemo {
    public static void main(String[] args) {
        // ✅ 1. Parsing valid string values
        System.out.println("✅ Valid Parsing:");
        int intValue = Integer.parseInt("100");
        double doubleValue = Double.parseDouble("12.34");
        long longValue = Long.parseLong("123456789");
        float floatValue = Float.parseFloat("45.67");
        short shortValue = Short.parseShort("30000");
        byte byteValue = Byte.parseByte("120");

        System.out.println("Parsed Integer: " + intValue);   // 100
        System.out.println("Parsed Double: " + doubleValue); // 12.34
        System.out.println("Parsed Long: " + longValue);     // 123456789
        System.out.println("Parsed Float: " + floatValue);   // 45.67
        System.out.println("Parsed Short: " + shortValue);   // 30000
        System.out.println("Parsed Byte: " + byteValue);     // 120

        // ✅ 2. Boolean Parsing - Special Case
        System.out.println("\n✅ Boolean Parsing:");
        boolean boolTrue1 = Boolean.parseBoolean("true");
        boolean boolTrue2 = Boolean.parseBoolean("TrUe");  // Case insensitive
        boolean boolFalse1 = Boolean.parseBoolean("false");
        boolean boolFalse2 = Boolean.parseBoolean("FaLsE"); // Case insensitive
        boolean boolFalse3 = Boolean.parseBoolean("hello"); // Not "true", returns false

        System.out.println("Boolean (\"true\"): " + boolTrue1);   // true
        System.out.println("Boolean (\"TrUe\"): " + boolTrue2);   // true
        System.out.println("Boolean (\"false\"): " + boolFalse1); // false
        System.out.println("Boolean (\"FaLsE\"): " + boolFalse2); // false
        System.out.println("Boolean (\"hello\"): " + boolFalse3); // false
    }
}
