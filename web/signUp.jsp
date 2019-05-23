<%-- 
    Document   : signUp
    Created on : Apr 28, 2019, 1:58:33 PM
    Author     : Keshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
        <style>
            body {
                color: #262626;
                font-size: 16px;
                line-height: 1.8;
                font-family: 'Montserrat', sans-serif;
                margin: 0;
                margin-top: 0;
                background: #efefef;
                color: #777;

            }


            .header .container {
                text-transform: lowercase;
                color: #fff;
                text-decoration: none;
                padding: 20px 0;
                font-size: 12px;
                line-height: 1;
            }

            .header .header-right {
                position: absolute;
                top: 8px;
                right: 16px;
            }

            .header a.active {
                color: white;
                text-decoration: underline;
            }

            .header a:hover {
                background-color: #ddd;
                color: black;
                text-decoration: underline;

            }
            .header a {
                float: right;
                color: white;
                text-align: center;
                padding: 12px;
                text-decoration: none;
                font-size: 20px; 

            }


            .signupbox{
                width: 420px;
                height: 660px;
                background: white;
                color: black;
                top: 30%;
                left: 24%;
                position: absolute;
                transform: translate (-50%,-50%);
                box-sizing: border-box;  
                padding:  70px 30px;
            }

            .avatar{
                width: 90px;
                height: 90px;
                border-radius: 50%;
                position: absolute;
                top:-20px;
                left: 35%;
            }

            h1{
                margin: 0;
                padding: 0 0 20px;
                text-align: center;
                font-size: 22px;
                margin-top: 0px;
                text-transform: uppercase;
            }

            .signupbox p{
                margin: 0;
                padding: 0;
                line-height: 1.6;
                font-size: 15px;

            }

            .signupbox input{
                width: 100%;
                margin-bottom: 10px;

            }

            .form{
                height: 30%;
                width: 100%;
                padding: 10px 20px;
                display: inline-block;
                border-radius: 4px;
                box-sizing: border-box;
                margin-top: 1px;

            }

            .signupbox .submit{
                font-size: 15px;
            }

            .signupbox .submit :hover{
                cursor: pointer;
            }

            .submit {
                background-color: whitesmoke;
                color: black;
                padding: 10px 18px;
                border: none;
                cursor: pointer;
                margin-left: 10px;
                margin-top: 5px;
            }
            .imageright{
                top: 18.5%;
                right: 16.5%;
                position: absolute;
                transform: translate (-50%,-50%);
                padding:  70px 30px;
            }



        </style>
    </head>


    <body>
    <body>
        <div class="header">
            <div class ='background'>

                <img src="Header (2).png" alt="" width='100%' height ='100%'/>

            </div>
            <div class="header-right">
                <a  class="active" href="signUp.jsp">Signup</a>
                <a  href="Login.jsp ">Login</a>
                <a href="Visitor_WhyGizmor.jsp"> Why Gizmor </a>
                <a  href="Visitor_AllReq.jsp ">All Requests</a>
                <a  href= "signUp.jsp">Post Your Ad</a>
                <a  href= "index.jsp">Home</a>

            </div>
        </div> 


        <!--  <div class ="background">
              <img src="signup.png" alt="" />
          </div> !-->




        <div class ="body">


            <div class ="signupbox">
                <img src="sinin.jpg" class = "avatar"/>
                <h1> Sign Up Here </h1>
                <div class ="form">

                    <form action="Usercontrol" method="Post">
                        <input type ="hidden" name ="command" value ="Reg"/>


                        <p>Email Address </p>
                        <input type ="email" name = "email"  required placeholder= "Enter Email address">
                        <br>
                        <p> First name </p>
                        <input type ="text" name = "fname" required placeholder= "Enter Frist Name">
                        <br>
                        
                        <p> Last name </p>
                        <input type ="text" name = "lname" required placeholder= "Enter Last Name">
                        <br>
                       
                        <p> contact </p>
                        <input type ="text" name = "contact" required placeholder= "Enter Contact number">
                        <br>
                        <p> User Type </p>
                         <select id="accounttype" name="Utype" required placeholder= "Account type">
                         <option value="Owner">Owner</option>
                         <option value="Requester" >Requester</option>  
                         </select>
                        <br>
                        <br>
                        <p> Password </p>
                        <input type ="password" name = "password" required placeholder= "Create a password">
                        <br>
                        
                        <p> Confirm Password </p>
                        <input type ="password" name = "cpassword" required placeholder= "Confirm your password">
                        <br>
                       

                        <input type="submit" value="Submit" class = "submit">
                        <br>
                        <a href="Login.jsp" class="linkacc"> <p style="text-indent: 5em;"> Already have an account? </p> </a>

                    </form>
                </div>
            </div>


            <div class="imageright">
                <img src="1.png" alt=""    width= 400px
                     height= 460px/>

            </div>

        </div>


    </body>
</html>
