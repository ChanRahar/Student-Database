package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen" +
                "\n2 - Sophomore" +
                "\n3 - Junior" +
                "\n4 - Senior" +
                "\nEnter student class level: ");
        this.year = in.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + year + " " + studentId);

    }

    //Generate an ID
    private void setStudentId() {
        id++;
        //grade level and the student id
        this.studentId = year + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0 to exit

        do {
            System.out.println("Enter course to enroll (Q to quit)");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine().toUpperCase();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1!=0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

    //View Balance

    //Pay tuition

    //Show status

}
