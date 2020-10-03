package com.codeVillage.Day15.Task1;
import java.util.*;
import java.util.Scanner;

public class ClientTerminal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Currency currency = new Currency("Shilling", 254, "KSH.");

        BankAccount MainAccount = new BankAccount(1000, 3465655, TypeOfAccount.RecurringDepositAccount, currency);
        BankAccount SavingsAccount = new BankAccount(20000,45643454,TypeOfAccount.SavingsAccount,currency);
        BankAccount FixedDepositAccount = new BankAccount(23345,67346773,TypeOfAccount.FixedAccount,currency);
        Customer ken = new Customer("KEN", "34 KAREN", "0723456194", 234590, 1234);
        ken.accounts.add(MainAccount);
        ken.accounts.add(FixedDepositAccount);
        ken.accounts.add(SavingsAccount);
        Operations.addCustomerToDatabase(ken);



        //MAIN OPERATIONS
        boolean exitApp = false;


        while(!exitApp) {


            Display.WelcomeWindow();

            Display.loginWindow();

            Display.bankAccounts(ken);

            Display.mainMenu(ken, ken.chosenAccount);

            exitApp = true;


    }

    }


}