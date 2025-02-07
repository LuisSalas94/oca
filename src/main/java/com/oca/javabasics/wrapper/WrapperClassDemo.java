package com.oca.javabasics.wrapper;

public class WrapperClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Creating Wrapper Class Objects ===\n");

        // ✅ 1. Assignment (Autoboxing) 🪄
        Boolean bool1 = true;
        Character char1 = 'A';
        Byte byte1 = 10;
        Short short1 = 100;
        Integer int1 = 500;
        Long long1 = 1000L;
        Float float1 = 10.5f;
        Double double1 = 99.99;

        System.out.println("Autoboxing examples:");
        System.out.println("Boolean: " + bool1);
        System.out.println("Character: " + char1);
        System.out.println("Byte: " + byte1);
        System.out.println("Short: " + short1);
        System.out.println("Integer: " + int1);
        System.out.println("Long: " + long1);
        System.out.println("Float: " + float1);
        System.out.println("Double: " + double1);

        System.out.println("\n------------------------------\n");

        // ✅ 2. Using Wrapper Class Constructors (Deprecated) 🚨
        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('B');
        Byte byte2 = new Byte((byte) 20);
        Short short2 = new Short((short) 200);
        Integer int2 = new Integer(1000);
        Long long2 = new Long(2000L);
        Float float2 = new Float(20.5f);
        Double double2 = new Double(199.99);

        System.out.println("Constructor examples:");
        System.out.println("Boolean: " + bool2);
        System.out.println("Character: " + char2);
        System.out.println("Byte: " + byte2);
        System.out.println("Short: " + short2);
        System.out.println("Integer: " + int2);
        System.out.println("Long: " + long2);
        System.out.println("Float: " + float2);
        System.out.println("Double: " + double2);

        System.out.println("\n🚨 Note: Wrapper class constructors are deprecated in Java 9+ 🚨");

        System.out.println("\n------------------------------\n");

        // ✅ 3. Using `valueOf()` (Best Practice) 📌
        Boolean bool3 = Boolean.valueOf(true);
        Character char3 = Character.valueOf('C');
        Byte byte3 = Byte.valueOf((byte) 30);
        Short short3 = Short.valueOf((short) 300);
        Integer int3 = Integer.valueOf(2000);
        Long long3 = Long.valueOf(3000L);
        Float float3 = Float.valueOf(30.5f);
        Double double3 = Double.valueOf(299.99);

        System.out.println("Using valueOf() method:");
        System.out.println("Boolean: " + bool3);
        System.out.println("Character: " + char3);
        System.out.println("Byte: " + byte3);
        System.out.println("Short: " + short3);
        System.out.println("Integer: " + int3);
        System.out.println("Long: " + long3);
        System.out.println("Float: " + float3);
        System.out.println("Double: " + double3);

        System.out.println("\n✅ `valueOf()` is the recommended way to create wrapper objects!\n");

        System.out.println("\n------------------------------\n");

        // ✅ Creating Wrapper Objects from Strings
        Boolean boolFromString = Boolean.valueOf("TrUe"); // Case-insensitive
        Byte byteFromString = Byte.valueOf("40");
        Short shortFromString = Short.valueOf("400");
        Integer intFromString = Integer.valueOf("5000");
        Long longFromString = Long.valueOf("6000");
        Float floatFromString = Float.valueOf("40.5");
        Double doubleFromString = Double.valueOf("399.99");

        System.out.println("Creating wrapper objects from Strings:");
        System.out.println("Boolean: " + boolFromString);
        System.out.println("Byte: " + byteFromString);
        System.out.println("Short: " + shortFromString);
        System.out.println("Integer: " + intFromString);
        System.out.println("Long: " + longFromString);
        System.out.println("Float: " + floatFromString);
        System.out.println("Double: " + doubleFromString);

        System.out.println("\n🚨 Reminder: Character class doesn't have a constructor that accepts a String! 🚨");
    }
}
