package com.oca.javabasics.wrapper;

import java.util.HashMap;

public class WrapperEquality {
    public static void main(String[] args) {
        // Using equals() with same wrapper type
        Integer int1 = 100;
        Integer int2 = 100;
        System.out.println("int1.equals(int2): " + int1.equals(int2)); // ✅ true (Same value)

        // Using == with cached values (-128 to 127)
        System.out.println("int1 == int2: " + (int1 == int2)); // ✅ true (Same cached object)

        // Using == with values outside cache range
        Integer int3 = 200;
        Integer int4 = 200;
        System.out.println("int3 == int4: " + (int3 == int4)); // ❌ false (Different objects)

        // Using equals() with different wrapper types
        Integer obj1 = 100;
        Short obj2 = 100;
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // ❌ false (Different types)

        // Uncommenting the line below will cause a compilation error
        // System.out.println(obj1 == obj2); // ❌ Compilation Error

        // HashMap demonstration (uses hashCode() and equals())
        HashMap<Integer, String> map = new HashMap<>();
        map.put(int1, "One Hundred");
        System.out.println("HashMap value for key 100: " + map.get(100)); // ✅ Retrieves value
    }
}
