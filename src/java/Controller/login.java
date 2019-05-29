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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author chanura
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User user = new User(email,password);
        String accouttype =null;
        String firstname = null;
        
        HandleUser h1 = new  HandleUser();
        
        try {
            accouttype = h1.identifyaccout(user);
            firstname =  h1.getName(email);
        } catch (Exception e) {
           System.out.println(e.getStackTrace()) ;
        }
        
        switch (accouttype){
            case "Admin":{
               HttpSession session = request.getSession();
                session.setAttribute("firstname", firstname);
                session.setAttribute("email", email);
                RequestDispatcher dis = request.getRequestDispatcher("Adminhome.jsp");
                dis.forward(request, response);
                break;
            }
            case "Owner":{
               HttpSession session = request.getSession();
               session.setAttribute("firstname", firstname);
               session.setAttribute("email", email);
               RequestDispatcher dis = request.getRequestDispatcher("Owner_Home.jsp");
               dis.forward(request, response);
               break;
            }
            case "Requester":{
               HttpSession session = request.getSession();
               session.setAttribute("firstname", firstname);
               session.setAttribute("email", email);
               RequestDispatcher dis = request.getRequestDispatcher("Requester_Home.jsp");
               dis.forward(request, response);
              
               break;
            }
            default:{
                String message = "Invalid creadintial";
                response.sendRedirect("Login.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
            }
            }
    }

 

}
