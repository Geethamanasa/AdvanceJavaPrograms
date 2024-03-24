package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorApplicationServlet")
public class CalculatorApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step 1: read the data
		int first = Integer.parseInt(request.getParameter("first"));
		int second = Integer.parseInt(request.getParameter("second"));
		String Operation=request.getParameter("Operation");
			
			//Step 2: process the data
			int result=0;
			switch(Operation)
			{
				case "+" :result=first+second;
							break;
				
				case "-" :result=first-second;
							break;
				
				case "*" :result=first*second;
							break;
				
				case "/" :result=first/second;
							break;
				
				case "%" :result=first % second;
							break;	
				
			}
			
			//Step 3:render the response 
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			
			writer.println("Your Result " +result);
		
		
	}

	
	}


