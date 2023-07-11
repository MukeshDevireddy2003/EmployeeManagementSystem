package com.mukesh;

import jakarta.servlet.RequestDispatcher;



import java.sql.*;
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

/**
 * Servlet implementation class SetData
 */
public class SetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String gmail=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("gmail",gmail);
		session.setAttribute("password",password);
		PrintWriter out=response.getWriter();
		try
		{
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			String server="jdbc:mysql://127.0.0.1:3306/softwareemployee";
				String password1="Mukesh@2003";
				Connection con=DriverManager.getConnection(server,"root",password1);
				Statement st=con.createStatement();
				String query="select gmail from employee where gmail='"+gmail+"' and password='"+password+"';";
				ResultSet rs=st.executeQuery(query);
				rs.next();
				String gmail1=rs.getString("gmail");
				response.sendRedirect("Eoptions.jsp");
}
		catch(Exception e)
		{    session.invalidate();
			out.println("<h1 align='center'> Error Occured, enter details correctly</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/ELogin.jsp");
			rd.include(request,response);
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
