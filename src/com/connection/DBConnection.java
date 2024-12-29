package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    public static Connection getConnection() 
    {
        Connection conn = null;

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return conn;
    }
}
