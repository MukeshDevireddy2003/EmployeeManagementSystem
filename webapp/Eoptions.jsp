<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee options</title>
<style>
body{
 background-image: url("https://thereceptionist.com/wp-content/uploads/2022/06/FEATURED-IMAGE-The-Receptionist-7-11-22-Employee-Retention-Strategies-for-2022.jpg");
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
<div>
<h1 align="center"> choose your operations</h1>
<form action="ChooseCheck" method="get">
<h2 align="center"><input class="submit" type="submit" value="view profile" name="check"></h2>
</form>
<form action="ChooseCheck" method="get">
<h2 align="center"><input class="submit" type="submit" value="update profile" name="check"></h2>
</form>
<form action="ChooseCheck" method="get">
<h2 align="center"><input class="submit"  type="submit" value="logout" name="check"></h2>
</form>
</div>
</body>
</html>