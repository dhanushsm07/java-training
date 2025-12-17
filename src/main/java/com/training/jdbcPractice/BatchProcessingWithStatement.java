package com.training.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessingWithStatement {
    private static final String url = "jdbc:mysql://localhost:3306/student_db";
    private static final String userName = "root";
    private static final String password = "Dhanush@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println("Enter name :");
                String name = scanner.next();
                System.out.println("ENTER AGE :");
                int age = scanner.nextInt();
                System.out.println("ENTER MARKS");
                double marks = scanner.nextDouble();

                System.out.println("DO YOU HAVE MORE UPDATES (Y/N) :");
                String choice = scanner.next();

                String query = String.format("INSERT INTO student(name, age, marks) VALUES('%s', %o, %f)", name, age, marks);
                statement.addBatch(query);

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            statement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
