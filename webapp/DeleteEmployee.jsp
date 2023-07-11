<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<style>
body{
 background-image: url("https://img.freepik.com/premium-vector/dismissal-employee-concept-illustration-fired-sad-male-office-worker-carrying-box-unemployment-jobless-employee-job-reduction-vector-flat-style_7737-2335.jpg");
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
}
</style>
</head>
<body>
<br>
<br>
<div>
<h1 align="center"> Enter the mail id to Delete the Employee
</h1>
<form action="DeleteEmployeeData" method="get">
<p align="center"><input type="text" name="gmail"></p>
<p align="center"><input class="submit" type="submit" value="click to delete"></p>
</form>
<form action="options.jsp">
<p align="center"><input class="submit" type="submit" value="click to go back"></p>
</form>
</div>
</body>
</html>