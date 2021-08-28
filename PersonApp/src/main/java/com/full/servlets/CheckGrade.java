package com.full.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.full.classes.Student;

/**
 * Servlet implementation class CheckGrade
 */
@WebServlet("/CheckGrade")
public class CheckGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
		String name=session.getAttribute("name").toString();
		if (session.getAttribute("name")==null) {
			response.sendRedirect("login.jsp");
			}
			
		PrintWriter out=response.getWriter();
		String phno=request.getParameter("phno");
		String idno=request.getParameter("idno");
		String email=request.getParameter("email");
		int marks=Integer.parseInt(request.getParameter("marks"));
		
		
		
		Student s1=new Student(name,phno,email,idno,marks);
		
		String grade=s1.checkGrade();
		
		out.print("<br><br><br><h3> Your grade is:"+grade+"</h3>");
		
		out.print(s1.checkPerformance());
		
		out.print("<form action='/Logout' method='post'><br><br><input type='submit'  value='Logout'></form></body>");
		
	}

}
