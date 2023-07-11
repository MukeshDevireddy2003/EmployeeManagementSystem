<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,jakarta.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>your profile</title>
<style>
body{
 background-image: url("https://c0.wallpaperflare.com/preview/128/229/315/entrepreneurs-accounting-analyzing-opposite.jpg");
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
<%

ResultSet rs=null;
Connection con=null;
 try{
	 String gmail=(String)session.getAttribute("gmail");
	   Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://127.0.0.1:3306/softwareemployee";
			String password="Mukesh@2003";
			 con=DriverManager.getConnection(server,"root",password);
			String query="select * from employee where gmail='"+gmail+"';";
			Statement st=con.createStatement();
			rs=st.executeQuery(query);
 }
catch(Exception e)
{  
out.println("<h1 align='center'> Error occured</h1>");
	RequestDispatcher r=request.getRequestDispatcher("/Eoptions.jsp");
	r.include(request, response);
}   
%>
<%  try{
	rs.next();
  String g=rs.getString("firstname");
%>
<h1 align="center">Employee details</h1>
<br>
<table align="center">
<tr>
<td>First Name :</td>
<td><%=g%></td>
</tr>
<tr>
<td>Last Name :</td>
<td><%=rs.getString("lastname")%></td>
</tr>
<tr>
<td>gmail :</td>
<td><%=rs.getString("gmail")%></td>
</tr>
<tr>
<td>password :</td>
<td><%=rs.getString("password")%></td>
</tr>
<tr>
<td>gross pay :</td>
<td><%=rs.getInt("gross")%></td>
</tr>
<tr>
<td> tdp :</td>
<td><%=rs.getInt("tdp")%></td>
</tr>
<tr>
<td> basic pay :</td>
<td><%=rs.getInt("basicpay")%></td>
</tr>
</table>
<form action="Eoptions.jsp">
<p align="center"><input class="submit" type="submit" value="click to go back"></p>
</form>
<%con.close();
 rs.close();
%>
<% }
catch(Exception e)
{
	con.close();
	 rs.close();
	 out.println("<h1 align='center'> invalid employee email</h1>");
	 RequestDispatcher rdd=request.getRequestDispatcher("/Eoptions.jsp");
	 rdd.include(request,response);
}
%>
</div>
</body>
</html>