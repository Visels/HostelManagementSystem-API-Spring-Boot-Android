package com.codeVillage.Day12.Task1;

import com.codeVillage.Day12.Task1.Person;

public class Teenager  extends Person {



    public Teenager(String firstName, String middleName, String lastName, int age){

        super(firstName,middleName, lastName,age );

        String fullName = firstName + middleName + lastName;

    }


    public String isQualified(int age){

        return  age>6 ? "Ready for kindergarten": "Not ready for kindergarten";
    }





}
