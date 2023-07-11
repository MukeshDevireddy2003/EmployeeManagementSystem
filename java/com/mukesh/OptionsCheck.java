package com.mukesh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class OptionsCheck
 */
public class OptionsCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OptionsCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Object o=request.getParameter("check");
		if(o==null)
		{
			System.out.println("<h1 align='center'>login to admin first</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/Alogin.jsp");
			rd.forward(request,response);
		}
		String check=request.getParameter("check");
		if(check.equals("Add an employee"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/AddEmployee.jsp");
			rd.forward(request,response);
		}
		else if(check.equals("Delete an employee"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/DeleteEmployee.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Update an employee"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Updateemployee.jsp");
			rd.forward(request,response);
		}
		else if(check.equals("Display an employee"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Edt.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Display all employee details"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/DisplayAll.jsp");
			rd.forward(request,response);	
		}
		else if(check.equals("Logout"))
		{
			HttpSession session=request.getSession();
			session.invalidate();
		    response.sendRedirect("Alogin.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
