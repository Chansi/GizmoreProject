/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ad;
import Model.HandleUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chanura
 */
public class Start extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        try{
        String command = request.getParameter("commands");
        
        if(command==null){
        viewallads(request, response);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        }
         switch(command){
            case "Ownerhome":{
                viewalladsowner(request, response);
                 request.getRequestDispatcher("Ower_Home.jsp").forward(request, response);
                break;
            }          
            case "createad":{
               
            }
          
        
        
         }
        }catch(Exception ex){
            ex.setStackTrace(ex.getStackTrace());
        }
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
      public void viewallads(HttpServletRequest requeset, HttpServletResponse response) throws ServletException, IOException{
        HandleUser use = new HandleUser();
        List<Ad> ads = use.viewallad();
        requeset.setAttribute("All_adslist", ads);
        requeset.getRequestDispatcher("index.jsp").forward(requeset, response);
    }
      
        public void viewalladsowner(HttpServletRequest requeset, HttpServletResponse response) throws ServletException, IOException{
        HandleUser use = new HandleUser();
        List<Ad> ads = use.viewallad();
        requeset.setAttribute("All_adslist", ads);
        requeset.getRequestDispatcher("Owner_Home.jsp").forward(requeset, response);
    }
      
}
