<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<style>
body{
 background-image: url("https://e1.pxfuel.com/desktop-wallpaper/208/617/desktop-wallpaper-employee.jpg");
  background-size: cover;
   background-repeat: no-repeat;
	  background-attachment: fixed;
}
div{
background-color:lavender;
width:500px;
height:350px;
margin:auto;
      border-top-left-radius: 30px;
	   border-top-right-radius: 30px;
	    border-bottom-left-radius: 30px;
	     border-bottom-right-radius: 30px;
}
h1{
margin-top: 20px;
padding-top:20px;
color:white;
background-color:teal;
}
.submit{
border-radius: 4px;
background-color:teal;
color:white;
}
.submit:hover
{ color:blue;
}</style>
</head>
<body>
<br>
<br>
<div>
<h1 align="center"> Enter the mail id to Display the Employee
</h1>
<form action="DisplayEmployee.jsp" method="get">
<p align="center"><input type="text" name="gmail"></p>
<p align="center"><input class="submit" type="submit" value="click to display"></p>
</form>
<form action="options.jsp">
<p align="center"><input class="submit" type="submit" value="click to go back"></p>
</form>
</div>
</body>
</html>