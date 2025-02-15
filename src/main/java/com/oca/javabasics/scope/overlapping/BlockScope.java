package com.oca.javabasics.scope.overlapping;
//* 4. Overlapping Local Variables in Nested Blocks
// A variable inside a block {} is not accessible outside that block.
public class BlockScope {
    public void showScope() {
        {
            int x = 100; // Local variable inside a block
            System.out.println("Inside block: " + x); // ✅ Accessible inside the block
        }
        //! System.out.println(x); // ❌ ERROR! 'x' is not accessible outside the block
    }

    public static void main(String[] args) {
        BlockScope obj = new BlockScope();
        obj.showScope();
    }
}

//* 📝 Explanation:
//x exists only within the {} block and cannot be accessed outside of it.

