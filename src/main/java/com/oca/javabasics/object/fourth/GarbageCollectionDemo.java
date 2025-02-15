package com.oca.javabasics.object.fourth;

//* How This Code Demonstrates Garbage Collection:
//Two objects (phone and tablet) are created in memory.
//Each object holds a reference to the other, forming a circular dependency.
//External references (phone and tablet) are set to null, making the objects inaccessible.
//The Java garbage collector identifies them as unreachable and marks them for garbage collection.
//Calling System.gc(); requests garbage collection (execution time is JVM-dependent).
//🔹 Key Concept: Even though phone and tablet reference each other, they cannot be accessed from the program anymore. Hence, they are eligible for garbage collection.
//Would you like another example with different names or a different approach? 🚀
class Device {
    String name;
    Device connectedDevice; // Reference to another Device object

    public Device(String name) {
        this.name = name;
    }

    public void connect(Device otherDevice) {
        this.connectedDevice = otherDevice;
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Creating two Device objects
        Device phone = new Device("Phone");
        Device tablet = new Device("Tablet");

        // Making them reference each other (creating an island of isolation)
        phone.connect(tablet);
        tablet.connect(phone);

        // Breaking external references
        phone = null;
        tablet = null;

        // At this point, both objects are inaccessible from the main method.
        // They form an island of isolation and will be garbage collected.

        // Requesting garbage collection (not guaranteed)
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
