package com.codeVillage.Day14.TASK1;

import java.util.ArrayList;

public class Operations {

    ArrayList<Student> ClassMembers = new ArrayList<>();




    public static void viewClass(ArrayList members){
        System.out.println("\t\t\t\tCLASS");
        System.out.println("NAME  REGNO \t\t\t SUBJECTS");

        for(Object object: members){
            System.out.println( object.toString());
        }
    }


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
