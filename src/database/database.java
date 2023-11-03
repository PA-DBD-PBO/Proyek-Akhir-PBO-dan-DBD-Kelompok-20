/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author Asus-GK
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    private static Connection mysqlconfig;
    public static Connection configDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/wahana_bermain";
            String user = "root";
            String password = "";
            mysqlconfig = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Koneksi gagal"+e.getMessage());                    
        }
        return mysqlconfig;
    }
}