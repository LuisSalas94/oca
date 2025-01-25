package com.oca.javabasics.packages.imports;

public class Main {
    public static void main(String[] args) {
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        StaticDemo staticDemo3 = new StaticDemo();

//        staticDemo1.displayCount();
//        staticDemo2.displayCount();
//        staticDemo3.displayCount();

        StaticDemo.displayCount();
    }
}

