<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style>
body{
 background-image: url("https://c0.wallpaperflare.com/preview/313/769/293/career-leadership-success-businessman.jpg");
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
<div>
<h1 align="center">Update your data</h1>
<br>
<h2 align="center">Fill all the columns</h2>
<br>
<form action="UpdateEmployeeData" method="post">
<table align="center">
<tr>
<td>First Name : </td>
<td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>LastName : </td>
<td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td> Previous gmail :</td>
<td><input type="text" name="pgmail"></td>
</tr>
<tr>
<td> New gmail :</td>
<td><input type="text" name="ngmail"></td>
</tr>
<br>
<tr><td><input  class="submit" type="submit" value="add"></td></tr>
</table>
</form>
<br>
<form action="options.jsp">
<p align="center"><input class="submit"  type="submit" value="click to go back"></p>
</form>
</div>
</body>
</html>