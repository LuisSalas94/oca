package com.oca.javabasics.packages.examplatform.results;

public class ExamResults {
    private String username;
    private int score;

    public ExamResults(String username, int score) {
        this.username = username;
        this.score = score;
    }

    public void displayResults() {
        System.out.println("User: " + username);
        System.out.println("Score: " + score + "/10");
    }
}
