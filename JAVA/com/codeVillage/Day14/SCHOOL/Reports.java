package com.codeVillage.Day14.SCHOOL;

import java.util.ArrayList;

public class Reports {


    public static void viewResults(ArrayList<Student> sampleStream){


        System.out.println("\n\n\n\nNAME \t REGNO  \t\t\t\t\t SUBJECTS");

        //printing out each student in the student list
        for(Object object: sampleStream){

            System.out.println(object.toString());

        }

    }
































}
