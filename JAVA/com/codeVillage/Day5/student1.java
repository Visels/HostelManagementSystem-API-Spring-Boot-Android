package com.thecodevillage.day5;
import java.util.Scanner;
public class Student1 {


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //functions/methods -re
        String grade = "";
        String name="";
        String regNumber="";
        int engMarks = 0;
        int kiswaMarks = 0;
        int mathMarks = 0;
        int totalMarks = 0;
        int mean = 0;

        String mathGrade = "";
        String engGrade = "";
        String kiswaGrade = "";

        System.out.println(" Enter your Name ");
        name = scanner.nextLine();
        System.out.println(" Enter your Reg No ");
        regNumber = scanner.nextLine();
        System.out.println(" Enter ENG Marks");
        engMarks = scanner.nextInt();
        System.out.println(" Enter KISWA Marks");
        kiswaMarks = scanner.nextInt();
        System.out.println(" Enter MATH Marks");
        mathMarks = scanner.nextInt();
        totalMarks = kiswaMarks + engMarks + mathMarks;
        mean = totalMarks / 3;
        grade = getGrade(mean);
        print("Name :" +name);
        print("Reg No :" +regNumber);
        print("MATH :" +mathMarks + " "+getGrade(mathMarks));
        print("ENG :" +engMarks + " "+getGrade(engMarks));
        print("KISW :" +kiswaMarks + " "+ getGrade(kiswaMarks));
        print("Tot Marks :" +totalMarks);
        print("Mean Score :" +mean);
        print("Mean Grade :" +grade);
    }

    static String getGrade(int mean){
         String grade="";
        if(mean >=0 && mean <= 40)
            grade = "D";
        else if(mean > 40 && mean <= 60)
            grade = "C";
        else if(mean > 60  && mean <= 80)
            grade = "B";
        else if(mean > 80 && mean <= 100) {
            grade = "A";
        }
        else
            grade = "F";
        return grade;
    }
    static void print(String message){
        System.out.println(message);
    }

    //Car - Class
    //increase speed-> accelerate
    //stop -> brake
    ///steering

    //functions can take input
    //return output

    //Ask the student to enter the following
    //name
    //regNo
    //marks for -> MATH, ENG, KIS, SCI

    //do output
    //student details
    //each subject and score
    //total marks
    //mean grade

    //guide for mean grade
    //0 -40 D
    //40-60 C
    //60 - 80 B
    //80 -100 A


}
