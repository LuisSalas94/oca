package com.oca.javabasics.operators;

public class ShortCircuitExample {
    public static void main(String[] args) {
        // Initializing the variables
        int marks = 8;   // Marks starts at 8
        int total = 10;  // Total is set to 10

        // Demonstrating short-circuit AND (&&)
        System.out.println("First evaluation using && (AND operator):");
        // First condition (total < marks) is false, so the second condition (++marks > 5) won't be evaluated
        boolean result1 = total < marks && ++marks > 5;
        System.out.println("Result of 'total < marks && ++marks > 5': " + result1); // Should print false
        System.out.println("Marks after first evaluation: " + marks);  // Marks should still be 8 (not incremented)

        System.out.println("\n-----------------------------\n");

        // Demonstrating short-circuit OR (||)
        System.out.println("Second evaluation using || (OR operator):");
        // First condition (total == 10) is true, so the second condition (++marks > 10) is skipped
        boolean result2 = total == 10 || ++marks > 10;
        System.out.println("Result of 'total == 10 || ++marks > 10': " + result2); // Should print true
        System.out.println("Marks after second evaluation: " + marks);  // Marks should still be 8 (not incremented)

        // Further examples to show short-circuiting with more complex conditions
        System.out.println("\n-----------------------------\n");

        // Evaluating with more complex conditions and short-circuiting behavior
        int score = 15;
        boolean isEligibleForPromotion = (score > 10 && ++marks > 8);  // First part is true, second part should be evaluated
        System.out.println("Is eligible for promotion: " + isEligibleForPromotion); // Should print true
        System.out.println("Marks after evaluating eligibility for promotion: " + marks);  // Marks should be incremented to 9

        System.out.println("\n-----------------------------\n");

        // Reset marks for another test
        marks = 8;

        // Using OR to show how short-circuiting works when the first condition is true
        boolean isJobOfferAccepted = (score > 10 || ++marks > 10);  // First part is true, second part is skipped
        System.out.println("Job offer accepted: " + isJobOfferAccepted); // Should print true
        System.out.println("Marks after evaluating job offer acceptance: " + marks);  // Marks should still be 8 (not incremented)
    }
}
