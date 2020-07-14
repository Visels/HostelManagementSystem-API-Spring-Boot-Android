package com.codeVillage.Day5;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args)

    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter num1::");
        int num = myScanner.nextInt();
        System.out.println("Enter num2::");
        int num2 = myScanner.nextInt();
        System.out.println("OPERATIONS");
        System.out.println("1.Addition:"+addition(num, num2));
        System.out.println("2.Subtraction:"+subtraction(num, num2));
        System.out.println("3.Multiplication:"+multiplication(num, num2));
        System.out.println("4.Modulus:"+mod(num, num2));
    }

    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int mod(int a, int b){
        return a%b;
    }





}




