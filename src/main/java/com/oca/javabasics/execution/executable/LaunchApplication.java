package com.oca.javabasics.execution.executable;

import com.oca.javabasics.execution.nonexecutable.UserData;
import com.oca.javabasics.execution.nonexecutable.Window;
import com.oca.javabasics.execution.nonexecutable.ServerConnection;
import com.oca.javabasics.execution.nonexecutable.UserPreferences;

public class LaunchApplication {
    public static void main(String[] args) {
        ServerConnection serverConnection = new ServerConnection();
        UserData userData = new UserData();
        UserPreferences userPreferences = new UserPreferences();
        Window window = new Window();

        serverConnection.connect();
        userPreferences.loadPreferences();
        window.display();
        System.out.println("Welcome, " + userData.getUser() + "!");
    }
}
