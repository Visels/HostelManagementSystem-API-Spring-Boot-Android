package com.codeVillage.Day12.Task1;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String middleName;

    public Person(String firstName, String lastName, int age){

        this.firstName = firstName;
        this.lastName = lastName;

        String fullName = firstName + lastName;
    }

    public Person(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;

        String fullName = firstName + middleName + lastName;
    }


    public String isQualified(int age){

        return age>18? "Person is mature" : "Person is not mature";
    }


}
