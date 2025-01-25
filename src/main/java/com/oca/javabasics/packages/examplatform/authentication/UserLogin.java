package com.oca.javabasics.packages.examplatform.authentication;

public class UserLogin {
    private String userName;
    private String password;

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean authenticate() {
        return "admin" .equals(userName) && "password123" .equals(password);
    }
}
