/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HandleUser;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chanura
 */
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
        String command = request.getParameter("command");
        if(command==null){
           
        }
         switch(command){
            case "Reg":{
                registeruser(request, response);
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
        
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
  }
    
    
}
