/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;
/**
 *
 * @author chanura
 */
public class HandleUser {
    
      private Connection connection;

    public HandleUser() {
        connection = Validate.getConnection();
    }
    
        public void registeruser(User user){
            
        try {
            
            PreparedStatement ps = connection.prepareStatement("insert into user values (?,?,?,?,?,?)");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstname());
            ps.setString(4, user.getLastname());
            ps.setString(5, user.getUtype());
            ps.setString(6, user.getContactnumber());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
        
       public String  identifyaccout(User user) throws SQLException{
        String email= user.getEmail();
        String password = user.getPassword();
        
        try {
            PreparedStatement ps = connection.prepareStatement("select email,password,Utype from user");
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String Email = rs.getString("email");
            String Password = rs.getString("password");
            String accounttype= rs.getString("Utype");
            
            if(Email.equals(email)&& Password.equals(password)&& accounttype.equals("Admin")){
                            return "Admin";
        }
            else if(Email.equals(email)&& Password.equals(password)&& accounttype.equals("Owner")){
                    return "Owner";
            }
            
            else if(Email.equals(email)&& Password.equals(password)&& accounttype.equals("Requester")){
                    return "Requester";
            }
            
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    return "Invalid";
    
    }  
        
        
    public String getName(String email) throws SQLException{
         PreparedStatement ps = connection.prepareStatement("select firstname from user where email=?");
         ps.setString(1,email);
         ResultSet rs = ps.executeQuery();
         
         while(rs.next()){
             String Email= rs.getString("firstname");
             return Email;
         }
        return null;
    }
        
    public void createad(String pcatogory,String pname,String price,String status, InputStream in) throws SQLException{
       
        PreparedStatement ps = connection.prepareStatement("insert into ad values (?,?,?,?,?)");
        ps.setString(1, pcatogory);
        ps.setString(2, pname);
        ps.setString(3,price );
        ps.setString(4, status);
        ps.setBlob(5,in);
        ps.executeUpdate();
    }
    
}
