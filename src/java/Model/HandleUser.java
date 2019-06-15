/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
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
        
    public void createad(String pcatogory,String pname,String price,String status, InputStream in,String firstname,String oemail,String location) throws SQLException{
       
        PreparedStatement ps = connection.prepareStatement("insert into ad values (?,?,?,?,?,?,?,?)");
        ps.setString(1, pcatogory);
        ps.setString(2, pname);
        ps.setString(3,price );
        ps.setString(4,status);
        ps.setBlob(5,in);
        ps.setString(6,firstname);
        ps.setString(7,oemail);
        ps.setString(8,location);
        ps.executeUpdate();
    }
    
       public List<Ad> viewallad(){
          
          
          List<Ad> allads = new ArrayList<Ad>();         
          try {
              PreparedStatement ps1 = connection.prepareStatement("select * from ad");
              ResultSet re = ps1.executeQuery();
              while(re.next()){
                  String pcatogory = re.getString("pCategory");
                  String name = re.getString("pName");
                  String price = re.getString("price");
                  String pricec = "Rs"+price;
                  String status = re.getString("pStatus");
                  Blob image =  re.getBlob("image");
                  String oname = re.getString("Ownername");
                  String oemail = re.getString("Owneremail");
                  String location = re.getString("Location");
                  InputStream inputStream = image.getBinaryStream();
                  ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                  byte[] buffer = new byte[4096];
                  int bytesRead = -1;
 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                    }
 
                byte[] imageBytes = outputStream.toByteArray();
 
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                inputStream.close();
                outputStream.close();
               
                Ad ad1 = new Ad(pcatogory, name, pricec, status,oname,oemail,location,base64Image);
                allads.add(ad1);               
              }
             
             
                      
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
          
       return  allads;
      }
       
       public Ad getsingleadd(String email, String pname){
          
          
          try {
              PreparedStatement ps1 = connection.prepareStatement("select * from ad where Owneremail=? && pName=?");
              ps1.setString(1, email);
              ps1.setString(2, pname);
              ResultSet re = ps1.executeQuery();
              while(re.next()){
               String pcatogory = re.getString("pCategory");
               String name = re.getString("pName");
               String price = re.getString("price");
               String pricec = "Rs"+price;
               String status = re.getString("pStatus");
               String oname = re.getString("Ownername");
               String oemail = re.getString("Owneremail");
               String location = re.getString("Location");             
               Ad ad1 = new Ad(pcatogory, name, pricec, status,oname,oemail,location);
               return ad1;
                  
              }
              
              
          } catch (Exception e) {
              System.out.print(e.getMessage());
          }
             
          return null;
      }
       
       
        public void addrequest(Request req) throws SQLException{
       
        PreparedStatement ps = connection.prepareStatement("insert into request values (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,req.getProduct());
        ps.setString(2,req.getOwnername());
        ps.setString(3,req.getOwneremail() );
        ps.setString(4,req.getDuration());
        ps.setString(5,req.getRequstorname());
        ps.setString(6,req.getRequstoremail());
        ps.setString(7,req.getRequestState());
        ps.setString(8,req.getLocation());
        ps.setString(9,req.getDescription());
        ps.setString(10,req.getPayment_method());
        ps.executeUpdate();
    }
        
          public List<Request> viewmyreq(String email){
          
          
          List<Request> reqlist = new ArrayList<Request>();         
          try {
              PreparedStatement ps1 = connection.prepareStatement("select * from request where requstoremail=?");
              ps1.setString(1,email);
              ResultSet re = ps1.executeQuery();
              while(re.next()){
                  String productname = re.getString("productname");
                  String ownername = re.getString("ownername");
                  String owneremail = re.getString("owneremail");
                  String duration = re.getString("duration");
                  String requestername = re.getString("requestorname");
                  String requesteremail = re.getString("requstoremail");
                  String requeststatus = re.getString("requststatus");
                  String location = re.getString("location");
                  String description = re.getString("description");
                  String paymentmethod = re.getString("paymentmethod");
 
               
               
               Request req = new Request(productname,ownername,owneremail,duration,requestername,requesteremail,requeststatus,location,description,paymentmethod);
                reqlist.add(req);               
              }
             
             
                      
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
          
       return  reqlist;
      }
          
    public void deletereq(String pname,String owner,String email ) throws SQLException{
        try {
            
       
            PreparedStatement ps1 = connection.prepareStatement("delete from request where productname=?&&owneremail=?");
             ps1.setString(1,pname);
             ps1.setString(2,owner);                       
             ps1.executeUpdate();
              } catch (Exception e) {
                 System.out.println(e.getMessage());
        }
    }
    
    public User viewprofile(String email) throws SQLException{
         PreparedStatement ps1 = connection.prepareStatement("select * from user where email=?");
         ps1.setString(1,email);
         
         ResultSet rs = ps1.executeQuery();
         
         while(rs.next()){
             String mail= rs.getString("email");
             String fname = rs.getString("firstname");
             String lname = rs.getString("lastname");
             String cnumber = rs.getString("contactnumber");
             User u = new User(mail,fname,lname,cnumber);
             return u;
         }
        return null;
         
    }
        
       
}
