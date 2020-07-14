package com.codeVillage.Day10;

public class StudentApp {


    public static void main(String[] args) {

        Student2 ken = new Student2();

        ken.setName("Ken Mijungu");
        ken.setAge(20);
        ken.setAddress("56 NAIROBI");
        ken.setDateOfBirth("23-04-1989");
        ken.setRegNumber("FER45");

        System.out.println("\n\n--STUDENT DETAILS--");
        System.out.println("NAME--> "+ ken.getName() );
        System.out.println("REG NO.--> "+ ken.getRegNumber() );
        System.out.println("AGE--> " + ken.getAge() );
        System.out.println("DOB--> " + ken.getDateOfBirth());
        System.out.println("ADDRESS--> " + ken.getAddress() );




    }
}

