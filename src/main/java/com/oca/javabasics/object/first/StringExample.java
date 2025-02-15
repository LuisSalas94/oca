package com.oca.javabasics.object.first;
//* 3️⃣ String Object Behavior (String Pool vs. Heap Memory)
//This code demonstrates how String objects behave differently.
//* 🔹 Key Takeaway:
//String literals are stored in the String Pool and are reused.
//Strings created with new are stored in Heap memory separately.
public class StringExample {
    public static void main(String[] args) {
        // String created using a String literal (Stored in String Pool)
        String s1 = "Hello";
        String s2 = "Hello"; // Reuses the same object from the String Pool

        // String created using new keyword (Stored in Heap memory)
        String s3 = new String("Hello");
        // Comparing references
        System.out.println(s1 == s2); // true (Both refer to the same object in String Pool)
        System.out.println(s1 == s3); // false (s3 is a different object in Heap)
    }
}
