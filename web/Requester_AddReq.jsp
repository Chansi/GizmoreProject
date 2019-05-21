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
        <title>Requester_AddReq</title>
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






        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: black;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: 	#A9A9A9;
        }

        .form {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
            color: black;
            margin-left: 2%;
        }

        .text{
            font-family: 'Montserrat', sans-serif;
            color: black;
            margin-left: 5%;
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
                <a   href="Requester_Profile.jsp ">Profile</a>
                <a   class="active" href="Requester_AddReq.jsp">Add Requests</a>
                <a  href="Requester_ViewMyReq.jsp ">View My Requests</a>
                <a  href= "Requester_Home.jsp">Home</a>

            </div>
        </div> 



        <div class ="text">
            <h2>Add a request now!</h2>
        </div>



        <div class ="form">
            <form action=" ">


                <label for="pName">Product Name</label>
                <input type="text"  id="pName" placeholder="Enter product name.."required>

                <label for="cate">Product Category </label>
                <input type="text" id="cate"  placeholder="Enter product Category.."  required>

                <label for="duration">Duration </label>
                <input type="text" id="duration"  placeholder="Enter the duration.."required>

                <label for="des">Description </label>
                <input type="text" id="des"  placeholder="Description, if necessary..">


                <label for="pay">Payment  required</label>
                <select id="country" name="pay">
                    <option value="cash">Cash</option>
                    <option value="credit">Credit Card</option>
                    <option value="debit">Debit Card</option>
                </select>


                <label for="add">Address </label>
                <input type="text" id="add"  placeholder="Enter your Address.."  required>


                <label for="cont">Contact number </label>
                <input type="text" id="cont"  placeholder="Enter contact details.."  required>

                <input type="submit" value="Submit">

            </form>
        </div>

        
    </div>








</body>
</html>
