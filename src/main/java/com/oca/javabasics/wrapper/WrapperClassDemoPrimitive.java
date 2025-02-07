package com.oca.javabasics.wrapper;

public class WrapperClassDemoPrimitive {
    public static void main(String[] args) {
        // Boolean Wrapper Class
        Boolean boolObj = Boolean.TRUE;
        boolean boolValue = boolObj.booleanValue(); // Retrieving boolean primitive
        System.out.println("Boolean value: " + boolValue); // Prints: true

        System.out.println("\n--------------------------------\n");

        // Character Wrapper Class
        Character charObj = 'A';
        char charValue = charObj.charValue(); // Retrieving char primitive
        System.out.println("Character value: " + charValue); // Prints: A

        System.out.println("\n--------------------------------\n");

        // Numeric Wrapper Classes
        Byte byteObj = 10;
        Short shortObj = 100;
        Integer intObj = 1000;
        Long longObj = 10000L;
        Float floatObj = 10.99f;
        Double doubleObj = 99.99;

        // Retrieving primitive values
        byte byteValue = byteObj.byteValue();
        short shortValue = shortObj.shortValue();
        int intValue = intObj.intValue();
        long longValue = longObj.longValue();
        float floatValue = floatObj.floatValue();
        double doubleValue = doubleObj.doubleValue();

        // Printing extracted primitive values
        System.out.println("Byte value: " + byteValue);     // Prints: 10
        System.out.println("Short value: " + shortValue);   // Prints: 100
        System.out.println("Integer value: " + intValue);   // Prints: 1000
        System.out.println("Long value: " + longValue);     // Prints: 10000
        System.out.println("Float value: " + floatValue);   // Prints: 10.99
        System.out.println("Double value: " + doubleValue); // Prints: 99.99

        System.out.println("\n--------------------------------\n");

        // Demonstrating conversion to different types
        Double myDouble = 45.78;
        int convertedInt = myDouble.intValue(); // Converts to int (loses decimal part)
        float convertedFloat = myDouble.floatValue(); // Converts to float

        System.out.println("Converted Double to int: " + convertedInt);  // Prints: 45
        System.out.println("Converted Double to float: " + convertedFloat);  // Prints: 45.78
    }
}
