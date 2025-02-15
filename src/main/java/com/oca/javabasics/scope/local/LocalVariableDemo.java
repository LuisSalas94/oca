package com.oca.javabasics.scope.local;

//* 1. Local Variables Inside a Method
//Local variables are defined within a method and exist only within that method.
//*  Explanation: The variables a, b, and sum exist only inside the calculateSum() method.
// They cannot be accessed outside it.
public class LocalVariableDemo {
    public void calculateSum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableDemo localVariableDemo = new LocalVariableDemo();
        localVariableDemo.calculateSum();
    }
}
