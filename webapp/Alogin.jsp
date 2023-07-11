<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
body{
 background-image: url("https://wallpapercave.com/wp/wp7728133.jpg");
  background-size: cover;
   background-repeat: no-repeat;
	  background-attachment: fixed;
}
div{
background-color:lavender;
width:500px;
height:350px;
margin:auto;
border-radius:30px;
}
h1
{ color:white;
background-color:blue;
}
}
.submit{
background-color:blue;
color:white;
}
.submit:hover
{
border-radius:4px;
background-color:skyblue;
color:black;
}
</style>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<div align="center">
<h1 align="center">Admin Login</h1>
<br>
<form action="Acheck" method="get">
<table align="center">
<tr>
<td><h3>username :</h3></td>
<td><input type="text" name="adminname"></td>
</tr>
<tr>
<td><h3>password :</h3></td>
<td><input type="password" name="apassname"></td>
</tr>
<tr>
<td><input class="submit"  type="submit" value="submit"></td>
<td><input class="submit"  type="reset" value="reset"></td>
</tr>
</form>
</table>
<form action="Welcome.html">
<p align=center><input class="submit"  type="submit" value="goback"></p>
</form>
</div>
</body>
</html>