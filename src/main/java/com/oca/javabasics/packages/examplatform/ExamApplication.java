package com.oca.javabasics.packages.examplatform;

import com.oca.javabasics.packages.examplatform.authentication.UserLogin;
import com.oca.javabasics.packages.examplatform.questions.Question;
import com.oca.javabasics.packages.examplatform.results.ExamResults;

public class ExamApplication {
    public static void main(String[] args) {
        UserLogin userLogin = new UserLogin("admin", "password123");
        if (userLogin.authenticate()) {
            Question question = new Question("What is the capital of France", "Option A");
            question.displayQuestions();
            ExamResults examResults = new ExamResults("admin", 10);
        } else {
            System.out.println("Invalid login");
        }

    }
}
