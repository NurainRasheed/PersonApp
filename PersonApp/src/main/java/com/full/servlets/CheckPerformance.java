package com.full.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.full.classes.Professor;
import com.full.classes.Student;

/**
 * Servlet implementation class CheckPerformance
 */
@WebServlet("/CheckPerformance")
public class CheckPerformance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPerformance() {
        super();
        // TODO Auto-generated constructor stub
    }


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
		String classid=request.getParameter("classid");
		String sub=request.getParameter("sub");
		
		
		Professor p1=new Professor(name,phno,email,idno,classid,sub);
		
		out.print(p1.checkPerformance());
	}

}
