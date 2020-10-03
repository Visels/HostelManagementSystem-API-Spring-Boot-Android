package com.codeVillage.Day15.Task1;

import java.util.ArrayList;

public class BankAccount {

    public int accountBalance;
    public int accountNumber;
    public TypeOfAccount accountType;
    Currency currency;

    ArrayList<Transaction> transactions;

    public BankAccount(int accountBalance, int accountNumber, TypeOfAccount accountType, Currency currency) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return " " + accountType;
    }
}
