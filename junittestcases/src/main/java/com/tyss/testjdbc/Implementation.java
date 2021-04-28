package com.tyss.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Implementation implements Inteface {

	static Connection con=null;
	static Statement stm=null;
  	
	
	public void insert() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems\", \"root\", \"root");
		
		
	     String insert="insert into ems.employ values(1,'tiger',23,10,1234)";
	     stm=con.createStatement();
			System.out.println(" coonect to databases suceffuily");
			stm.execute(insert);
			System.out.println("insert sucessfully");
			System.out.println(" working properly");
	}

	
	public void delete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems\", \"root\", \"root");
		
		
		 String delet="delete from ems.employ where id=4";
			
	     stm=con.createStatement();
			System.out.println(" coonect to databases suceffuily");
			stm.execute(delet);
			System.out.println("delete sucessfully");
			//System.out.println(" working properly");
		
		
	}

	
	public void update() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems\", \"root\", \"root");
		
		
		String update="update ems.employ set name='rakesh' where id=1";
	     stm=con.createStatement();
			System.out.println(" coonect to databases suceffuily");
			stm.execute(update);
			System.out.println("update sucessfully");
			System.out.println(" working properly");
		
		
	}

	
}
	
	

