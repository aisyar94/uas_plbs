/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 */
public class Connect {
    
    public static Connection getConnect(){
        Connection con;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dakwah", "root", "");
            return con;
        }catch (SQLException | ClassNotFoundException exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Connect.getConnect();
    }
}