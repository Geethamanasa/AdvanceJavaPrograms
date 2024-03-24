package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		//get the data from client
    		
  		  //get the data
  		  String user=request.getParameter("user");
  		  String age=request.getParameter("age");
  		 
  		  //crete the cookies object
  		  
  		  Cookie C1=new Cookie("user", user);
  		  Cookie C2=new  Cookie("age", age);
  		  
  		  //add the cookies into Response object
  		     response.addCookie(C1);
  		     response.addCookie(C2);
  		    
  		   //give the next form to client
  		     RequestDispatcher d=request.getRequestDispatcher("form2.html");
  		   d.forward(request, response);
  		    
  		  
  	
	}

}
