package com.oca.javabasics.object.second;
//2* Object Reassignment & Losing References
//This example shows what happens when a reference variable is reassigned
// to a new object, making the previous object eligible for garbage collection.
class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void showModel() {
        System.out.println("Car model: " + model);
    }
}

public class ObjectReassignment {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // First object created
        myCar.showModel();

        myCar = new Car("Honda");  // Reassigning reference to a new object
        myCar.showModel();

        // The first "Toyota" object is now unreachable and eligible for garbage collectio
    }
}
