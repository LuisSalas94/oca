package com.oca.javabasics.object.third;
//* Example 1: Object Becomes Inaccessible When Going Out of Scope
//This example illustrates how an object goes out of scope when a local
// variable is declared inside a block.

class Exam {
    String name;

    public Exam(String name) {
        this.name = name;
    }

    public void displayExam() {
        System.out.println("Exam: " + name);
    }
}

public class ScopeExample {
    public static void main(String[] args) {
        System.out.println("Starting method...");

        if (true) {  // This block creates a local variable
            Exam myExam = new Exam("Android");
            myExam.displayExam();
        }  // myExam goes out of scope here

        // Trying to access myExam here would cause a compilation error
        System.out.println("End of method.");
    }
}
//* Explanation:
//Inside the if block, an Exam object is created and assigned to myExam.
//Once the block ends (}), myExam goes out of scope, and the object becomes inaccessible.
//The garbage collector will reclaim the memory occupied by the object since no reference
// to it exists outside the block.