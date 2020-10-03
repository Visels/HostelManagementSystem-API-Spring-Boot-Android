package com.codeVillage.Day14.SCHOOL;

import java.util.ArrayList;
import java.util.Scanner;




public class StudentManagement
{

    public static Scanner sc = new Scanner(System.in);


    //ADDING STUDENTS
    public static void addStudent(Student object, StudentStream studentStream){

        studentStream.classMembers.add(object);
    }

    //CREATING A STUDENT
    public static Student createStudent(){
    String name;
    String regNo;
    String address;



    ArrayList<Subject> subjectList = new ArrayList<>();


    System.out.println("**************STUDENT***********");
    System.out.println("1.NAME::");
    name = sc.next();
    System.out.println("2.REGISTRATION::");
    regNo = sc.next();
    System.out.println("ADDRESS::");
    address = sc.next();


    Student sample = new Student(name,regNo,address, getSubjectsData());
    return sample;

    }



    //TAKING THE SUBJECTS DATA
    public static ArrayList<Subject> getSubjectsData() {
        int noSubjects;
        String name;
        int marks;

        int totalMarks = 0;
        String meanGrade = "";
        int meanScore = 0;


        ArrayList<Subject> result = new ArrayList<>();

            System.out.println("Enter the number of subjects:");
            noSubjects = sc.nextInt();

        for(int i = 0;i< noSubjects;i++){

            System.out.println("Subject Name::");
            name = sc.next();
            System.out.println("MARKS::");
            marks = sc.nextInt();

            totalMarks += marks;



            Subject sample = new Subject(name, marks);

            result.add(sample); }

        meanScore = totalMarks/noSubjects;

        meanGrade = StudentManagement.grader(meanScore);

        Subject Mean = new Subject("Mean", meanScore);
        Mean.setGrade(meanGrade);

        result.add(Mean);

        return result;
    }



    //VIEWING RESULTS
    public static void viewResult(ArrayList<Student> sample){

        Reports.viewResults(sample);
        classData(sample);

    }




    //CALCULATING THE CLASS MEAN AND MEAN GRADE
    public static void classData(ArrayList<Student> temp){

        int classTotalMarks = 0;
        int classMean = 0;
        String classMeanGrade = "";

        for(Student object: temp){
            Subject Mean = new Subject();

            int MeanSubjectIndex = object.reportCard.size() - 1;


            Mean = object.reportCard.get(MeanSubjectIndex);

            classTotalMarks += Mean.getMarks();

        }

        classMean = classTotalMarks/temp.size();
        classMeanGrade = StudentManagement.grader(classMean);


        System.out.println("\n\nTOTAL:: " + classTotalMarks);
        System.out.println("AVERAGE:: " + classMean);
        System.out.println("MEAN GRADE:: " + classMeanGrade);
    }

    //GRADER FUNCTION
    public static String grader(int a){

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
