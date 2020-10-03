package com.codeVillage.Day19;


import java.util.Scanner;
import java.sql.*;

public class Sample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        System.out.println("Enter username::");
        String userInput = sc.nextLine();




        try{




            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");

            statement = connection.createStatement();

            System.out.println("Connection established");
            resultSet = statement.executeQuery("select * from customers;");







        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
