package com.mukesh;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ChooseCheck
 */
public class ChooseCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChooseCheck() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String check=request.getParameter("check");
		 if(check.equals("view profile"))
		 {   request.setAttribute("gmail", request.getSession().getAttribute("gmail"));
			 RequestDispatcher rd=request.getRequestDispatcher("/Eview.jsp");
			 rd.forward(request, response);
		 }
		 else if(check.equals("update profile"))
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("/Eupdate.jsp");
			 rd.forward(request, response);
		 }
		 else
		 {
			HttpSession session=request.getSession();
			session.invalidate();
			 RequestDispatcher rd=request.getRequestDispatcher("/ELogin.jsp");
			 rd.forward(request, response);
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
