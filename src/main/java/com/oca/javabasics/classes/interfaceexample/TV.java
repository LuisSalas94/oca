package com.oca.javabasics.classes.interfaceexample;

public class TV implements Controls {
    @Override
    public void changeChannel(int channelNumber) {
        System.out.println("Changing to channel: " + channelNumber);

    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing Volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing Volume");
    }
}
