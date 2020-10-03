package com.codeVillage.Day19;

import java.sql.*;

import java.util.Scanner;

public class Final {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Connection connection;
        Statement statement;
        ResultSet resultSet;
        PreparedStatement preparedStatement;


        try

        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select pin from customers where id = 1");
            System.out.println("Query executed successfully");
            System.out.println(resultSet);


        }

        catch (Exception ex)

        {
            ex.printStackTrace();
        }

    }
}