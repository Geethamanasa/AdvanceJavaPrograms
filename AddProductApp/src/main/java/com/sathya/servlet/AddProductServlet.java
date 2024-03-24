package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read the data
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date proExpireDate=Date.valueOf(request.getParameter("proExpireDate"));
		
		Part part=request.getPart("proImage");
		InputStream inputStream=part.getInputStream();
		 byte[] proImage=IOUtils.toByteArray(inputStream);
		
		 Part part1=request.getPart("proAudio");
			InputStream inputStream1=part1.getInputStream();
			 byte[] proAudio=IOUtils.toByteArray(inputStream1);
			
			 
			 Part part11=request.getPart("proVideo");
				InputStream inputStream11=part11.getInputStream();
				 byte[] proVideo=IOUtils.toByteArray(inputStream11);
				
		
		//conversion of InputStream into byte[]
		
		//using above details create product object
		product product=new product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProPrice(proPrice);
		product.setProBrand(proBrand);
		product.setProMadeIn(proMadeIn);
		product.setProMfgDate(proMfgDate);
		product.setProExpireDate(proExpireDate);
		product.setProImage(proImage);
		product.setProAudio(proAudio);
		product.setProVideo(proVideo);
		
		// Giving the product object to ProductDAO layer save method to save the data
				// into database
		//pass the object to productDao
		ProductDao dao=new ProductDao();
		int res=0;
				
					try {
						res=dao.save(product);
					} catch (ClassNotFoundException |SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				
		
				if(res==1)
				{
					request.setAttribute("saveResult", res);
					RequestDispatcher dispatcher=request.getRequestDispatcher("ProductListDisplay.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					response.setContentType("text/html");
					PrintWriter writer=response.getWriter();
					writer.println("Data insertion fail check once...."+res);
					RequestDispatcher dispatcher=request.getRequestDispatcher("Addproduct.html");
					dispatcher.include(request, response);
				}
	
	}

}