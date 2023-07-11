package com.mukesh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Acheck
 */
public class Acheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Acheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("adminname");
		String password=request.getParameter("apassname");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		   String adminname=config.getInitParameter("adminname");
	        String adminpass=config.getInitParameter("password"); 
	        if(name.equals(adminname) && password.equals(adminpass))
	        {
	        	HttpSession s=request.getSession();
	        	s.setAttribute("adminname", adminname);
	        	response.sendRedirect("options.jsp");
	        }
	        else
	        {
	        	 out.println("<br>");
	        	out.println("<h1 align='center'>Enter Correct Credentials </h1>");
	         RequestDispatcher rd = request.getRequestDispatcher("/Alogin.jsp"); 
	         rd.include(request, response);
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
