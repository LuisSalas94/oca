package com.oca.javabasics.packages.office;

import com.oca.javabasics.packages.home.LivingRoom;

public class Main {
    public static void main(String[] args) {
        // Without Import (Fully Qualified Name)
//        com.oca.javabasics.packages.home.LivingRoom livingRoom = new LivingRoom();
//        com.oca.javabasics.packages.office.MeetingRoom meetingRoom = new MeetingRoom();
//        livingRoom.relax();
//        meetingRoom.meet();

        LivingRoom livingRoom = new LivingRoom();
        MeetingRoom meetingRoom = new MeetingRoom();
        livingRoom.relax();
        meetingRoom.meet();

    }
}
