/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class SqlContext {
     public static ResultSet executeQuery(String sql){
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(Constants.DB_URL, Constants.USER_NAME, Constants.PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            
            // insert 
            ResultSet rs = stmt.executeQuery(sql);
            
            // close connection
            
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public static void executeUpdate(String sql){
        try {
            // crate statement
            try ( // connnect to database 'testdb'
                Connection conn = getConnection(Constants.DB_URL, Constants.USER_NAME, Constants.PASSWORD)) {
                // crate statement
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                // close connection
            }
        } catch (SQLException ex) {
        }
        
    }
    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("connect failure!");
        }
        return conn;
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER_NAME, Constants.PASSWORD);
                System.out.println("connect successfully!");
            } catch (SQLException ex) {
                Logger.getLogger(SqlContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("connect failure!");
        }
        return conn;
    }
}
