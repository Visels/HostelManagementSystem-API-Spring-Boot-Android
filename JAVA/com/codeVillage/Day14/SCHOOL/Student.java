package com.codeVillage.Day14.SCHOOL;

import java.util.ArrayList;

public class Student {

    private String name;
    private String regNo;
    private String address;


    protected ArrayList<Subject> reportCard;


    //STUDENT CONSTRUCTOR

    public Student(String name, String regNo, String address, ArrayList<Subject> reportCard) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;
        this.reportCard = reportCard;
    }

    @Override
    public String toString() {
        return name + "\t\t" + regNo +"\t\t"+reportCard.toString();
    }

}
