<%-- 
    Document   : Visitor_About
    Created on : May 1, 2019, 12:24:20 PM
    Author     : Keshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visitor_WhyGizmor</title>
    </head>

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
        .aboutImage{
            margin-left: 0%; 
        }
    </style>

    <body>

    <body>
    <body>
        <div class="header">
            <div class ='background'>

                <img src="Header (2).png" alt="" width='100%' height ='100%'/>

            </div>
            <div class="header-right">
                <a   href="signUp.jsp">Signup</a>
                <a  href="Login.jsp ">Login</a>
                <a  class="active" href="Visitor_WhyGizmor.jsp"> Why Gizmor </a>
                <a  href="Visitor_AllReq.jsp ">All Requests</a>
                <a  href= "signUp.jsp">Post Your Ad</a>
                <a  href= "index.jsp">Home</a>

            </div>
        </div> 

        <div class="aboutImage">
            <img src="about.png" alt=""height ="100%" width="100%"/>
        </div>
    </body>
</html>

