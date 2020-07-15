package com.thecodevillage.day5;

import java.util.Scanner;

public class Student {

    public static void main(String[] args){
        String name= "";
        int age=19;
        Scanner scanner=new Scanner(System.in);

        System.out.println(" Enter your Name ");
        name = scanner.nextLine();

        System.out.println(" Enter your Age ");
        age = scanner.nextInt();


        System.out.println("Name:\t"+name);
        System.out.println("Age:\t"+age);
    }

    //Student1.java
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

    //enhance and give grade per subject

}
