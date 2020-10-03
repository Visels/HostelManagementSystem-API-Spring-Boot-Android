package com.codeVillage.Day15.Task1;

import java.util.ArrayList;

public class Customer {

    public String name;
    public String address;
    public String mobileNumber;
    public int idNumber;
    public int pin;
    public BankAccount chosenAccount;

    public ArrayList<BankAccount> accounts = new ArrayList<>();
    public ArrayList<Transaction> transactions= new ArrayList<>();//enums



    public Customer(String name, String address, String mobileNumber, int idNumber, int pin) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.idNumber = idNumber;
        this.pin = pin;
    }
}
