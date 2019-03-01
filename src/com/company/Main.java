package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          //Ask how many new users we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        //Create n number of new students
        for(int i = 0; i < numStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for(int i = 0; i < numStudents; i++){
            System.out.println(students[i].showInfo());
        }
    }
}
