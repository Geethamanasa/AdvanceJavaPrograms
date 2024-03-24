package com.sathya.srevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginNameSrevlet")
public class LoginNameSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// step-1: read the form data
				String FristName=request.getParameter("firstname");
				String MiddleName=request.getParameter("middlename");
				String LastName=request.getParameter("lastname");
				
				// step-2: Process the data
				
				String statues = FristName+" "+MiddleName+" "+LastName;
				
			
			
				// step-3: render the response to client
				
				PrintWriter writer = response.getWriter();
				response.setContentType("text/html");
				writer.println("<html>");
				writer.println("<h1>FullName </h1>" + statues);
				
				writer.println("<html>");




				

	}

}
