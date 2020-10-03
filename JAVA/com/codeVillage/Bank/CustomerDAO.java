package com.codeVillage.Bank;


import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDAO {

    public static Scanner sc = new Scanner (System.in);
    public static Connection connection = null;
    public static Statement statement = null;
    public static ResultSet resultSet = null;
    public static PreparedStatement preparedStatement = null;



    public CustomerDAO(){


    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");

        statement = connection.createStatement();

    }
    catch (Exception ex){
        ex.printStackTrace();
    }

    }



   public static void getAllCustomers() throws SQLException {

        resultSet = statement.executeQuery("Select * from customers;");

        while(resultSet.next()){
            System.out.print(resultSet.getInt("id") + ".\t");
            System.out.print(resultSet.getString("full_name") + "\t");
            System.out.print(resultSet.getString("gender")+ "\n");
        }
    }



    public static int getPin(String phone) throws SQLException {

        preparedStatement = connection.prepareStatement("Select pin from customers where phone_number = ?");
        preparedStatement.setString(1,phone);

        resultSet = preparedStatement.executeQuery();

        int pin = 0;

        while(resultSet.next()){
            pin = resultSet.getInt("pin");
        }


        return pin;
    }


    public static ArrayList<BankAccount> getBankAccounts(int id) throws SQLException {
        ResultSet resultSet = null;
        ArrayList<BankAccount> accounts = new ArrayList<>();

        preparedStatement = connection.prepareStatement("Select * from customer_accounts where customer_id = ?");
        preparedStatement.setInt(1,id);

        resultSet = preparedStatement.executeQuery();




        while(resultSet.next()){
            BankAccount temp = new BankAccount();
            ResultSet nameResults = null;
            PreparedStatement nameStatement = null;


            //select name from account_types,customer_accounts where account_types.id = ?

            temp.account_id = resultSet.getInt("id");
            temp.accountNumber = resultSet.getInt("account_number");
            temp.balance = resultSet.getDouble("balance");

            temp.name = resultSet.getInt("account_type") == 1?"SAVINGS" : "FIXED DEPOSIT";


            accounts.add(temp);
            temp = null;


        }

        return accounts;
    }


    public static int getID(String phone) throws SQLException {

        int customer_id = 0;
    preparedStatement = connection.prepareStatement("Select id from customers where phone_number = ?");
    preparedStatement.setString(1,phone);


    resultSet = preparedStatement.executeQuery();

    while(resultSet.next()){

        customer_id =resultSet.getInt("id");

    }

    return customer_id;


    }



    public static void checkBalance(BankAccount account) throws SQLException {

        System.out.println("\n\n BALANCE");

        double Balance = 0;

        ResultSet balanceResults;
        PreparedStatement balanceRequest;

        balanceRequest = connection.prepareStatement("Select balance from customer_accounts where id = ?");
        preparedStatement.setInt(1,account.account_id);

        balanceResults = preparedStatement.executeQuery();
        balanceResults.first();
        Balance = balanceResults.getDouble("balance");


//        while(balanceResults.next()){
//            Balance = balanceResults.getDouble("balance");
//        }

        System.out.println("**********************");
        System.out.println("Account:" + account.accountNumber);
        System.out.println("BALANCE :" + Balance);
        System.out.println("*********************");


        AddTransaction("BALANCE REQUEST", account.account_id, 0.00);
    }



    public static void withdraw(BankAccount account) throws SQLException {
        System.out.println("\n\n*****************");
        System.out.println("Enter amount::");
        double amount = sc.nextDouble();


        if(amount> account.balance){
            System.out.println("\n\n*****************");
            System.out.println("WITHDRAWAL FAILED!!");
            System.out.println("Your balance cannot fund the withdrawal!!");
            System.out.println("TRY AGAIN!!");
            System.out.println("*******************");
            withdraw(account);
        }
        else{

            double newBalance = account.balance - amount;
            account.balance = newBalance;

            PreparedStatement withdrawalRequest;


            withdrawalRequest = connection.prepareStatement("UPDATE customer_accounts SET balance = ? WHERE id = ?");
            withdrawalRequest.setDouble(1, newBalance);
            withdrawalRequest.setInt(2, account.account_id);

            System.out.println("***************************");
            System.out.println("WITHDRAWAL SUCCESSFUL");
            System.out.println("AMOUNT::" + amount);
            System.out.println("NEW BALANCE:"  + newBalance);
            System.out.println("****************************");
        }


        AddTransaction("WITHDRAWAL", account.account_id,amount);
    }


    public static void sendMoney(BankAccount account) throws SQLException {

        System.out.println("\n\n************************");
        System.out.println("ENTER BANK ACCOUNT TO SEND TO::");
        int bankAccount = sc.nextInt();

        PreparedStatement accountCheck;
        accountCheck = connection.prepareStatement("Select ");



        System.out.println("AMOUNT::");
        double amount = sc.nextDouble();


        if (amount > account.balance) {
            System.out.println("*********************");
            System.out.println("INSUFFICIENT BALANCE!!");
            System.out.println("TRY AGAIN!!");
            System.out.println("**********************");
            sendMoney(account);
        } else {

            account.balance -= amount;

            PreparedStatement sendMoney;

            sendMoney = connection.prepareStatement("UPDATE customer_accounts SET balance = ? WHERE id = ? ");
            sendMoney.setDouble(1, account.balance);
            sendMoney.setInt(2, account.account_id);

            sendMoney.executeUpdate();


            System.out.println("\n\n***************************************");
            System.out.println("SEND MONEY SUCCESSFUL!!");
            System.out.println("TO::" + bankAccount);
            System.out.println("AMOUNT:: " + amount);
            System.out.println("BALANCE:: " + account.balance);
            System.out.println("***************************************");


            AddTransaction("SEND MONEY", account.account_id, amount);


        }


    }

    public static void AddTransaction(String transactionName, int accountID, double amount) throws SQLException {

            PreparedStatement transactionsAddition;


            transactionsAddition = connection.prepareStatement("INSERT INTO transactions(name, account_id,amount) VALUES (?,?,?)");
            transactionsAddition.setString(1,transactionName );
            transactionsAddition.setInt(2,accountID);
            transactionsAddition.setDouble(3,amount);

            transactionsAddition.executeUpdate();

        }

    public static void processStatement(BankAccount account) throws SQLException {

        AddTransaction("STATEMENT REQUEST", account.account_id, 0.00);

        PreparedStatement statementRequest;
        ResultSet accountStatement;

        statementRequest = connection.prepareStatement("SELECT * FROM transactions WHERE account_id = ?");

        statementRequest.setInt(1,account.account_id);

        accountStatement = statementRequest.executeQuery();

        System.out.println("\n\nACCOUNT NUMBER::" + account.accountNumber);
        System.out.println("*************STATEMENT************");
        System.out.println("TYPE              AMOUNT");

        while(accountStatement.next()){
            System.out.println(accountStatement.getString("name") + "  " + accountStatement.getDouble("amount"));
        }







    }









}
