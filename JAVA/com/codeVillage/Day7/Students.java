package com.codeVillage.Day7;
import java.sql.SQLOutput;
import java.util.Scanner;




public class Students {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int studentsNo;
        int subjectsNo;

        System.out.println("Enter the number of students::");
        studentsNo = sc.nextInt();
        System.out.println("Enter the number of subjects::");
        subjectsNo = sc.nextInt();


        //student details

        String name = "";
        String regNo = "";
        String subjectNames = "";
        int studentSum =0;
        int StudentMean=0;



        String finalMessage = "";
        int totalMean=0;

        for(int i = 0; i< studentsNo;i++){
            int studentCounter = i+1;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("STUDENT " + studentCounter + " DETAILS");
            System.out.println("Name::");
            name = sc.next();
            System.out.println("REG::");
            regNo = sc.next();

            subjectNames = " ";
            studentSum=0;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\t\t STUDENT " + studentCounter+ " DETAILS");

            for(int j = 0; j< subjectsNo;j++){

                String sub = "";
                int marks = 0;

                System.out.println("Subject Name::" );
                sub = sc.next();

                System.out.println("Marks::");
                marks = sc.nextInt();






                studentSum += marks;
                subjectNames += "\t" +  sub + ":" + marks +"(" +grader(marks) + ")";

            }

            StudentMean = studentSum/subjectsNo;
            totalMean += StudentMean;
            finalMessage += "\t" +studentCounter+". " + name +"  "+ regNo + "  " + subjectNames + "\t"+StudentMean+"("+grader(StudentMean)+")" +"\n";


        }
        int classMean;
        classMean = totalMean/studentsNo;

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\t\t\t STUDENT RESULTS");
        System.out.println( "\t\t"  + "NAME" +"  "+ "REG" + "  " + "\t\t\t\tSUBJECT NAMES & GRADE" );
        System.out.println(finalMessage);
        System.out.println("\t\tTOTAL MARKS::" + totalMean);
        System.out.println("\t\tMEAN SCORE::" + totalMean/studentsNo);
        System.out.println("\t\tMEAN GRADE::" + grader(classMean));

        System.out.println("\n\n\n\n\n\n");




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


}
