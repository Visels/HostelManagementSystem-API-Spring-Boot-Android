package com.codeVillage.Day19;

import java.sql.*;
import java.util.Scanner;

    public class Bank {

        public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            PreparedStatement preparedStatement;

            try{


                Class.forName("com.mysql.cj.jdbc.Driver");
                //connect to the database using connection url
                //username & password
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank?serverTimezone=UTC&user=root&password=123456789");

                //after connection we need to issue queries to the db
                statement = connection.createStatement();

                //select query
                resultSet = statement.executeQuery("select * from customers;");
                while (resultSet.next()){
                    System.out.println("ID: "+resultSet.getInt("id"));
                    System.out.println("ID NUMBER: "+resultSet.getString("id_number"));
                    System.out.println("Full Name: "+resultSet.getString("full_name"));
                    System.out.println("Gender: "+resultSet.getString("gender"));
                    System.out.println("**************************");

                }


                //insert customer into the database
                System.out.println("Enter Name");
                String name=scanner.nextLine();

                System.out.println("Enter ID Number");
                String idNumber=scanner.next();

                System.out.println("Enter gender");
                String gender=scanner.next();

                System.out.println("Enter pin");
                int pin = scanner.nextInt();

                preparedStatement = connection.prepareStatement("insert into customers(id_number,full_name,gender, pin) values(?,?,?,?)");
                preparedStatement.setString(1,idNumber);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,gender);
                preparedStatement.setInt(4, pin);
                preparedStatement.executeUpdate();



                //select query
                resultSet = statement.executeQuery("select * from customers;");
                while (resultSet.next()){
                    System.out.println("ID: "+resultSet.getInt("id"));
                    System.out.println("ID NUMBER: "+resultSet.getString("id_number"));
                    System.out.println("Full Name: "+resultSet.getString("full_name"));
                    System.out.println("Gender: "+resultSet.getString("gender"));
                    System.out.println("**************************");

                }



            } catch (Exception ex){
                ex.printStackTrace();
            } finally {
                if (connection!=null || resultSet!=null){
                    try {
                        connection.close();
                        resultSet.close();
                    } catch (Exception ex){

                    }

                }

            }


        }
    }

