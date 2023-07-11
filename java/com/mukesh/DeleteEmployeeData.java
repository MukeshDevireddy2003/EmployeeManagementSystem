package com.mukesh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
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
 * Servlet implementation class DeleteEmployeeData
 */

public class DeleteEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		if(request.getParameter("gmail")==null)
		{
			out.println("<h1 align='center'>null values are not entertained</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			 rd.include(request, response);
		}else if(request.getParameter("gmail")==null)
		{
			out.println("<h1 align='center'>empty values are not entertained</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			 rd.include(request, response);
		}
		else {
		try {
		String gmail=request.getParameter("gmail");	
		Class.forName("com.mysql.cj.jdbc.Driver");
		String server="jdbc:mysql://127.0.0.1:3306/softwareemployee";
			String password="Mukesh@2003";
			Connection con=DriverManager.getConnection(server,"root",password);
			String query="delete from employee where gmail='"+gmail+"'";
			PreparedStatement p = con.prepareStatement(query);
			 int r=p.executeUpdate();
			 System.out.println();
			 if(r==0)
			 {  
			out.println("<h1 align='center'>"+gmail+" this employee does not exist</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
				 rd.include(request, response);
			 }
			 else
			 {  out.println("<h1 align='center'>Deleted Successfully</h1>");
				 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
				 rd.include(request, response);
			 }
			 con.close();
		}
		catch(Exception e){
			out.println("<h1 align='center'>Error occured</h1>");
			 RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			 rd.include(request, response);
		}}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
