package com.codeVillage.Day8;

import java.util.Scanner;

public class Area1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        System.out.println("Enter the first number::");
        a = sc.nextInt();
        System.out.println("Enter the Second number::");
        b = sc.nextInt();
        System.out.println("Enter the Third number::");
        c = sc.nextInt();

        System.out.println("Result of first and second number:: " + product2(a,b));
        System.out.println("Result of first, second and third number::" + product3(a,b,c));


    }

    static int product2(int a, int b){
        return a*b; }

    static int product3(int a, int b, int c){
        return a*b*c; }

}
