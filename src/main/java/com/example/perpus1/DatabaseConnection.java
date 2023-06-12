package com.example.perpus1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {


    public static Connection getConnection(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/perpustakaan?&serverTimezone=UTC";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,user,password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Statement getStatement() throws SQLException {
        return  getConnection().createStatement();
    }
}
