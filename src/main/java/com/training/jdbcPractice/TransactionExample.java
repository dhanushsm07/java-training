package com.training.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionExample {
    private static final String url = "jdbc:mysql://localhost:3306/student_db";
    private static final String userName = "root";
    private static final String password = "Dhanush@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
            connection.setAutoCommit(false); //turns off auto commiting

            String query = "INSERT INTO student(name, age, marks) VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println("Enter name :");
                String name = scanner.next();
                System.out.println("ENTER AGE :");
                int age = scanner.nextInt();
                System.out.println("ENTER MARKS");
                double marks = scanner.nextDouble();

                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setDouble(3, marks);

                System.out.println("DO YOU HAVE MORE UPDATES (Y/N) :");
                String choice = scanner.next();


                preparedStatement.addBatch();

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            try {
                connection.rollback(); //rollbacks if any exception occurs
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
