package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 @WebServlet("/GeneratingNumberServlet")
public class GeneratingNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
   		//step 1: Get the request data from from
   		int from = Integer.parseInt(request.getParameter("from"));
   		int to = Integer.parseInt(request.getParameter("to"));
   		String operation = request.getParameter("Operation");
   		
   		//Step 2: process the data
   		
   		ArrayList<Integer> al = new ArrayList<Integer>();
   		
		for(int i = from; i<= to; i++)
   			switch(operation)
   			{
   			case "even" : if(i%2==0)
   							{
   								al.add(i);
   							}
   						break;
   						
   			case "odd" : if(i%2!=0)
						{
							al.add(i);
						}
   						break;
   						
   			case "prime" : int  number=i,count=0;
   							for(int j=2;j<=number/2;j++)
   							{
   								if(number%j ==0)
   									count++;
   							}
   							if(count==0 && number!=1)
   								al.add(number);
   							break;
   							
   			case "perfect" : int sum=0;
   							for(int j=1;j<=i/2;j++)
   							{
   								if(i%j==0)
   								{
   									sum=sum+j;
   								}
   							}
   							if(sum==i)
   								al.add(sum);
   							break;
   							
   			case "strong" :int originalNum=i,suml=0;
   								while(i!=0)
   								{
   									int rem=i%10;
   									int fact=1;
   									for(i=1;i<=rem;i++)
   									{
   										fact*=i;
   									}
   									suml+=fact;
   									i=i/10;
   								}
   									if(suml==originalNum)
   										al.add(suml);
   									break;
   			}
   		//Step 3: render the response
   		
		
   		PrintWriter writer = response.getWriter();
   		response.setContentType("text/html");
   		writer.println("<html>");
   		writer.println("result:"+al);
   		writer.println("</html>");
   	}
}

	
 
