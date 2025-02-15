package com.oca.javabasics.object.second;
//* Example 3: Garbage Collection & Finalization
//This example demonstrates how garbage collection works when objects become unreferenced.
//* Explanation:
//1️⃣ Two Phone objects ("Samsung" and "Apple") are created.
//2️⃣ p1 is set to null, making "Samsung" unreachable.
//3️⃣ p2 is reassigned to a new "Google" object, making "Apple" unreachable.
//4️⃣ The garbage collector may run, calling finalize() on unreferenced objects.
class Phone {
    String brand;

    Phone(String brand) {
        this.brand = brand;
    }

    @Override
    protected void finalize() {
        System.out.println(brand + " is being garbage collected!");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung");
        Phone p2 = new Phone("Apple");

        p1 = null;  // Samsung object is now unreachable
        p2 = new Phone("Google");  // Apple object is now unreachable

        System.gc();  // Requesting garbage collection (not guaranteed to run immediately)
    }
}
