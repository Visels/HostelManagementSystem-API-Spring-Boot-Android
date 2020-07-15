package com.thecodevillage.day9;

import java.util.Scanner;

public class MyGradingApp {
    //allow user input name.regNo of n students
    //allow input subjectName, Score

    //calculate the mean grade and mean score
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String studentName="";
        String regNum = "";
        int noOfStudents = 0;
        int totalMarks =0 ;


        System.out.println("Enter No Of Students ");
        noOfStudents = scanner.nextInt();


        if (noOfStudents > 0){
            int counter=1;
            String subjectName="";
            int noOfSubjects =0;
            int score = 0;
            while(counter <= noOfStudents){
                System.out.println("Enter Name");
                studentName = scanner.next();

                System.out.println(" Enter reg no");
                regNum = scanner.next();


                System.out.println("Enter No Of Subjects ");
                noOfSubjects = scanner.nextInt();

                for(int i=0; i< noOfSubjects; i++){
                    System.out.println("Enter subject Name");
                    subjectName = scanner.next();

                    System.out.println("Enter the Score");
                    score = scanner.nextInt();

                    totalMarks += score;
                }


                counter++;
            }

            System.out.println("Total MArks: "+totalMarks);
            //MyFunctions myFunctions=new MyFunctions();
            int mean = MyFunctions.getMean(totalMarks,noOfSubjects);
            System.out.println("Mean Score: "+mean);
            System.out.println("Mean Grade: "+MyFunctions.getGrade(mean));

        } else {
            System.out.println("0 not allowed ");
        }







    }



}
