package com.codeVillage.Day12.Task3;
import java.util.Scanner;


public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calc calc = new Calc();

        boolean appExit = false;

        while(!appExit){
            int choice;
            System.out.println("\n\n---CALCULATOR---");
            System.out.println("1. ADDITION");
            System.out.println("2.DIVISION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. EXIT");
            System.out.println("Choose an option::");
            choice = sc.nextInt();

             switch(choice){

                 case 1:
                     calc.addition();
                     break;
                 case 2:
                     calc.division();
                     break;
                 case 3:
                     calc.multiply();
                     break;
                 case 4:
                     System.exit(0);

                 default:
                     System.out.println("\n\nINVALID OPTION");
                     System.out.println("TRY AGAIN!!");
                     break;
             }

        }



    }


}
