package com.codeVillage.Day6;


import java.util.Scanner;


public class Bank {

    //GLOBAL VARIABLES
    public static Scanner sc = new Scanner(System.in);
    public static int pin = 1234;
    public static double balance = 1500.67;//bank account balance
    public static int  inputPin = 0;//pin input by user
    public static boolean exitApp = false;



    public static void main(String[] args){

        while(!exitApp){

            Login();

            exitApp = true;
        }

    }

    //DISPLAY FUNCTIONS
    public static void Login(){


        int balance = 0;
        //welcome window
        do{
        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    WELCOME!                                        *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                  LUBIRENT BANK.                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t***************************************************************************************");
        System.out.print("\t\t\t\t\t\t\t\t\t\tB");
        sleep(200);
        System.out.print("A");
        sleep(200);
        System.out.print("N");
        sleep(200);
        System.out.print("K");
        sleep(200);
        System.out.print(" ");
        sleep(200);
        System.out.print("O");
        sleep(200);
        System.out.print("F");
        sleep(200);
        System.out.print(" ");
        sleep(200);
        System.out.print("C");
        sleep(200);
        System.out.print("H");
        sleep(200);
        System.out.print("O");
        sleep(200);
        System.out.print("I");
        sleep(200);
        System.out.print("C");
        sleep(200);
        System.out.print("E");
        sleep(1000);
        cls();}
        while(2==3);
        LoginWindow();
    }

    public static void LoginWindow(){
        //Login window
        print("\n\n");
        print("\t\t                                   **************                                       ");
        print("\t\t                                  * SAMPLE BANK *                                     ");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                         [ 0 - EXIT]*");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                      *  LOGIN  *                                   *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              ACCOUNT NO: [ __________ ]                            *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              PASSWORD:   [ ___________ ]                           *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");

        print("\t\tEnter your password>>\n\n\n");
        inputPin = sc.nextInt();

        if(inputPin==0){
            cls();
            exitwindow();
            sleep(2000);
            System.exit(0);
        }

        if(inputPin==pin){
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tLOADING.");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");

            print("\n\n\n\n\n\n\n\n\n\n\n\n");
            print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            print("\t\t\t\t\t\t\t\t\t\t\t****************************");
            print("\t\t\t\t\t\t\t\t\t\t\t*                          *");
            print("\t\t\t\t\t\t\t\t\t\t\t*    LOGIN SUCCESSFUL!!    *");
            print("\t\t\t\t\t\t\t\t\t\t\t*                          *");
            print("\t\t\t\t\t\t\t\t\t\t\t****************************");
            print("\n\n\n\n\n\n\n\n\n\n\n");
            sleep(2000);
            cls();
            mainMenu();


        }

        else{
            cls();
            sleep(1000);
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\t\t\t\t\t\t\t\t\t\t*        WRONG PASSWORD!!!    *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*         TRY AGAIN!          *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\n\n\n\n\n\n\n\n\n\n\n\n");
            sleep(2000);
            cls();
            LoginWindow();

        }




    }

    public static void exitwindow(){

        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    GOODBYE!                                        *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                  LUBIRENT BANK.                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t***************************************************************************************");





    }

    public static void mainMenu(){

        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                      |                                             *");
        print("\t\t* 1. CHECK BALANCE                     |       4. DEPOSIT                            *");
        print("\t\t*                                      |                                             *");
        print("\t\t* -----------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 2. WITHDRAW                          |       5.UNDER CONSTRUCTION                *");
        print("\t\t*                                      |                                             *");
        print("\t\t*------------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 3. SEND MONEY                        |       6. UNDER CONSTRUCTION                     *");
        print("\t\t*                                      |                                             *");
        print("\t\t*------------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 8. LOG OUT                           |       9. EXIT                               *");
        print("\t\t*                                      |                                             *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 Bank of Choice                                     *");
        print("\t\t**************************************************************************************");
        sleep(2000);
        print("\n\t\tSELECT AN OPTION>>");
        int option ;
        option = sc.nextInt();



        switch (option){

            case 1:
                checkBalance();
                break;
            case 2:
                Withdraw();
                break;
            case 3:
                SendMoney();
                break;
            case 4:
                deposit();
                break;
            case 5:
                cls();
                print("UNDER CONSTRUCTION");
                mainMenu();
                break;
            case 6:
                cls();
                print("UNDER CONSTRUCTION");
                mainMenu();
            case 8:
                cls();
                LoginWindow();
                break;
            case 9:
                exitApp = false;
                exitwindow();
                sleep(1000);
                System.exit(0);
                cls();
                break;
            default:
                print("Invalid option try again");
                mainMenu();
                break;
        }

    }

    public static void loansWindow(){};


    //BANK FUNCTIONS
    public static void checkBalance(){

        cls();
        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t* ~~ CURRENT BALANCE   ::  Sh." + balance+ "                                              ");
        print("\t\t*                                                                                    *");
        print("\t\t* -----------------------------------------------------------------------------------*");
        print("\t\t*                                                                                    *");
        print("\t\t* ~~ WITHDRAWABLE AMOUNT:: Sh." + balance*0.75 + "                                       ");
        print("\t\t*                                                                                    *");
        print("\t\t*------------------------------------------------------------------------------------*");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t* -----------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t*      1: BACK                         |          0: EXIT                            *");
        print("\t\t*                                      |                                             *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 Bank of Choice                                     *");
        print("\t\t**************************************************************************************");

        int option;
        print("SELECT AN OPTION::");
        option = sc.nextInt();


        if (option == 1) {
            mainMenu();
        }
        else if (option == 0){
            cls();
            exitwindow();
            sleep(2000);
            System.exit(0);

        }
        }

    public static void Withdraw(){

        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    WITHDRAWAL                                      *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");
        //withdrawal process
        int withdrawalAmount ;
        print("Enter Amount:\n\n\n\n\n");
        withdrawalAmount = sc.nextInt();

            if (withdrawalAmount <= balance*0.75) {
                balance = balance - withdrawalAmount;
                cls();
                print("\t\t**************************************************************************************");
                print("\t\t*                                 NAME      : JOHN DOE                               *");
                print("\t\t*                                                                                    *");
                print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
                print("\t\t**************************************************************************************");
                print("\t\t*                                                                                    *");
                print("\t\t*                               WITHDRAWAL SUCCESSFUL                                *");
                print("\t\t*                                                                                    *");
                print("\t\t**************************************************************************************");
                print("\t\t*                                                                                    *");
                print("\t\t*  Confirmed successfully withdrawn::                                                 *");
                print("\t\t*        KSH: " + withdrawalAmount);
                print("\t\t*                                                                                    *");
                print("\t\t*   New balance::                                                                    *");
                print("\t\t*        KSH: " + balance);
                print("\t\t*                                                                                    *");
                print("\t\t*                                                                                    *");
                print("\t\t**************************************************************************************");
                print("\t\t*                                     |                                              *");
                print("\t\t*              1: BACK                |      0:EXIT                                  *");
                print("\t\t*                                     |                                              *");
                print("\t\t* *********************************************************************************  *");

                int choice;
                print("Enter an option::");
                choice = sc.nextInt();

                if (choice == 1) {
                    sleep(1000);
                    cls();
                    mainMenu();
                }

                else{

                    cls();
                    exitwindow();
                    sleep(2000);
                    System.exit(0);
                }

            }

            else{
                cls();
                print("INVALID WITHDRAWAL AMOUNT!!");
                print("TRY AGAIN");
            }


    }

    public static void SendMoney(){

        //Money sending process
        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    SENDING MONEY                                   *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");

        int accountNO;
        int amount;

        print("Enter Account No to send to::");
        accountNO = sc.nextInt();
        print("Enter amount to send::\n\n\n\n");
        amount = sc.nextInt();


        if (amount <= balance) {

            balance = balance - amount;
            cls();
            print("\t\t**************************************************************************************");
            print("\t\t*                                 NAME      : JOHN DOE                               *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*                                 SEND   SUCCESSFUL                                  *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*  Confirmed successfully Sent::                                                     *");
            print("\t\t*        KSH: " + amount + ".00");
            print("\t\t*                                                                                    *");
            print("\t\t*  To:                                                                               *");
            print("\t\t*     "+ accountNO);
            print("\t\t*                                                                                    *");
            print("\t\t*   New balance::                                                                    *");
            print("\t\t*        KSH: " + balance);
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                     |                                              *");
            print("\t\t*              1: BACK                |      0:EXIT                                  *");
            print("\t\t*                                     |                                              *");
            print("\t\t* *********************************************************************************  *");

            int choice;
            print("Enter an option::");
            choice = sc.nextInt();

            if (choice == 1) {
                sleep(1000);
                cls();
                mainMenu();
            }



        }

        else{
            SendMoney();

        }
        }

    public static void deposit(){
        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    DEPOSIT                                          *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");


        int amount;


        print("Enter amount to Deposit::\n\n\n\n");
        amount = sc.nextInt();


        balance = balance + amount;

         cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : JOHN DOE                               *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : 7858-43734-89                          *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                 DEPOSIT   SUCCESSFUL                                  *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*  Confirmed successfully Deposit::                                                     *");
        print("\t\t*        KSH: " + amount + ".00");
        print("\t\t*                                                                                    *");

        print("\t\t*                                                                                    *");
        print("\t\t*   New balance::                                                                    *");
        print("\t\t*        KSH: " + balance);
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                     |                                              *");
        print("\t\t*              1: BACK                |      0:EXIT                                  *");
        print("\t\t*                                     |                                              *");
        print("\t\t* *********************************************************************************  *");

        int choice;
        print("Enter an option::");
        choice = sc.nextInt();

        if (choice == 1) {
            sleep(1000);
            cls();
            mainMenu();
        }



        }






    //IMPLEMENTATION FUNCTIONS
    public static void print(String message){
        System.out.println(message);
    }
    public static void cls(){
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
