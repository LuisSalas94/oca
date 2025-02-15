package com.oca.javabasics.scope.local;
//* 3. Local Variables in Loops
//A variable declared inside a loop is accessible only inside that loop.
//* 📝 Explanation: The variable i exists only inside the loop. If you try to access it outside the loop, the code won’t compile.
public class LoopScope {
    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        //! System.out.println(i); // ❌ ERROR! 'i' is not accessible outside the loop
    }

    public static void main(String[] args) {
        LoopScope loopScope = new LoopScope();
        loopScope.printNumbers();
    }
}
