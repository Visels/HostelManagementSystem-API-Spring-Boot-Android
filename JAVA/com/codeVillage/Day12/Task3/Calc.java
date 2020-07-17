package com.codeVillage.Day12.Task3;
import java.lang.annotation.Documented;
import java.util.Scanner;


public class Calc implements Calculator{
    public Scanner sc = new Scanner(System.in);

    @Override
    public int addition() {
        int a,b;
        System.out.println("Enter the first number>>");
        a=sc.nextInt();
        System.out.println("Enter the second number>>");
        b= sc.nextInt();
        System.out.println("\n\nRESULT ==" + a+b);
        return a+b;
    }

    @Override
    public int multiply() {
        int a,b;
        System.out.println("Enter the first number>>");
        a=sc.nextInt();
        System.out.println("Enter the second number>>");
        b= sc.nextInt();
        System.out.println("\n\nRESULT ==" + a*b);
        return a*b;
    }

    @Override
    public int division() {
        int a,b;
        System.out.println("Enter the first number>>");
        a=sc.nextInt();
        System.out.println("Enter the second number>>");
        b= sc.nextInt();
        System.out.println("\n\nRESULT ==" + a/b);
        return a/b;
    }

}
