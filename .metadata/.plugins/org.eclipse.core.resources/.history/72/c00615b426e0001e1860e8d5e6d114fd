package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String proId=request.getParameter("proId");
		
		ProductDao dao=new ProductDao();
		// Give the proId to deleteById() method of ProductDAO layer using productDAO
				// object and store the result
		int res=dao.deleteById(proId);
		
		if(res==1)
		{
			// Store the result to request object and sent to jsp layer
			request.setAttribute("deleteResult", res);
			RequestDispatcher dispatcher=request.getRequestDispatcher("ProductListDisplay.jsp");
			dispatcher.forward(request, response);
		}
		

		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("Data deleted successfully....."+res);
		
	}
	

	}