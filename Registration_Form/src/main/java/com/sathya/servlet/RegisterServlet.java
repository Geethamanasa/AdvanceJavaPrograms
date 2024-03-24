package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//step-1: read the data
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("number"));
		String email=request.getParameter("email");
		String Gender=request.getParameter("Gender");
		String dob=request.getParameter("dob");
		String[] qualification=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] languents=request.getParameterValues("Languages");
		String comments=request.getParameter("comments");
		
		//step-2: render the response
	      //String[] quals=request.getParameterValues("qualification");
	      String q=String.join(",",qualification);
	      String l=String.join(",",languents);
	      
	      //step-3: render the response
	      response.setContentType("text/html");
	      PrintWriter writer=response.getWriter();
	    
		   writer.println("<html>");
		   writer.println("<body>");
	        
		   writer.println("your username:"+userName +"<br>");
		   writer.println("your password :"+password +"<br>");
		   writer.println("your mobile:"+mobile +"<br>");
		   writer.println("your email:"+email+"<br>");	 
		   writer.println("your Gender:"+Gender +"<br>");
		   writer.println("your dob:"+dob +"<br>");
		   writer.println("your qualification:"+q +"<br>");
		   writer.println("your country:"+country +"<br>");
		   writer.println("your languents:"+l +"<br>");
		   writer.println("your comments:"+comments +"<br>");
		   
		   writer.println("</body>");
		   writer.println("</html>");
	        
	}
}
