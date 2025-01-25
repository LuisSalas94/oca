package com.oca.javabasics.packages.imports;

public class StaticDemo {
    public static int instanceCount = 0;

    public StaticDemo() {
        instanceCount++;
    }

    public static void displayCount() {
        System.out.println("Total instances created: " + instanceCount);
    }
}
