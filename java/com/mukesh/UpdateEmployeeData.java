package com.mukesh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class UpdateEmployeeData
 */
public class UpdateEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		    if(request.getParameter("firstname")==null || request.getParameter("lastname")==null || request.getParameter("password")==null
		   || request.getParameter("pgmail")==null ||request.getParameter("ngmail")==null ||request.getParameter("grosspay")==null ||request.getParameter("Tallowances")==null)
		    {  PrintWriter out=response.getWriter();
		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		    	RequestDispatcher rd=request.getRequestDispatcher("/Updateemployee.jsp");
		    	rd.include(request, response);
		    }
		    else if(request.getParameter("firstname").length()==0 || request.getParameter("lastname").length()==0 || request.getParameter("password").length()==0
		 		   || request.getParameter("pgmail").length()==0 ||request.getParameter("grosspay").length()==0 ||request.getParameter("Tallowances").length()==0
		 		   ||request.getParameter("ngmail").length()==0)
		 		    {  PrintWriter out=response.getWriter();
		 		   	out.println("<h1 align='center'>No empty coulums are allowed</h1>");
		 		    	RequestDispatcher rd=request.getRequestDispatcher("/Updateemployee.jsp");
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
		    	String pgmail=request.getParameter("pgmail");
		    	String ngmail=request.getParameter("ngmail");
		    	String password1=""+request.getParameter("password");
		    	int gross=Integer.parseInt(request.getParameter("grosspay"));
		    	int tdp=Integer.parseInt(request.getParameter("Tallowances"));
		    	int basicpay=((gross)-((gross/100)*(tdp)));
                String query="update employee set firstname =? , lastname=? , gmail=? , password=? , gross=? , tdp=? , basicpay=? "
                		+ "where gmail='"+pgmail+"'";
               
                PreparedStatement p = con.prepareStatement(query);
                p.setString(1,FirstName);
                p.setString(2,LastName);
                p.setString(3,ngmail);
                p.setString(4,password1);
                p.setInt(5, gross);
                p.setInt(6, tdp);
                p.setInt(7, basicpay);
              int f=  p.executeUpdate();
                PrintWriter out=response.getWriter();
               out.println("<h1 align='center'>"+FirstName+" "+LastName+" with gmail "+ngmail+" updated successfully</h1>");
   		    	RequestDispatcher rd=request.getRequestDispatcher("/Updateemployee.jsp");
   		    	rd.include(request, response);
                con.close();
		    }
		   		}
		catch(Exception e)
		{  PrintWriter out=response.getWriter();
		out.println("<h1 align='center'> Error occured</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/Updateemployee.jsp");
			rd.include(request, response);
   System.out.println(e);
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
