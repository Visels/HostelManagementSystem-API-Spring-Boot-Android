package com.codeVillage.Day14.SCHOOL;

import java.util.Scanner;

public class TeacherTerminal {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagement classTeacher = new StudentManagement();

        StudentStream oneSouth = new StudentStream("F1 S");

        Teacher teacherMichael = new Teacher("MICHAEL OWEN", "5637-3F", true);

        oneSouth.classTeacher = teacherMichael;


        int noStudents = 0;
        System.out.println("Enter the number of students::");
        noStudents = sc.nextInt();

        for(int i =0;i<  noStudents;i++){

            Student toBeAdded = classTeacher.createStudent();

            classTeacher.addStudent(toBeAdded, oneSouth);

        }

        StudentManagement.viewResult(oneSouth.classMembers);

    }


}
