package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		String qua=request.getParameter("qua");
 		  String dsg=request.getParameter("dsg");
 		 
 		  //crete the cookies object
 		  
 		  Cookie C3=new Cookie("qua", qua);
 		  Cookie C4=new  Cookie("dsg", dsg);
 		  
 		  //add the cookies into Response object
 		     response.addCookie(C3);
 		     response.addCookie(C4);
 		//give the next form to client
		       RequestDispatcher d=request.getRequestDispatcher("form3.html");
		   d.forward(request, response);
		    
 		 
  	
  	}

}
