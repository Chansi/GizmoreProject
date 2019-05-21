<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Owner_Home</title>
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
            margin-left: 5px;
            margin-top: 30px;
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
                <a   href="Requester_Profile.jsp ">Profile</a>
                <a   href="Requester_AddReq.jsp">Add Requests</a>
                <a  href="Requester_ViewMyReq.jsp ">View My Requests</a>
                <a  class="active" href= "Requester_Home.jsp">Home</a>


            </div>
        </div> 



        <div class="table">
            <table  >
                <tr>
                    <th> Table Walter</th>
                <br>
                <th> Okidoki Table </th>
                <th> Stools Kitchen</th>
                <th> Shelf Gloria</th>
                <th> Shelf Gloria</th>
                </tr>

                <th>
                    <img src="12.png" alt=""width='250px'height='250px'/>
                     <button>Request</button> 
                </th>

                <th>
                    <img src="23.png" alt="" width='250px' height='250px'/>
                    <button>Request</button>
                </th>

                <th>
                    <img src="45.png" alt="" width='250px'height=250px'/>
                    <button>Request</button>
                </th>
                <th>
                    <img src="34.png" alt="" width='250px' height='250px'/>
                    <button>Request</button>
                </th>


                <th> 
                    <img src="5.png" alt="" width="250px" height='250px'/>
                    <button>Request</button>
                </th> 



                <c:forEach var="" items="">
                    <tr>

                    </tr>

                </c:forEach>
            </table>
            <br>
            <br>
        </div>

    </body>
</html>
