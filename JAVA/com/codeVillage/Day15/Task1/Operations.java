package com.codeVillage.Day15.Task1;

import java.util.Date;
import java.util.Scanner;

public class Operations {

    public static Database customerDatabase = new Database();



    public static void AddBankAccount(Customer customer, BankAccount bankAccount){
        customer.accounts.add(bankAccount);
    }


    public static void checkBalance(Customer customer, BankAccount bankAccount){

        int accountIndex = customer.accounts.indexOf(bankAccount);
        double balance = customer.accounts.get(accountIndex).accountBalance;


        Transaction transaction = new Transaction("BALANCE REQUEST");
        transaction.today = new Date();
        transaction.Amount = bankAccount.accountBalance;
        customer.transactions.add(transaction);
        Display.checkBalanceWindow(customer,bankAccount);

    }


    public static void Deposit(Customer customer, BankAccount bankAccount){
        Scanner sc = new Scanner(System.in);
        int accountIndex = customer.accounts.indexOf(bankAccount);
        int previousBalance = bankAccount.accountBalance;


        Transaction credit = new Transaction("CREDIT");
        credit.Amount = bankAccount.accountBalance - previousBalance;
        credit.today = new Date();

        Display.depositWindow(customer, bankAccount);

    }

    public static void Withdraw(Customer customer, BankAccount bankAccount){

        Scanner sc = new Scanner(System.in);

        int accountIndex = customer.accounts.indexOf(bankAccount);
        int previousBalance = customer.accounts.get(accountIndex).accountBalance;

        Display.WithdrawWindow(customer, bankAccount);




        Transaction debit = new Transaction("DEBIT");
        debit.Amount = previousBalance - customer.accounts.get(accountIndex).accountBalance;
        debit.today = new Date();
        customer.transactions.add(debit);


    }

    public static void sendMoney(Customer customer, BankAccount bankAccount){
        Scanner sc = new Scanner(System.in);

        int accountIndex = customer.accounts.indexOf(bankAccount);
        int previousBalance = customer.accounts.get(accountIndex).accountBalance;

        Display.sendMoneyWindow(customer,bankAccount);

    }


    public static void bankStatement(Customer customer, BankAccount bankAccount){

        Transaction transaction = new Transaction("STATEMENT REQUEST");
        transaction.today = new Date();

        Display.bankStatementWindow(customer,bankAccount);

    }



    public static void addCustomerToDatabase(Customer customer){

        customerDatabase.customerTable.add(customer);
        customerDatabase.customerPasswords.put(customer.mobileNumber,customer.pin);
    }




}
