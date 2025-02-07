package com.oca.javabasics.data;

public class CharExample {
    public static void main(String[] args) {
        // ✅ Correct way to assign a character using single quotes
        char letter = 'A';
        System.out.println("Character assigned using single quotes: " + letter);

        // ❌ Incorrect way - will cause a compilation error
        // char invalidChar = "A"; // Error: Type mismatch, cannot assign String to char

        // ✅ Assigning a Unicode character using u notation
        char unicodeChar = '\u0122'; // Unicode for 'Ģ'
        System.out.println("Character assigned using Unicode: " + unicodeChar);

        // ✅ Assigning an integer value (ASCII/Unicode equivalent)
        char numericChar = 122; // 122 corresponds to 'z'
        System.out.println("Character assigned using an integer value: " + numericChar);

        // ✅ Demonstrating the numeric range (smallest and largest values)
        char minChar = '\u0000'; // Smallest value (null character)
        char maxChar = '\uffff'; // Largest possible Unicode character
        System.out.println("Smallest char value: " + minChar);
        System.out.println("Largest char value: " + maxChar);

        // ❌ Incorrect: Assigning a negative value will cause a compilation error
        // char negativeChar = -122; // Error: char cannot store negative numbers

        // ✅ Casting a negative integer to char (compiles but gives unexpected output)
        char castedChar = (char) -122;
        System.out.println("Casted negative integer to char: " + castedChar);

        // ✅ Using char in mathematical operations (char behaves as an integer)
        char char1 = 'A'; // 'A' has ASCII value 65
        char char2 = 'B'; // 'B' has ASCII value 66
        int sum = char1 + char2; // 65 + 66 = 131
        System.out.println("Sum of 'A' and 'B' (numeric values): " + sum);

        // ✅ Incrementing a char (demonstrating its numeric nature)
        char nextChar = 'A';
        nextChar++; // Increments to 'B'
        System.out.println("Next character after 'A': " + nextChar);
    }
}
