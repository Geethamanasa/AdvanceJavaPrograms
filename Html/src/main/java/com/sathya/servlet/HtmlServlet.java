package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/geetha")
public class HtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer= response.getWriter();
		
		response.setContentType("text/plain");
		writer.println("<html>");
		writer.println("<h1>This is a Hello World</h1>");
		writer.println("<h2>This is a ratan sir cls</h2>");
		writer.println("<h3>This is HTML progaram<h3>");
		writer.println("</html>");
	}

	
}


