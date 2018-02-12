package org.mvpigs;

import java.sql.*;


public class dbConnection extends SQLException{

    static String url = "jdbc:mysql://localhost:3306/empresa";
    static String user = "root";
    static String pass = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null){
                System.out.println("Ya va!");
            }


        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}