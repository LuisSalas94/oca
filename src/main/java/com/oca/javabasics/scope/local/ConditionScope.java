package com.oca.javabasics.scope.local;
//* 2. Local Variables in Conditional Statements
//Local variables inside if-else or loops are only available within that block.
//* 📝 Explanation:
//Each message variable exists only inside its respective block. If you try to access it outside the if-else block, you'll get a compilation error.
public class ConditionScope {
    public void checkNumber(int num) {
        if (num > 0) {
            String message = "Positive number";
            System.out.println(message);
        } else {
            String message = "Non-Positive number";
            System.out.println(message);
        }
        //! System.out.println(message); ❌ ERROR! 'message' is not accessible here
    }

    public static void main(String[] args) {
        ConditionScope conditionScope = new ConditionScope();
        conditionScope.checkNumber(5);
        conditionScope.checkNumber(-2);
    }

}
