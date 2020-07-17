package com.codeVillage.Day12.Task1;

public class Child  extends Person {



    public Child(String firstName, String lastName, int age){

        super(firstName, lastName,age );

        String fullName = firstName + lastName;

    }



    public String isQualified(int age){

        return  age>6 ? "Ready for kindergarten": "Not ready for kindergarten";
    }





}
