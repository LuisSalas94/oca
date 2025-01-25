package com.oca.javabasics.modifiers.demo8.staticvariables;

import com.oca.javabasics.modifiers.demo8.staticvariables.Emp;

public class TestEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();

        emp1.bankVault = 10;
        emp2.bankVault = 20;

        System.out.println(emp1.bankVault);
        System.out.println(emp2.bankVault);
        System.out.println(Emp.bankVault);




    }
}
