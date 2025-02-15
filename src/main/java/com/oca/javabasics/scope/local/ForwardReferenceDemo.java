package com.oca.javabasics.scope.local;

//* 5. Local Variables and Forward References
//Java does not allow forward references to local variables. This means you must declare a variable before using it.
//* ✅ Output:
//a: 20
//
//📝 Explanation:
//Java does not allow referencing a variable before it’s declared. If you try, the code won’t compile.
public class ForwardReferenceDemo {
    public void incorrectUsage() {
        // int a = b; // ❌ ERROR! 'b' is not declared yet
        int b = 20;
        int a = b; // ✅ This works because 'b' is declared before use
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        ForwardReferenceDemo forwardReferenceDemo = new ForwardReferenceDemo();
        forwardReferenceDemo.incorrectUsage();
    }
}
