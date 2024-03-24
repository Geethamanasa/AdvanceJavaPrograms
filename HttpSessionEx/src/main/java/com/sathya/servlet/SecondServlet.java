package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
    	String qualification= request.getParameter("qualification");
		String Desigmation= request.getParameter("Desigmation");
		
		//place the data in session object
		HttpSession session=request.getSession(false);
		
		//set the data 
		session.setAttribute("qualification", qualification);
		session.setAttribute("Desigmation", Desigmation);
		
		//forward the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("Form3.html");
		dispatcher.forward(request, response);
		
	}
    	

}
