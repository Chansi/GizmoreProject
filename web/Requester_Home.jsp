<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Requstor_Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <style>
        body {
            color: #262626;
            font-size: 16px;
            line-height: 1.8;
            font-family: 'Montserrat', sans-serif;
            margin: 0;
            margin-top: 0;

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
        .table{
            margin-top: 30px;
            overflow: auto;
        }
         th, td {
            padding: 25px;
        }
    </style>
    <body>
    <body>

        <!-- <div class =" logo">
             <img src="gizmologo13.jpg" alt=""/>
!-->


        <div class ='background'>

            <img src="back.jpg" alt=""  width='100%' height ='100%'/>

        </div>
        <div class="header">
            <div class="header-right">
                <a href="index.jsp"> Logout </a>
                <a   href="Usercontrol?commands=viewprofile ">Profile</a>
                <a href="Usercontrol?commands=viewmyreq">View My Requests</a>
                <a  class="active" href= "Requester_Home.jsp">Home</a>


            </div>
        </div> 



        <div class="table">
            <table>
               <c:forEach var="pr" items="${All_adslist}">
                     <c:url var="viewlink" value="Usercontrol">
             
                    <c:param name="commands" value="viewreqdata"/>
                        <c:param name="object" value="${pr}"/>
                        <c:param name="email" value="${pr.owner_email}"/>
                        <c:param name="pname" value="${pr.pname}"/>
                        
                     </c:url>    
                <th>
                ${pr.pname} 
                             
                <img src="data:image/jpg;base64,${pr.getImage()}" alt=""width='200px'height='200px'/>
                <br>
                  ${pr.owner_name} 
                  <br>
                  ${pr.owner_email} 
                  <br>
                  ${pr.price} 
                  <br>
                   ${pr.location} 
                  <br>
                <a href=${viewlink}> Request </a>              
                </th>  
            </c:forEach>
            </table>
            <br>
            <br>
        </div>

    </body>
</html>
