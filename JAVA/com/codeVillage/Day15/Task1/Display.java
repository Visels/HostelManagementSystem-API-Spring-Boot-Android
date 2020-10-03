package com.codeVillage.Day15.Task1;

import java.util.Date;
import java.util.Scanner;



public class Display {
    public static Scanner sc = new Scanner(System.in);

    public static void WelcomeWindow() {

        //welcome window
        do {
            print("\n\n");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                         WELCOME!                                   *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                       SAMPLE BANK.                                 *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
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
            cls();
        }
        while (2 == 3);

    }


    public static void loginWindow() {

        //Login window
        print("\n\n");
        print("\t\t                                     **************                                       ");
        print("\t\t                                     * SAMPLE BANK *                                     ");
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                         [ 0 - EXIT]*");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                     *  LOGIN  *                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              MOBILE: [ __________ ]                                *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                              PASSWORD: [ ________ ]                                *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");

        print("\t\tENTER YOUR MOBILE NUMBER::\n\n\n");
        String usernameInput = sc.next();

//        if(usernameInput == "0"){
//            cls();
//            //exitwindow();
//            sleep(2000);
//            System.exit(0);
//        }

        if (Operations.customerDatabase.customerPasswords.containsKey(usernameInput)) {


            //Login window
            print("\n\n\n\n\n\n\n");
            print("\t\t                                     **************                                       ");
            print("\t\t                                     * SAMPLE BANK *                                     ");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                         [ 0 - EXIT]*");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                        *  LOGIN  *                                 *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                              USERNAME: [" + usernameInput + " ]                    ");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                              PASSWORD: [ ___________ ]                             *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");


            System.out.println("ENTER YOUR PIN::");

            int userInputPin = sc.nextInt();


            if (Operations.customerDatabase.customerPasswords.get(usernameInput) == userInputPin) {
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
                //mainMenu();
            } else {

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


                Display.loginWindow();
                //LoginWindow();


            }



        } else {

            cls();
            sleep(1000);
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\t\t\t\t\t\t\t\t\t\t*        INVALID USERNAME     *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*           TRY AGAIN!        *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\n\n\n\n\n\n\n\n\n\n\n\n");
            sleep(2000);
            cls();


            Display.loginWindow();
            //LoginWindow();


        }


    }


    public static void mainMenu(Customer customer, BankAccount bankAccount) {

        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : " + customer.name + "                    ");
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
        print("\t\t**************************************************************************************");
        print("\t\t*                                      |                                             *");
        print("\t\t* 1. CHECK BALANCE                     |       4. DEPOSIT                            *");
        print("\t\t*                                      |                                             *");
        print("\t\t* -----------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 2. WITHDRAW                          |       5.CHANGE PIN                          *");
        print("\t\t*                                      |                                             *");
        print("\t\t*------------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 3. SEND MONEY                        |       6. BANK STATEMENT                     *");
        print("\t\t*                                      |                                             *");
        print("\t\t*------------------------------------------------------------------------------------*");
        print("\t\t*                                      |                                             *");
        print("\t\t* 8. LOG OUT                           |       9. EXIT                               *");
        print("\t\t*                                      |                                             *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 Bank of Choice                                     *");
        print("\t\t**************************************************************************************");
        sleep(500);
        print("\n\t\tSELECT AN OPTION>>");
        int option;
        option = sc.nextInt();


        switch (option) {

            case 1:
                Operations.checkBalance(customer, bankAccount);

                break;
            case 2:
                Operations.Withdraw(customer, bankAccount);
                break;
            case 3:
                Operations.sendMoney(customer, bankAccount);
                break;
            case 4:
                Operations.Deposit(customer, bankAccount);
                break;
            case 5:
                cls();
                print("UNDER CONSTRUCTION");
                mainMenu(customer, bankAccount);
                break;
            case 6:
                cls();
                Operations.bankStatement(customer,bankAccount);
                break;

            case 8:
                cls();
                loginWindow();
                mainMenu(customer, bankAccount);
                break;
            case 9:
                //exitApp = false;
                //exitwindow();
                sleep(1000);
                System.exit(0);
                cls();
                break;
            default:
                print("Invalid option try again");
                mainMenu(customer, bankAccount);
                break;
        }

    }



    public static void checkBalanceWindow(Customer customer, BankAccount bankAccount){

        cls();
        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : " + customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t* ~~ CURRENT BALANCE   ::  Sh." + bankAccount.accountBalance+ "                                              ");
        print("\t\t*                                                                                    *");
        print("\t\t* -----------------------------------------------------------------------------------*");
        print("\t\t*                                                                                    *");
        print("\t\t* ~~ WITHDRAWABLE AMOUNT:: Sh." + bankAccount.accountBalance*0.75 + "                                       ");
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
            System.out.println("\n\n\n\n\n");
            mainMenu(customer,bankAccount);
        }
        else if (option == 0){
            cls();
            sleep(2000);
            System.exit(0);

        }



    }


    public static void WithdrawWindow(Customer customer, BankAccount bankAccount){

        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : "+ customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    WITHDRAWAL                                      *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");
        //withdrawal process
        int withdrawalAmount ;
        print("Enter Amount:\n\n\n\n\n");
        withdrawalAmount = sc.nextInt();

        if (withdrawalAmount <= bankAccount.accountBalance*0.75) {
            bankAccount.accountBalance -= withdrawalAmount;
            cls();
            print("\t\t**************************************************************************************");
            print("\t\t*                                 NAME      : "+customer.name);
            print("\t\t*                                                                                    *");
            print("\t\t*                                ACCOUNT NO : "+ bankAccount.accountNumber);
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*                               WITHDRAWAL SUCCESSFUL                                *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*  Confirmed successfully withdrawn::                                                 *");
            print("\t\t*        KSH: " + (double)withdrawalAmount);
            print("\t\t*                                                                                    *");
            print("\t\t*   New balance::                                                                    *");
            print("\t\t*        KSH: " + (double)bankAccount.accountBalance);
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                     |                                              *");
            print("\t\t*              1: BACK                |      0:EXIT                                  *");
            print("\t\t*                                     |                                              *");
            print("\t\t* *********************************************************************************  *");


            Transaction transaction = new Transaction("WITHDRAWAL REQUEST");
            transaction.today = new Date();
            transaction.Amount = withdrawalAmount;

            customer.transactions.add(transaction);

            int choice;
            print("Enter an option::");
            choice = sc.nextInt();

            if (choice == 1) {
                sleep(1000);
                cls();
                mainMenu(customer, bankAccount);
            }

            else{

                cls();
                //exitwindow();
                sleep(2000);
                System.exit(0);
            }

        }

        else{
            cls();
            print("NOT ENOUGH MONEY!!");
            print("TRY AGAIN");
            Operations.Withdraw(customer,bankAccount);
        }




    }



    public static void depositWindow(Customer customer, BankAccount bankAccount){

        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : " + customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t*                                    DEPOSIT                                          *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");

        int amount;

        print("Enter amount to Deposit::\n\n\n\n");
        amount = sc.nextInt();


        bankAccount.accountBalance += amount;

        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : " + customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
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
        print("\t\t*        KSH: " + (double)bankAccount.accountBalance);
        print("\t\t*                                                                                    *");
        print("\t\t*                                                                                    *");
        print("\t\t**************************************************************************************");
        print("\t\t*                                     |                                              *");
        print("\t\t*              1: BACK                |      0:EXIT                                  *");
        print("\t\t*                                     |                                              *");
        print("\t\t* *********************************************************************************  *");


        Transaction transaction = new Transaction("DEPOSIT");
        transaction.today = new Date();
        transaction.Amount = amount;

        customer.transactions.add(transaction);


        int choice;
        print("Enter an option::");
        choice = sc.nextInt();

        if (choice == 1) {
            sleep(1000);
            cls();
            mainMenu(customer, bankAccount);
        }

    }



    public static void sendMoneyWindow(Customer customer, BankAccount bankAccount){

        int balance = bankAccount.accountBalance;

        //Money sending process
        cls();
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : "+ customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : "+ bankAccount.accountNumber);
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

            bankAccount.accountBalance = balance;
            cls();
            print("\t\t**************************************************************************************");
            print("\t\t*                                 NAME      : "+ customer.name);
            print("\t\t*                                                                                    *");
            print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*                                 SEND   SUCCESSFUL                                  *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                                                                    *");
            print("\t\t*  Confirmed successfully Sent::                                                     *");
            print("\t\t*        KSH: " + (double)amount );
            print("\t\t*                                                                                    *");
            print("\t\t*  To:                                                                               *");
            print("\t\t*     "+ accountNO);
            print("\t\t*                                                                                    *");
            print("\t\t*   New balance::                                                                    *");
            print("\t\t*        KSH: " + (double)bankAccount.accountBalance);
            print("\t\t*                                                                                    *");
            print("\t\t*                                                                                    *");
            print("\t\t**************************************************************************************");
            print("\t\t*                                     |                                              *");
            print("\t\t*              1: BACK                |      0:EXIT                                  *");
            print("\t\t*                                     |                                              *");
            print("\t\t* *********************************************************************************  *");


            Transaction transaction = new Transaction("SEND MONEY");
            transaction.today = new Date();
            transaction.Amount = amount;
            transaction.credit = 0;
            transaction.debit = amount;
            customer.transactions.add(transaction);

            int choice;
            print("Enter an option::");
            choice = sc.nextInt();

            if (choice == 1) {
                sleep(1000);
                cls();
                mainMenu(customer, bankAccount);
            }



        }

        else{

            cls();
            sleep(1000);
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\t\t\t\t\t\t\t\t\t\t*        NOT ENOUGH MONEY     *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*         TRY AGAIN!          *");
            print("\t\t\t\t\t\t\t\t\t\t*                             *");
            print("\t\t\t\t\t\t\t\t\t\t*******************************");
            print("\n\n\n\n\n\n\n\n\n\n\n\n");
            sleep(2000);
            cls();


            sendMoneyWindow(customer,bankAccount);
        }
    }


    public static void bankStatementWindow(Customer customer, BankAccount bankAccount){


        cls();
        print("\n\n");
        print("\t\t**************************************************************************************");
        print("\t\t*                                 NAME      : " + customer.name);
        print("\t\t*                                                                                    *");
        print("\t\t*                                ACCOUNT NO : " + bankAccount.accountNumber);
        print("\t\t**************************************************************************************");
        print("\t\t*                                                                                    *");
        print("\t\t* ~~                              BANK STATEMENT                                     *");
        print("\t\t*                                                                                    *");
        print("\t\t* -----------------------------------------------------------------------------------*");





        for(Transaction transaction: customer.transactions){

            System.out.println("\t"+transaction.toString());


        }


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
            mainMenu(customer,bankAccount);
        }
        else if (option == 0){
            cls();
            //exitwindow();
            sleep(2000);
            System.exit(0);

        }





    }


    public static void bankAccounts(Customer customer){

        cls();
        cls();
        int i = 1;
        System.out.println("          ACCOUNTS              ");
        System.out.println("******************************");
        for(BankAccount account: customer.accounts){

            System.out.println(i + ". " + account.toString());
            i++;
        }

        System.out.println(customer.accounts);
        System.out.println("CHOOSE A BANK ACCOUNT\n\n\n\n\n\n");
        int accountChosen = sc.nextInt();

        switch (accountChosen){

            case 1:
                customer.chosenAccount = customer.accounts.get(0);
                break;
            case 2:
                customer.accounts.get(1);
                break;

            case 3:
                customer.accounts.get(2);
                break;
            case 4:
                customer.accounts.get(3);
                break;
            default:
                System.out.println("INVALID ACCOUNT OPTION!!");
                System.out.println("TRY AGAIN!!");
                bankAccounts(customer);
                break;
        }



    }

    //IMPLEMENTATION FUNCTIONS
    public static void print(String message){
        System.out.println(message);
    }
    public static void cls(){
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
