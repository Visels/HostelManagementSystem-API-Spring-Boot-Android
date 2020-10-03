package com.codeVillage.Day15.Task1;

import java.util.Date;

public class Transaction {


    public String transactionType;

    public double Amount;
    public int debit;
    public int credit;
    Date today;


    public Transaction(String transactionType) {
        this.transactionType = transactionType;
    }



    @Override
    public String toString() {
        return "\tTransaction{" +
                "Type='" + transactionType + '\'' +
                ", Amount=" + Amount +
                ", today=" + today +
                '}';
    }
}
