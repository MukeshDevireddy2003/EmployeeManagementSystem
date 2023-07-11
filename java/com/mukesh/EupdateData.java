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

/**
 * Servlet implementation class EupdateData
 */
public class EupdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EupdateData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Object o=session.getAttribute("gmail");
		if(o!=null)
		{
		String gmail=(String)session.getAttribute("gmail");
		System.out.println(gmail);
		try {
		    if(request.getParameter("firstname")==null || request.getParameter("lastname")==null || request.getParameter("password")==null
		    ||request.getParameter("ngmail")==null)
		    { 
		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		    	RequestDispatcher rd=request.getRequestDispatcher("/Eupdate.jsp");
		    	rd.include(request, response);
		    }
		    else if(request.getParameter("firstname").length()==0 || request.getParameter("lastname").length()==0 || request.getParameter("password").length()==0
		 		   ||request.getParameter("ngmail").length()==0)
		 		    { 
		 		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		 		    	RequestDispatcher rd=request.getRequestDispatcher("/Eupdate.jsp");
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
		    	String ngmail=request.getParameter("ngmail");
		    	String password1=""+request.getParameter("password");
                String query="update employee set firstname =? , lastname=? , gmail=? , password=? "
                		+ "where gmail='"+gmail+"'";
               
                PreparedStatement p = con.prepareStatement(query);
                p.setString(1,FirstName);
                p.setString(2,LastName);
                p.setString(3,ngmail);
                p.setString(4,password1);
              int f=  p.executeUpdate();
               out.println("<h1 align='center'>"+FirstName+" "+LastName+" with gmail "+ngmail+" updated successfully</h1>");
   		    	RequestDispatcher rd=request.getRequestDispatcher("/Eupdate.jsp");
   		    	rd.include(request, response);
 
                con.close();
		    }
		   		}
		catch(Exception e)
		{ 
		out.println("<h1 align='center'> Error occured</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/Eupdate.jsp");
			rd.include(request, response);
   System.out.println(e);
		}
	}
		else
		{   out.println("<h1 align='center'> login to update</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/Eoptions.jsp");
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
