package com.mukesh;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
/**
 * Servlet implementation class AddEmployeeData
 */
public class AddEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		    if(request.getParameter("firstname")==null || request.getParameter("lastname")==null || request.getParameter("password")==null
		   || request.getParameter("gmail")==null ||request.getParameter("grosspay")==null ||request.getParameter("Tallowances")==null)
		    {  PrintWriter out=response.getWriter();
		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		    	RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
		    	rd.include(request, response);
		    }
		    else if(request.getParameter("firstname").length()==0 || request.getParameter("lastname").length()==0 || request.getParameter("password").length()==0
		 		   || request.getParameter("gmail").length()==0 ||request.getParameter("grosspay").length()==0 ||request.getParameter("Tallowances").length()==0)
		 		    {  PrintWriter out=response.getWriter();
		 		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		 		    	RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
		 		    	rd.include(request, response);
		 		    }
		    else
		    {
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://127.0.0.1:3306/softwareemployee";
			String password="Mukesh@2003";
			Connection con=DriverManager.getConnection(server,"root",password);
			
		    	
	    	String FirstName=""+request.getParameter("firstname");
		    	String LastName=""+request.getParameter("lastname");
		    	String gmail=request.getParameter("gmail");
		    	String password1=""+request.getParameter("password");
		    	int gross=Integer.parseInt(request.getParameter("grosspay"));
		    	int tdp=Integer.parseInt(request.getParameter("Tallowances"));
		    	int basicpay=((gross)-((gross/100)*(tdp)));
                String query="insert into employee(firstname,lastname,gmail,password,gross,tdp,basicpay)values(?,?,?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(query);
                p.setString(1,FirstName);
                p.setString(2,LastName);
                p.setString(3,gmail);
                p.setString(4,password1);
                p.setInt(5, gross);
                p.setInt(6, tdp);
                p.setInt(7, basicpay);
                int r=p.executeUpdate();
                PrintWriter out=response.getWriter();
               out.println("<h1 align='center'>"+FirstName+" "+LastName+" with gmail "+gmail+" added successfully</h1>");
   		    	RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
   		    	rd.include(request, response);
                con.close();
		    }
		   		}
		catch(Exception e)
		{  PrintWriter out=response.getWriter();
		out.println("<h1 align='center'> Error occured</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	}

}
