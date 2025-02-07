package com.oca.javabasics.wrapper;

import java.util.ArrayList;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // 1. **Autoboxing**: Primitive value to Wrapper class object
        Integer obj1 = 10;  // Autoboxing from int to Integer
        Double obj2 = 12.67; // Autoboxing from double to Double
        Boolean obj3 = true; // Autoboxing from boolean to Boolean

        // Printing the wrapped objects
        System.out.println("Autoboxed Integer: " + obj1);
        System.out.println("Autoboxed Double: " + obj2);
        System.out.println("Autoboxed Boolean: " + obj3);

        // 2. **Unboxing**: Wrapper class object to Primitive value
        int primitiveInt = obj1;  // Unboxing from Integer to int
        double primitiveDouble = obj2;  // Unboxing from Double to double
        boolean primitiveBoolean = obj3;  // Unboxing from Boolean to boolean

        // Printing the unboxed values
        System.out.println("\nUnboxed int: " + primitiveInt);
        System.out.println("Unboxed double: " + primitiveDouble);
        System.out.println("Unboxed boolean: " + primitiveBoolean);

        // 3. **Autoboxing with Collections (ArrayList)**
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);  // Autoboxing: int value 5 is boxed into Integer
        list.add(10); // Autoboxing: int value 10 is boxed into Integer

        // Accessing the values
        Integer firstValue = list.get(0); // Unboxing: Integer to int when used in arithmetic operation
        Integer secondValue = list.get(1); // Unboxing

        // Performing arithmetic operation with unboxing
        int sum = firstValue + secondValue; // Unboxing during addition

        System.out.println("\nSum of values from ArrayList: " + sum);

        // 4. **Autoboxing and Unboxing in Method Calls**
        printDouble(15.5);  // Autoboxing: double primitive is passed as Double object
        int result = increment(obj1);  // Unboxing: Integer is unboxed to int for incrementing
        System.out.println("\nIncremented value: " + result);

        // 5. **Autoboxing in conditional statements**
        if (obj1 == 10) {  // Autoboxing occurs when comparing Integer with primitive int
            System.out.println("\nobj1 is equal to 10");
        }

        // 6. **NullPointerException with Unboxing**
        try {
            Integer objNull = null;
            int nullUnboxing = objNull;  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("\nCaught NullPointerException during unboxing: " + e);
        }
    }

    // Method that accepts a Double and uses autoboxing
    public static void printDouble(Double d) {
        System.out.println("Received Double value: " + d);
    }

    // Method that increments an Integer and uses unboxing
    public static int increment(Integer obj) {
        return obj + 1;  // Unboxing happens here to perform the addition

    }
}
