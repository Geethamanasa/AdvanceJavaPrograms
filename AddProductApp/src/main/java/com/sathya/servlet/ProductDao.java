package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	public int save(product product) throws SQLException,ClassNotFoundException  {
		//declare the resources
				Connection connection=null;
				PreparedStatement preparedStatement=null;
				int res=0;
				
				
				//get the connection
				connection=Dbconnection.createConnection();
				
				//create preparedStatement object
				
				preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?,?)");
				
				//Read the data from pro object and set to parameters
				preparedStatement.setString(1, product.getProId());
				preparedStatement.setString(2, product.getProName());
				preparedStatement.setDouble(3, product.getProPrice());
				
				preparedStatement.setString(5, product.getProMadeIn());
				preparedStatement.setDate(6, product.getProMfgDate());
				preparedStatement.setDate(7, product.getProExpireDate());
				preparedStatement.setBytes(8, product.getProImage());
				preparedStatement.setBytes(9, product.getProAudio());
				preparedStatement.setBytes(10, product.getProVideo());
				
				
				res=preparedStatement.executeUpdate();
			
				
			return res;
	}
	
	public List<product> findAll()
	{
		List<product> l=new ArrayList<product>();
		try(Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
		{
			ResultSet resultSet=statement.executeQuery("select * from product");
			
			while(resultSet.next())
			{
				product product=new product();
				product.setProId(resultSet.getString("proId"));
				product.setProName(resultSet.getString("proName"));
				product.setProPrice(resultSet.getDouble("proPrice"));
				product.setProBrand(resultSet.getString("proBrand"));
				product.setProMadeIn(resultSet.getString("proMadeIn"));
				product.setProMfgDate(resultSet.getDate("proMfgDate"));
				product.setProExpireDate(resultSet.getDate("proExpireDate"));
				product.setProImage(resultSet.getBytes("proImage"));
				product.setProAudio(resultSet.getBytes("proAudio"));
				product.setProVideo(resultSet.getBytes("proVideo"));
				l.add(product);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return l;
		
	}
	//3.deleteById
			public  int deleteById(String proId) {
				int res=0;
				try(Connection connection=Dbconnection.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from product where proId=?"))
				{
					//set data to parameter
					preparedStatement.setString(1, proId);
					//execute s
					res=preparedStatement.executeUpdate();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return res;
			}
			//2.productById()
			public product findById(String proId) {
					product product=null;
					try(Connection connection=Dbconnection.createConnection();
						  PreparedStatement preparedStatement=connection.prepareStatement("select * from Product where ProId=?"))
					{
						//set the data to parameter
						preparedStatement.setString(1, proId);
						
						//execute the query
						ResultSet resultSet=preparedStatement.executeQuery();
						
						//setting the result set values into employee object
						if(resultSet.next()) {
							product=new product();
							product.setProId(resultSet.getString("proId"));
							product.setProName(resultSet.getString("ProName"));
							product.setProPrice(resultSet.getDouble("proPrice"));
							product.setProBrand(resultSet.getString("proBrand"));
							product.setProMadeIn(resultSet.getString("proMadeIn"));
							product.setProMfgDate(resultSet.getDate("proMfgDate"));
							product.setProExpireDate(resultSet.getDate("proExpireDate"));
							product.setProImage(resultSet.getBytes("proImage"));
							product.setProAudio(resultSet.getBytes("proAudio"));
							product.setProVideo(resultSet.getBytes("proVideo"));
						}
						
					}
					catch(Exception e )
					{
						e.printStackTrace();
					}
					return product;
			}
			public int updateById(product product)
			{
				
				String sql="UPDATE product SET proName=?,proPrice=?,proBrand=?,proMadeIn=?, proExpireDate=?, proMfgDate=?, proImage=?,proAudio=?,proVideo=? WHERE proId = ?";
				
				int updateResult = 0;
				try(Connection connection = Dbconnection.createConnection())
				{
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, product.getProName());
					preparedStatement.setDouble(2, product.getProPrice());
					preparedStatement.setString(3, product.getProBrand());
					preparedStatement.setString(4, product.getProMadeIn());
					preparedStatement.setDate(5, product.getProMfgDate());
					preparedStatement.setDate(6, product.getProExpireDate());
					preparedStatement.setBytes(7, product.getProImage());
					preparedStatement.setBytes(8, product.getProAudio());
					preparedStatement.setBytes(9, product.getProVideo());
					preparedStatement.setString(10, product.getProId());
				
					
					
					updateResult = preparedStatement.executeUpdate();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				return updateResult;
			
			}

			 static int product(product product) {
				// TODO Auto-generated method stub
				return 0;
			}

}