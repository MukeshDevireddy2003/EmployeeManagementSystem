<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees Data</title>
<style>
table{
border :2px solid teal;
background-color:teal;
}
h1{
color:darkblue;
}
body{
background-color:teal
}
td{
background-color:skyblue;
margin:10px 10px 10px 10px;
width:100px;
}
th{
margin:10px 10px 10px 10px;
color:darkblue;
}
.submit{
background-color:skyblue;
}
</style>
</head>
<body>
<h1 align="center">Employees data</h1>
<br>
<form action="options.jsp">
<h3><input class="submit" type="submit" value="back"></h3>
</form>
<%
      ResultSet rs=null;
      Connection con=null;
       try{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   		String server="jdbc:mysql://127.0.0.1:3306/softwareemployee";
   			String password="Mukesh@2003";
   			 con=DriverManager.getConnection(server,"root",password);
   			String query="select * from employee";
   			String query1="select sum(gross) from employee";
   			Statement st=con.createStatement();
   			rs=st.executeQuery(query);
   			
       }
catch(Exception e)
{  
	out.println("<h1 align='center'> Error occured</h1>");
		RequestDispatcher r=request.getRequestDispatcher("/options.jsp");
		r.include(request, response);
}     
%>
<table align="center">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>password</th>
<th>gross pay</th>
<th>Total allowances percentage</th>
<th>basic pay</th>
</tr>
<% if(rs!=null)
{
	while(rs.next())
	{  
%>
<tr>
<td><%=rs.getString("firstname") %></td>
<td><%=rs.getString("lastname") %></td>
<td><%=rs.getString("gmail") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getInt("gross") %></td>
<td><%=rs.getInt("tdp") %></td>
<td><%=rs.getInt("basicpay") %></td>
</tr>
<% 
	} rs.close();}
if(con!=null)
{con.close();}
%>
</table>
</body>
</html>