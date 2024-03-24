package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String Email=request.getParameter("email");
    	String Mobile=request.getParameter("mobile");
    	
    	Cookie a[]=request.getCookies();
    	
    	response.setContentType("text/html");
    	
    	PrintWriter writer=response.getWriter();
    	
    	writer.println("<html>");
    	writer.println("<body style='text-align:center' >");
    	writer.println("<pre style='color:green; font-size:25px; background-color:yellow'>");
    	writer.println("Username="+a[0].getValue());
    	writer.println("Age="+a[1].getValue());
    	writer.println("Qualification= "+a[2].getValue());
    	writer.println("Designation= "+a[3].getValue());
    	writer.println("Email= "+Email);
    	writer.println("Mobile= "+Mobile);
    	writer.println("</pre>");
    	writer.println("</body>");
    	writer.println("</html>");
    	

		
		

	
	}

}
