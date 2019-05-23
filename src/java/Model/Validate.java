/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chanura
 */
public class Validate {
     public static Connection getConnection() {
        String URL = "jdbc:mysql://localhost:3306/gizmor";
        String username = "root";
        String password = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            return con;
        }
        catch(Exception ex){
            System.out.println ("database.getConnection() Error-->" +ex.getMessage());
            return null;
        }
    }

    public static void close (Connection con){
        try{
            con.close();
        }
        catch(Exception ex){
    }
    }
    
}
