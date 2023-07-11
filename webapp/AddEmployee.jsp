<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<style>
body{
 background-image: url("https://e1.pxfuel.com/desktop-wallpaper/1003/321/desktop-wallpaper-office-workers-2018-in-business-workers.jpg");
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
background-color:skyblue;
}
</style>
</head>
<body>
<br>
<div>
<h1 align="center">Add An Employee</h1>
<form action="AddEmployeeData" method="post">
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
<td> gmail :</td>
<td><input type="text" name="gmail"></td>
</tr>
<tr>
<td>Gross salary :</td>
<td><input type="text" name="grosspay"></td>
</tr>
<tr>
<td>Total allowances percentage :</td>
<td><input type="text" name="Tallowances"></td>
</tr>
<tr><td><input class="submit" type="submit" value="add"></td></tr>
</table>
</form>
<br>

<form action="options.jsp">
<p align="center"><input  class="submit" type="submit" value="click to go back"></p>
</form>
</div>
</body>
</html>