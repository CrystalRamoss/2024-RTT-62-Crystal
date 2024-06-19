package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "Sql5390341!";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);

            Scanner scanner = new Scanner("System.in");
            System.out.println("Enter the frist name of the employee you want to search for:");
            String input = scanner.nextLine();
            String SelectSQL = "SELECT * FROM employees WHERE firstname = ? OR lastname = ?";
            String lastnameInput = "Doe";

            PreparedStatement stmt = connection.prepareStatement(SelectSQL);
            stmt.setString(1,input);
            stmt.setString(2,lastnameInput);

            ResultSet result = stmt.executeQuery();

            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstName");
                String lname  = result.getString("lastName");
                String email = result.getString("email");
                String jobTitle = result.getString("job_title");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname + "|"+ email + "|"+ jobTitle);
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
