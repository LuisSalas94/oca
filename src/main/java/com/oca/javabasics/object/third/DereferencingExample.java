package com.oca.javabasics.object.third;
//* Object Becomes Inaccessible Due to Dereferencing by Reassignment
class Course {
    String title;

    public Course(String title) {
        this.title = title;
    }

    public void displayCourse() {
        System.out.println("Course: " + title);
    }
}

public class DereferencingExample {
    public static void main(String[] args) {
        Course firstCourse = new Course("Mathematics");   // Object 1 created
        firstCourse.displayCourse();

        firstCourse = new Course("Physics");   // Object 2 created, Object 1 dereferenced
        firstCourse.displayCourse();

        firstCourse = new Course("Chemistry");  // Object 3 created, Object 2 dereferenced
        firstCourse.displayCourse();

        Course secondCourse = new Course("Biology"); // Object 4 created
        secondCourse.displayCourse();

        secondCourse = firstCourse;  // Object 4 dereferenced
        System.out.println("After reassignment:");
        secondCourse.displayCourse();
    }
}
//* Explanation:
//Object 1 ("Mathematics") is created and assigned to firstCourse.
//firstCourse is reassigned to Object 2 ("Physics"), making Object 1 inaccessible.
//firstCourse is reassigned again to Object 3 ("Chemistry"), making Object 2 inaccessible.
//secondCourse is assigned Object 4 ("Biology").
//secondCourse = firstCourse; makes Object 4 inaccessible, as secondCourse now refers to Object 3 ("Chemistry").