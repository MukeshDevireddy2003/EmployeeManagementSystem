<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
<style>
body{
 background-image: url("https://c0.wallpaperflare.com/preview/907/714/501/analyzing-brainstorming-business-people-communication.jpg");
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
<br>
<br>
<br>
<br>
<div>
<h1 align="center">Employee Login</h1>
<form action="SetData" method="post">
<table align="center">
<tr>
<td><h3>mail :</h3></td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td><h3>password :</h3></td>
<td><input  type="password" name="password"></td>
</tr>
<tr>
<td><input class="submit" type="submit" value="submit"></td>
<td><input  class="submit" type="reset" value="reset"></td>
</tr>
</form>
<br>
</table>
<h3 align="center"> 
<form action="Welcome.html">
<input class="submit" type="submit" value="goback">
</form>
</h3>
</div>
</body>
</html>