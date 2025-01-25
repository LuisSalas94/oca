package com.oca.javabasics.packages.examplatform.questions;

public class Question implements MultipleChoice {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }


    @Override
    public void optionA() {
        System.out.println("Option A: Paris");
    }

    @Override
    public void optionB() {
        System.out.println("Option B: London");
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void displayQuestions(){
        System.out.println("Question: " + questionText);
        optionA();
        optionB();
        System.out.println("Correct Answer: " + getCorrectAnswer());
    }
}
