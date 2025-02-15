package com.oca.javabasics.scope.overlapping;

//* 2 Overlapping Method Parameter and Instance Variable
// When a method parameter has the same name as an instance variable, the method parameter takes precedence.

public class ParameterShadowing {
    String message = "Instance Variable Message"; // Instance variable

    public void showMessage(String message) { // Method parameter with the same name
        System.out.println("Method Parameter: " + message); // ✅ Prints method parameter value
        System.out.println("Instance Variable: " + this.message); // ✅ Using 'this' to access instance variable
    }

    public static void main(String[] args) {
        ParameterShadowing obj = new ParameterShadowing();
        obj.showMessage("Local Method Parameter Message");
    }
}
//* 📝 Explanation:
//The method parameter message shadows the instance variable message inside the method.
//The instance variable can still be accessed using this.message.