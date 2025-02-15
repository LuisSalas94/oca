package com.oca.javabasics.scope.local;
//* 4. Block Scope within a Method
//A variable inside a block {} is not accessible outside that block.
//* ✅ Output:
//Inside block: 100
//📝 Explanation: x exists only inside the {} block and cannot be accessed outside it.
public class BlockScope {
    public void showScope() {
        {
            int x = 100;
            System.out.println("Inside block: " + x);
        }
        //!  // System.out.println(x); // ❌ ERROR! 'x' is not accessible outside the bloc
    }

    public static void main(String[] args) {
        BlockScope blockScope = new BlockScope();
        blockScope.showScope();
    }
}
