package com.oca.javabasics.packages.home;

public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        Kitchen kitchen = new Kitchen();
        livingRoom.relax();
        kitchen.cook();
    }
}
