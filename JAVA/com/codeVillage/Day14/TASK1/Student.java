package com.codeVillage.Day14.TASK1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public Scanner sc = new Scanner(System.in);

    public String name;
    public String regNo;
    public String address;

    int SubjectsNo;
    ArrayList<Subjects> subjects = new ArrayList<>();

    public Student() {

    }

    public Student(String name, String regNo, String address) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;



        //taking in subjects and marks
        System.out.println("Enter the number of subjects::");
        SubjectsNo =sc.nextInt();

        int total = 0;

        for(int i =0;i<SubjectsNo;i++){

            Subjects temp = new Subjects();

            System.out.println("Enter the name of the subject::");
            temp.name = sc.next();
            System.out.println("MARKS::");
            temp.marks = sc.nextInt();

            temp.grade = Operations.grader(temp.marks);

            total += temp.marks;
            subjects.add(temp);
        }



        int mean = total /SubjectsNo;
        String meanGrade = Operations.grader(mean);

        Subjects Mean = new Subjects();
        Mean.name = "MEAN";
        Mean.grade = meanGrade;
        Mean.marks = mean;

        subjects.add(Mean);
    }


    @Override
    public String toString() {
        return this.name+" " + this.regNo +"  "+ this.subjects.toString();
    }
}
