package com.oca.javabasics.object.first;
//* 4️⃣ Unreferenced Objects & Garbage Collection
//This demonstrates objects becoming unreferenced and eligible for GC.
//* 🔹 Key Takeaway:
//"Tesla" and "BMW" objects become unreferenced and are eligible for GC.
//Calling System.gc(); requests garbage collection, but execution is not guaranteed.
public class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void showModel() {
        System.out.println("Car model: " + model);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collector is running! Cleaning up: " + model);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        car1 = new Car("Audi"); // "Tesla" object is now unreferenced
        car2 = null; // "BMW" object is now unreferenced

        // Requesting garbage collection (execution not guaranteed)
        System.gc();
    }
}


