<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin options</title>
<style>
body{
 background-image: url("https://www.berkeleywellbeing.com/uploads/1/9/4/8/19481349/the-importance-of-mental-health-in-the-workplace_orig.jpg");
  background-size: cover;
   background-repeat: no-repeat;
	  background-attachment: fixed;
}
div{
background-color:lavender;
width:500px;
height:450px;
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
<h1 align='center'> welcome admin</h1>
<h3 align='center'>
<form action="adminoptionscheck" method="get"><input class="submit" type="submit" value="Add an employee" name='check'></form>
<p></p>
<form action="adminoptionscheck" method="get"><input class="submit" type="submit" value="Delete an employee" name='check'></form>
<p></p>
<form  action="adminoptionscheck" method="get"><input class="submit" type="submit" value="Update an employee" name='check'></form>
<p></p>
<form  action="adminoptionscheck" method="get" ><input class="submit" type="submit" value="Display an employee" name='check'></form>
<p></p>
<form  action="adminoptionscheck" method="get" ><input class="submit" type="submit" value="Display all employee details" name='check'></form>
<p></p>
<form  action="adminoptionscheck" method="get" ><input class="submit" type="submit" value="Logout" name='check'></form>
</h3>
</div>
</body>
</html>