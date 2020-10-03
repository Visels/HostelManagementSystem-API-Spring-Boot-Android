package com.codeVillage.Bank;

import com.codeVillage.Day19.Bank;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.codeVillage.Day15.Task1.Display.sleep;





public class Client {

    public static int customer_id;
    public static BankAccount customer_account ;
    public static Scanner sc = new Scanner(System.in);




    public static void main(String[] args) throws SQLException {

        System.out.println("Mobi Bank");
        Login();
        chooseAccount();
        mainMenu(customer_account);

    }


    public static void Login() throws SQLException {

        CustomerDAO pinDAO  = new CustomerDAO();

        String phoneNumber;
        int userInputPin = 0;

        int databasePin = 0;


        System.out.println("\n\n\n\nEnter your phone number");
        phoneNumber = sc.nextLine();

        databasePin = pinDAO.getPin(phoneNumber);

        if(databasePin == 0){
            System.out.println("User does not exist try again");
            Login();
        }
        else{
            System.out.println("Enter pin::");
            userInputPin = sc.nextInt();



                    if(userInputPin == databasePin){
                        System.out.println("Login successful!!");
                        customer_id =pinDAO.getID(phoneNumber);
                        chooseAccount();

                    }
                    else{
                        System.out.println("Wrong pin try again");
                            Login();
                                }
        }
    }


    public static void chooseAccount() throws SQLException {

        CustomerDAO accountsDAO = new CustomerDAO();
        int index=0;
        System.out.println("SELECT ACCOUNT");
        for(BankAccount account :accountsDAO.getBankAccounts(customer_id)){
            System.out.println((index+1)+"."+account.name);
            index++;
        }

        ArrayList<BankAccount> customer_accounts = accountsDAO.getBankAccounts(customer_id);


        System.out.println("ENTER THE ACCOUNT TO USE::");
        int userChoiceAccount = sc.nextInt();


        //System.out.println(customer_accounts.);

            customer_account = accountsDAO.getBankAccounts(customer_id).get(userChoiceAccount-1);

            System.out.println("Account successfully chosen!!");
            System.out.println("Name::" + customer_account.name);
            System.out.println("NUMBER::" + customer_account.accountNumber);
            sleep(2000);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }



    public static void mainMenu(BankAccount account) throws SQLException {
        CustomerDAO customerDAO = new CustomerDAO();

        System.out.println("\n\n\t\tMAIN MENU");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. WITHDRAW");
        System.out.println("3.SEND MONEY");
        System.out.println("4. STATEMENT");
        System.out.println("5.LOG OUT");
        System.out.println("6.EXIT");

        int option;
        System.out.println("Enter your option");
        option = sc.nextInt();

        switch (option){

            case 1:
                CustomerDAO.checkBalance(customer_account);
                mainMenu(customer_account);
                break;

            case 2:
                customerDAO.withdraw(customer_account);
                mainMenu(customer_account);
                break;

            case 3:
                customerDAO.sendMoney(customer_account);
                mainMenu(customer_account);
                break;

            case 4:
                customerDAO.processStatement(customer_account);
                mainMenu(customer_account);
                break;

            case 5:
                System.out.println("\n\n\n************BANK OF CHOICE*********");
                Login();
                break;

            case 6:
                System.out.println("******************");
                System.out.println("GOODBYE!!");
                System.exit(0);








        }










    }

}
