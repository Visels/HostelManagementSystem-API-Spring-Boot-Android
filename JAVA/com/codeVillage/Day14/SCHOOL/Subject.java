package com.codeVillage.Day14.SCHOOL;

public class Subject {

    private int marks;
    private String grade;
    private String name;



    public Subject(String name, int marks) {
        this.marks = marks;
        this.name = name;
        this.grade = StudentManagement.grader(marks);
    }

    public Subject(){

    }

    @Override
    public String toString() {
        return  name + " "+ marks + "( "+ grade + " )";
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
