package com.codeVillage.Day5;

import java.util.Scanner;

public class student {

    public static void main(String[] args){

        String name = "";
        int age;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter you name::");
        name = myScanner.nextLine();
        System.out.println("Enter your age::");
        age = myScanner.nextInt();

        System.out.println(name);
        System.out.println(age);

    }


}
