package com.codeVillage.Day14.TASK1;

import com.codeVillage.Day14.TASK1.Operations;
import com.codeVillage.Day14.TASK1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static ArrayList<Student> classMembers = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int studentNo;
        System.out.println("Enter the number of students::");
        studentNo = sc.nextInt();


        int totalMarks;


        for(int i=0;i<studentNo;i++){

            Student temp = new Student();
            System.out.println("************STUDENT********");
            System.out.println("Enter the name::");
            temp.name = sc.next();
            System.out.println("Enter the registration number:");
            temp.regNo = sc.next();

            System.out.println("Enter the address ");

            temp.address = sc.next();




            Student sample = new Student(temp.name,temp.regNo,temp.address);

            classMembers.add(sample);

        }


        Operations.viewClass(classMembers);


    }





    public static void Mean(ArrayList<Student> temp){

        int total = 0;

        int mean = 0;

        for(Object object: temp){


        }



    }



    }








