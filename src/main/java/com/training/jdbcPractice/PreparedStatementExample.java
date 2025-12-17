package com.training.jdbcPractice;

import java.sql.*;

public class PreparedStatementExample {
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


//            String query = "INSERT INTO student(name, age, marks) VALUES(?,?,?)";
            String query = "SELECT * FROM student WHERE id=3";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

//            preparedStatement.setString(1, "Nasir");
//            preparedStatement.setInt(2, 22);
//            preparedStatement.setDouble(3, 98);
//            int rowsAffectd = preparedStatement.executeUpdate();
//
//            if(rowsAffectd > 0){
//                System.out.println("updated successfully");
//            }
//            else{
//                System.out.println("not updated");
//            }

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
