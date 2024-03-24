package com.sathya.srevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class LoginFromSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// step-1: read the form data
		String username=request.getParameter("userName");
		String Password=request.getParameter("Password");
		
		// step-2: Process the data
		
		String statues;
		if(username.equals("sathya")&&Password.equals("sathya@123"))
	
		{
			statues="Login successfull---";
		}
		else
		{
			statues="Login Fail---";
		}
	
		// step-3: render the response to client
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login Info</h1>" + statues);
		
		writer.println("<html>");




		
	}

}