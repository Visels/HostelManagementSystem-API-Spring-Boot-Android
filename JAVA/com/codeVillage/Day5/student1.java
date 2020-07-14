package com.codeVillage.Day5;

import java.util.Scanner;

public class student1 {

    public static void main(String [] args)
    {
        //student data
        String name = "";
        String regNo;


        int math =0;
        int english=0;
        int swahili=0;
        int science=0;


        Scanner sc = new Scanner(System.in);

    System.out.println("ENTER YOUR DETAILS");
    System.out.println("Name:");
    name = sc.nextLine();

    System.out.println("Reg NO:");
    regNo = sc.nextLine();

    System.out.println("\nENTER MARKS FOR:");
    System.out.println("MATH:");
    math = sc.nextInt();
    System.out.println("ENGLISH:");
    english = sc.nextInt();
    System.out.println("KISWAHILI:");
    swahili = sc.nextInt();
    System.out.println("SCIENCE:");
    science = sc.nextInt();


    double mean = 0;
    double sum = math + english + swahili + science;

    mean = sum/4;

        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("**********************");
        System.out.println("NAME: "+ name);
        System.out.println("REG NO: " + regNo);
        System.out.println("***********************");
        System.out.println("SUBJECT \t SCORE \t GRADE");
        System.out.println("MATH:\t \t\t" + math+"\t    " + grader(math));
        System.out.println("ENGLISH:\t    " + english +"\t    "+ grader(english));
        System.out.println("KISWAHILI:\t    " + swahili+"      "+ grader(swahili));
        System.out.println("SCIENCE::      \t"+ science + "  \t" + grader(science));
        System.out.println("************************");
        System.out.println("MEAN::" + mean + "\t");
        System.out.println("GRADE::" + " " + Meangrader(mean));
        System.out.println("************************\n\n\n\n\n\n");

        print("Implemented the string function");

    }


    public static void print(String message){

        System.out.println(message);
    }



    public static String grader(int a) {

        if (a >= 0 && a <= 40) {
            return "D";
        }
        if (a >= 41 && a <= 60) {
            return "C";
        }
        if (a >= 61 && a <= 80) {
            return "B";
        }
        if (a >= 81 && a <= 100) {
            return "A";
        }
    return "None";
    }



    public static String Meangrader(double a) {

        if (a >= 0 && a <= 40) {
            return "D";
        }
        if (a >= 41 && a <= 60) {
            return "C";
        }
        if (a >= 61 && a <= 80) {
            return "B";
        }
        if (a >= 81 && a <= 100) {
            return "A";
        }
        return "NOT VALID MARK";
    }




}
