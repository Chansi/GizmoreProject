/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ad;
import Model.HandleUser;
import Model.Request;
import Model.User;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.websocket.Session;

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
            case "viewreqdata":{
                viewrequestdata(request,response);
                break;
            }
          
              case "addrequest":{
              addrequest(request, response);
                break;
            }
          
             case "Viewmyads":{
              
                break;
            }
             case "viewmyreq":{
                 viewmyrequests(request,response);
                 break;
             }
             case "deleterequest":{
                 deleterequest(request,response);
                 break;
             }
             case "viewprofile":{
                 viewprofile(request,response);
                 break;
             }
             case"viewprofileowner":{
                  viewprofileowner(request,response);
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
            String owneremail;
            String firstname;
            String location = re.getParameter("location");
            HttpSession session = re.getSession();
            owneremail = (String) session.getAttribute("email");
            firstname = (String) session.getAttribute("firstname");
            InputStream inputStream = null;
            Part im = re.getPart("image");
          
           if(im != null){
               inputStream = im.getInputStream();
           }
           // String img = re.getParameter("image");
           // Image image =  (Image) im;
           //Blob Image = org.hibernate.Hibernate.createBlob(im.ge());      
            h1.createad(product_category,produt_name,price,status,inputStream,firstname,owneremail,location);
           
            re.getRequestDispatcher("Owner_Home.jsp").forward(re, r);
           
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    private void viewrequestdata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();
      //   Ad add =(Ad)request.getAttribute("object");
         HandleUser h1 = new HandleUser();
         
         String email=request.getParameter("email");
         String name = request.getParameter("pname");
         Ad ad = h1.getsingleadd(email, name);
        session.setAttribute("adddata", ad);
        request.getRequestDispatcher("Requester_AddReq.jsp").forward(request, response);
    }
    
    public void addrequest(HttpServletRequest re, HttpServletResponse r) throws SQLException, ServletException, IOException{
        
         HttpSession session = re.getSession();
         String requestoremail=(String) session.getAttribute("email");
         String requestorname = (String) session.getAttribute("firstname");
         String productname = re.getParameter("pname");
         String ownername = re.getParameter("ownername");
         String owneremail = re.getParameter("owneremail");
         String duration = re.getParameter("duration");
         String requeststate = "Pending";
         String location = re.getParameter("location");
         String description = re.getParameter("description");
         String paymentmethod = re.getParameter("pay");
         Request request = new Request(productname, ownername, owneremail, duration, requestorname, requestoremail, requeststate, location, description, paymentmethod);
         HandleUser h1 = new HandleUser();
         h1.addrequest(request);
         List<Ad> ads = h1.viewallad();
        re.setAttribute("All_adslist", ads);
        re.getRequestDispatcher("Requester_Home.jsp").forward(re, r);
        
    }

    private void viewmyrequests(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         HandleUser h1 = new HandleUser();
         HttpSession session = request.getSession();
         String email = (String) session.getAttribute("email");
         List<Request> rlist = h1.viewmyreq(email);
         request.setAttribute("myreq", rlist);
         request.getRequestDispatcher("Requester_ViewMyReq.jsp").forward(request, response);
         
    }

    private void deleterequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        HandleUser h = new HandleUser();
       String name = request.getParameter("pname");
       String owner = request.getParameter("powner");
       String email = request.getParameter("preqemail");
       h.deletereq(name, owner, email);
       request.getRequestDispatcher("Usercontrol?commands=viewmyreq").forward(request, response);
       
       
       
       
    }

    private void viewprofile(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
         HandleUser h = new HandleUser();
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        User u = h.viewprofile(email);
        request.setAttribute("myprofile", u);
        request.getRequestDispatcher("Requester_Profile.jsp").forward(request, response);
        
    }

    private void viewprofileowner(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        HandleUser h = new HandleUser();
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        User u = h.viewprofile(email);
        request.setAttribute("myprofile", u);
        request.getRequestDispatcher("Owner_Profile.jsp").forward(request, response);
    }
    
  
}
