package com.oca.javabasics.classes.phone;

class Phone {
    String model;
    String company;
    public Phone(String model) {
        this.model = model;
    }
    double weight;
    void makeCall(String number) {
        System.out.println("Calling: " + number);
    }
    void receiveCall(){
        System.out.println("Receiving a call");
    }
}


