package com.oca.javabasics.wrapper;

public class WrapperComparison {
    public static void main(String[] args) {
        // Comparing Integer values within cached range (-128 to 127)
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b: " + (a == b));      // true (same cached object)
        System.out.println("a.equals(b): " + a.equals(b)); // true (values are equal)

        // Comparing Integer values outside cached range
        Integer x = 200;
        Integer y = 200;
        System.out.println("x == y: " + (x == y));      // false (different objects)
        System.out.println("x.equals(y): " + x.equals(y)); // true (values are equal)

        // Boolean caching
        Boolean bool1 = Boolean.TRUE;
        Boolean bool2 = Boolean.valueOf(true);
        System.out.println("bool1 == bool2: " + (bool1 == bool2)); // true (same cached object)

        // Character caching (0-127 is cached)
        Character char1 = 100;
        Character char2 = 100;
        System.out.println("char1 == char2: " + (char1 == char2)); // true (cached)

        Character char3 = 200;
        Character char4 = 200;
        System.out.println("char3 == char4: " + (char3 == char4)); // false (not cached)

        // Using new Integer() - always creates a new object
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println("i1 == i2: " + (i1 == i2)); // ❌ false (Different objects)

        // Using Integer.valueOf() - uses cached object for 10
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        System.out.println("i3 == i4: " + (i3 == i4)); // ✅ true (Same cached object)

        // Autoboxing - same as Integer.valueOf(10)
        Integer i5 = 10;
        Integer i6 = 10;
        System.out.println("i5 == i6: " + (i5 == i6)); // ✅ true (Same cached object)

        // Outside cache range (e.g., 200) - creates new objects
        Integer i7 = Integer.valueOf(200);
        Integer i8 = Integer.valueOf(200);
        System.out.println("i7 == i8: " + (i7 == i8)); // ❌ false (New objects)

        // But .equals() still works correctly
        System.out.println("i7.equals(i8): " + i7.equals(i8)); // ✅ true (Same value)
    }
}
