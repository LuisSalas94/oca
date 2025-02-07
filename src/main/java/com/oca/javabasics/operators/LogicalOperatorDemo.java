package com.oca.javabasics.operators;

public class LogicalOperatorDemo {
    public static void main(String[] args) {
        // Case 1: Using AND (&&) operator
        int a = 10; // a is initialized to 10
        int b = 20; // b is initialized to 20

        // Using AND (&&) to check if both conditions are true
        // a > 20 is false because a is 10, which is less than 20
        // b > 10 is true because b is 20, which is greater than 10
        // The AND operator returns true only if both conditions are true, so the result is false
        System.out.println(a > 20 && b > 10);
        // Prints false because although b > 10 is true, a > 20 is false. Both must be true for AND to return true.

        // Case 2: Using OR (||) operator
        // Using OR (||) to check if at least one condition is true
        // a > 20 is still false
        // b > 10 remains true
        // The OR operator returns true if at least one of the conditions is true, so the result is true
        System.out.println(a > 20 || b > 10);
        // Prints true because at least one condition (b > 10) is true. Only one condition needs to be true for OR to return true.

        // Case 3: Using NOT (!) operator
        // NOT reverses the boolean outcome of a condition.
        // b > 10 is true because b is 20, which is greater than 10.
        // The NOT operator (!) reverses the result of b > 10, so the result becomes false.
        System.out.println(!(b > 10));
        // Prints false because b > 10 is true, and the NOT operator reverses it.

        // Case 4: Using NOT (!) with a false condition
        // a > 20 is false because a is 10, which is less than 20.
        // The NOT operator (!) reverses the false outcome, so the result becomes true.
        System.out.println(!(a > 20));
        // Prints true because a > 20 is false, and the NOT operator reverses it to true.

        // Case 5: Using NOT (!) with a boolean variable
        boolean isJavaFun = true;  // a boolean variable set to true

        // Using NOT to reverse the boolean value of isJavaFun
        // Since isJavaFun is true, applying NOT will change it to false.
        System.out.println(!isJavaFun);
        // Prints false because isJavaFun is true, and NOT reverses it to false.

        // A final check with multiple conditions
        int x = 15;
        int y = 25;

        // Using AND (&&) to check if both conditions are true
        // x > 10 is true, and y < 30 is true as well
        // Since both are true, the AND operator returns true
        System.out.println(x > 10 && y < 30);
        // Prints true because both conditions are true.

        // Using OR (||) to check if at least one condition is true
        // x > 10 is true, and y < 20 is false.
        // Since at least one condition is true, the OR operator returns true.
        System.out.println(x > 10 || y < 20);
        // Prints true because x > 10 is true.

        // Using NOT (!) with a false condition
        // Checking if x is not greater than 20 (x > 20 is false)
        // Applying NOT reverses the result, so the outcome is true.
        System.out.println(!(x > 20));
        // Prints true because x > 20 is false, and the NOT operator reverses it.
    }
}
