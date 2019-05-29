/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ad;
import Model.HandleUser;
import Model.User;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author chanura
 */
@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)
public class Usercontrol extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try{
        String command = request.getParameter("commands");
        
        if(command==null){
           
        }
         switch(command){
            case "Reg":{
                registeruser(request, response);
                break;
            }
            
               case "createad":{
                creat_an_add(request, response);
                break;
            }
        
        
         }
        }catch(Exception ex){
            ex.setStackTrace(ex.getStackTrace());
        }
    }


  public void registeruser(HttpServletRequest re, HttpServletResponse r){
      try{
          
        HandleUser h1 = new HandleUser();
        
        String email = re.getParameter("email");
        String password = re.getParameter("password");
        String firstname = re.getParameter("fname");
        String lastname= re.getParameter("lname");
        String accounttype = re.getParameter("Utype");
        String contact = re.getParameter("contact");
        
        User user = new User(email, password, firstname, lastname, accounttype, contact);
        h1.registeruser(user);
        re.getRequestDispatcher("Login.jsp").forward(re, r);
        
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
  }
    
         public void creat_an_add(HttpServletRequest re,HttpServletResponse r){
        try {
            
            HandleUser h1 = new HandleUser();
            String product_category = re.getParameter("pcategory");
            String produt_name = re.getParameter("Pname");
            String price = re.getParameter("price");
            String status = re.getParameter("status");
 
            InputStream inputStream = null;
            Part im = re.getPart("image");
          
           if(im != null){
               inputStream = im.getInputStream();
           }
           // String img = re.getParameter("image");
           // Image image =  (Image) im;
           //Blob Image = org.hibernate.Hibernate.createBlob(im.ge());
        

             
       
            h1.createad(product_category,produt_name,price,status,inputStream);
            re.getRequestDispatcher("Owner_Home.jsp").forward(re, r);
           
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
