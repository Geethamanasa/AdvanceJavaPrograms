package com.sathya.sarlvet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Helloworldsarlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter writer = response.getWriter();
	
	writer.println("Tthis is Sathya");
	writer.println("This is Sathya tech..");
	writer.println(" This is Ratan sir class.....");
	}
}