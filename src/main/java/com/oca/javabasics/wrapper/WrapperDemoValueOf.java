package com.oca.javabasics.wrapper;

public class WrapperDemoValueOf {
    public static void main(String[] args) {
        // Using valueOf() method
        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2);  // Prints true: Same cached object

        // Using constructor
        Long var3 = new Long(223);
        Long var4 = new Long(223);
        System.out.println(var3 == var4);  // Prints false: Different objects

        // Exploring caching behavior
        Integer var5 = Integer.valueOf(100);  // Cached
        Integer var6 = Integer.valueOf(100);  // Cached
        System.out.println(var5 == var6);     // Prints true: Same cached object

        // For values outside of the cached range
        Integer var7 = Integer.valueOf(128);  // New object
        Integer var8 = Integer.valueOf(128);  // New object
        System.out.println(var7 == var8);     // Prints false: Different objects
    }
}
