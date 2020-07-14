package com.codeVillage.Day5;



public class Calculator {
    public static void main(String[] args)

    {
        int num = 56;
        int num2 = 90;

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

