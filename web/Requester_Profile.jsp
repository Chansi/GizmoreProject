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
        <title>Requester_Profile</title>
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
   
        .signupbox{
            width: 800px;
            height: 435px;
            background: white;
            color: black;
            top: 30%;
            left: 20%;
            position: absolute;
            transform: translate (-50%,-50%);
            box-sizing: border-box;  
            padding:  70px 30px;
        }

        .signupbox h1{
            margin: 0;
            padding: 0 0 20px;
            font-size: 20px;
            margin-top: 45px;
            text-transform: uppercase;
            margin-left: 43%;
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
            width: 100%;
            padding: 10px 20px;
            display: inline-block;
            border-radius: 4px;
            box-sizing: border-box;

        }

        .signupbox .submit{
            font-size: 15px;
        }
        .signupbox .submit :hover{
            cursor: pointer;
        }


        table, td, th {
            border: 1px solid black;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th {
            height: 50px;
            font-weight: bold;
            color: white;
            background-color: black;
        }
        .tr{
            color: black;
            font-size: 25px;

        }
        .table{
            margin-top: 2px;
        }

        .Update  a {

            color: black;
            text-align: center;
            font-family:Bahnschrift;
            background-color: black;
            color: white;
            padding: 12px 20px;
            border: none;
            cursor: pointer;

        }
        .Update{
            margin-right: 1%;
            margin-top: 20%;
            text-align: end;
        }
        .avatar{
            width: 100px;
            height: 100px;
            border-radius: 50%;
            position: absolute;
            top:2px;
            left: 45%;



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
              <a href="index.jsp"> Logout </a>
                <a   class="active" href="Requester_Profile.jsp ">Profile</a>
                <a   href="Requester_AddReq.jsp">Add Requests</a>
                <a  href="Requester_ViewMyReq.jsp ">View My Requests</a>
                <a  href= "Requester_Home.jsp">Home</a>

            </div>
        </div> 

  
            <div class ="signupbox">
                
                <img src="sinin.jpg" class = "avatar"/>
                <h1> My Profile</h1>

                <div class="table">
                    <table>
                        <tr>
                            <th> Email Address</th>
                            <th> Full Name </th>
                            <th> User Type </th>


                        </tr>

                        <tr>
                            <td>${req.email}</td>
                            <td>${req.name}</td>

                        </tr>
                        </c:forEach>

                    </table>

                </div>

                <div class ="Update">
                    <a href=" ">Update Details</a>

                </div>

                </body>
                </html>