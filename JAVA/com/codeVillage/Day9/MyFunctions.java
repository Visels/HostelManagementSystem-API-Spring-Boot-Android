package com.thecodevillage.day9;

public class MyFunctions {

    static final double PI = 3.142;

    //function to calculate area of cirle

    //circumference

    //product for 2, 3

    //calculate the grade

    double getAreaCircle(double radius){
        return PI * radius *radius;
    }

    static double getCircumference(double radius){
        return 2 * PI * radius;
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


    static int getMean(int totalMarks,int noOfSubjects){
        return totalMarks/noOfSubjects;
    }

    static int product(int x,int y){
        return x * y;
    }

    static int product(int x,int y,int z){
        return x * y * z;
    }
}
