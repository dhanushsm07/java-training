package com.training.jdbcPractice;

import java.sql.*;

public class StatementExample {

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
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID : " + id +","+" Name : "+name+","+" Age : "+age+","+" Marks : "+marks);
            }

            //String query = String.format("INSERT INTO student(name, age, marks) VALUES('%s', %o, %f)", "Nasir", 22, 90.2);
            //String query = String.format("UPDATE student SET marks = %f WHERE id = %d", 95.0, 2);
            //String query = String.format("DELETE FROM student WHERE id = %d", 2);


            //int rowsAffectd = statement.executeUpdate(query);
            //if(rowsAffectd > 0){
//                System.out.println("updated successfully");
//            }
//            else{
//                System.out.println("not updated");
//            }



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
