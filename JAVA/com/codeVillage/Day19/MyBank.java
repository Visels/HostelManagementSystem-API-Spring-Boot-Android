package com.codeVillage.Day19;

import java.sql.*;
import java.util.Scanner;


public class MyBank {


    public static void main(String[] args) {


    Scanner sc  = new Scanner(System.in);
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;


    try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        //connect to the database using connection url
        //username & password
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");

        System.out.println("Connection has been established");
        statement = connection.createStatement();

        resultSet = statement.executeQuery("Select * from customers");

        System.out.println("The customers have been fetched!!");

    }
    catch (Exception ex){
        ex.printStackTrace();
    }
    finally {
        if(connection!= null || resultSet != null){

            try{
                connection.close();
                resultSet.close();
            }
            catch (Exception ex){

            }
        }
    }









    }




}
