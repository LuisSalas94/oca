package com.oca.javabasics.data;

public class BooleanExample {

    public static boolean isEligible(boolean voucher, boolean prep) {
        return voucher && prep;
    }

    public static void main(String[] args) {
        
        boolean voucherPurchased = true;
        boolean examPrepStarted = true;

        // Using boolean variables in conditional statements
        if (voucherPurchased) {
            System.out.println("Voucher purchased! You can register for the exam.");
        } else {
            System.out.println("Please purchase a voucher to register.");
        }

        if (examPrepStarted) {
            System.out.println("Great! Keep up the preparation.");
        } else {
            System.out.println("You should start preparing for the exam.");
        }

        System.out.println("Eligible to take the exam? " + isEligible(voucherPurchased, examPrepStarted));
    }

}
