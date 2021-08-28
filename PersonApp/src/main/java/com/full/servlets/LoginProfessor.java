package com.full.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.full.services.LoginMethodClass;

/**
 * Servlet implementation class LoginProfessor
 */
@WebServlet("/LoginProfessor")
public class LoginProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProfessor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			LoginMethodClass ls=new LoginMethodClass();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("uname");
			String password=request.getParameter("pass");
			Boolean validate=ls.validateUser(name) && ls.validatePassword(password);
			//System.out.println(validate);
			if(validate) {
					out.print("<br>You have successfully logged in!!<br><br><br>Welcome " + name +"!! ");
					HttpSession session=request.getSession();
					session.setAttribute("name",name);
				
					out.print("<html><head><title>Welcome</title></head><body><form action='/CheckPerformance' method='post'><br><br><table width=400  >Enter your details:<br><br><label>Student Name: </label>"+name
							+ "<br><br><label>Phone number:</label><input type=\"text\" id=\"phno\" name=\"phno\" ><br><br><label>Email address:</label><input type=\"text\" id=\"email\" name=\"email\" ><br><br><label>ID number:</label><input type=\"text\" id=\"idno\" name=\"idno\" ><br><br><label>Class Assigned:</label><input type=\"text\" id=\"classid\" name=\"classid\" ></table><br><br><label>Subject:</label><input type=\"text\" id=\"sub\" name=\"sub\" ><br><br><Button type='submit'>Confirm</Button>");
								
			}
							
			else
			{				
				out.print("<br>Sorry! Username and password not valid!");
		
			}
			out.print("<form action='/Logout' method='post'><br><br><input type='submit'  value='Logout'></form></body>");
			out.close();
		}catch(Exception e) {
			throw new ServletException();
		}
	}

	}


