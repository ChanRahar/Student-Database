package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses = "";
    private double tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();


        do {
            System.out.print("1 - Freshmen" +
                    "\n2 - Sophomore" +
                    "\n3 - Junior" +
                    "\n4 - Senior" +
                    "\n5 - Super Senior" +
                    "\nEnter student class level: ");
            while (!in.hasNextInt()) {
                in.next();
            }
            System.out.println("That is not a listed year");
            this.year = in.nextInt();
        } while (this.year < 1  || this.year > 5);
        System.out.println("Thank you! Got " + this.year);

        setStudentId();

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
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View Balance
    private void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        double payment = Math.round(in.nextDouble() * 100 / 100);
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    //Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nYear: " + year +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;

    }

}
