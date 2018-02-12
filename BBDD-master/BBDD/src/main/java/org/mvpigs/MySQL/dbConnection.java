package org.mvpigs.MySQL;

import java.sql.*;


public class dbConnection {
    private static String url = "jdbc:mysql://localhost:3306/empresa";
    private static String user = "root";
    private static String password = "1234";


    public static ResultSet executeQueryRS(String query) {
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stm;
            ResultSet rs = null;
            if (conn != null) {
                System.out.println("Conexión OK!");
                stm = conn.createStatement();
                rs = stm.executeQuery(query);
            }
            if (rs != null){
                return rs;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return null;

    }


    public static int executeUpdate(String queryIns) {
        Connection conn;

        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stm;
            int result = -1;

            if (conn != null) {
                System.out.println("Conexión OK!");
                stm = conn.createStatement();
                result = stm.executeUpdate(queryIns);
            }
            if (result != -1){
                return result;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return -1;

    }
}