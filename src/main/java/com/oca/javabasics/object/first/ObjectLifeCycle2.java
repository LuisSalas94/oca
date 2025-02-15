package com.oca.javabasics.object.first;
//* 2️⃣ Difference Between Object Creation and Reference Initialization
//This example demonstrates that declaring a reference variable does not create an object.
//* 🔹 Key Takeaway:
//A reference variable alone does not create an object.
//person = new Person("Bob"); assigns an object to the reference.
public class ObjectLifeCycle2 {
    Person person;
    public ObjectLifeCycle2() {
        person = new Person("Linda");
        person.display();
    }

    public static void main(String[] args) {
        new ObjectLifeCycle2();
    }
}
