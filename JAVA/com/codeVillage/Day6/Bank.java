package com.codeVillage.Day6;


import java.util.Scanner;
//Welcome window----->LoginWindow--->MainMenu---> Operations page
//Welcome window ----> LoginWindow --->ManagerLogin---->Manager operations


//---->Check balance
//---->Withdraw
//---->Send money




public class Bank {
    public static Scanner sc = new Scanner(System.in);
    public static int pin = 1234;
    public static double balance = 00;
    public static int  inputPin = 0;


    public static void main(String[] args){

        boolean exitApp = false;

        LoginWindow();






    }




    //DISPLAY FUNCTIONS

    public static void WelcomeWindow(){


        int balance = 20000;
        //welcome window
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                WELCOME                                             *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              LUBIRENT BANK.                                        *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t***************************************************************************************");
        System.out.print("\t\tB");
        sleep(100);
        System.out.print("A");
        sleep(100);
        System.out.print("N");
        sleep(100);
        System.out.print("K");
        sleep(100);
        System.out.print(" ");
        sleep(100);
        System.out.print("O");
        sleep(100);
        System.out.print("F");
        sleep(100);
        System.out.print(" ");
        sleep(100);
        System.out.print("C");
        sleep(100);
        System.out.print("H");
        sleep(100);
        System.out.print("O");
        sleep(100);
        System.out.print("I");
        sleep(100);
        System.out.print("C");
        sleep(100);
        System.out.print("E");
        sleep(100);
        cls();


    }

    public static void LoginWindow(){
        //Login window
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                      LOGIN                                         *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              ACCOUNT NO: [ 897873-234-45 ]                         *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              PASSWORD:[____________]                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t***************************************************************************************");

        print("\t\tEnter your password");
        inputPin = sc.nextInt();

        if(inputPin==pin){
            cls();
            print("LOGIN SUCCESSFUL!!");
            System.out.print("LOADING.");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");

        }
        else{
            cls();
            sleep(1000);
            print("\t\t\t*******************************");
            print("\t\t\t*        WRONG PIN!!!         *");
            print("\t\t\t*                             *");
            print("\t\t\t*         TRY AGAIN!          *");
            print("\t\t\t*                             *");
            print("\t\t\t*******************************");
            sleep(1500);
            cls();
            LoginWindow();

        }




    }

    public static void mainMenu(){

    }










    //BANK FUNCTIONS


    public static void checkBalance(){

        //return balance
    }

    public static void Withdraw(int amount){
        //withdrawal process
    }

    public static void SendMoney(){

        //Money sending process
    }










    //IMPLEMENTATION FUNCTIONS


    public static void print(String message){
        System.out.println(message);
    }

    public static void cls(){
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void sleep(int a){
        try{

            Thread.sleep(a);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }
    }

}
