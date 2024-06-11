package com.pace.jdbc;
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;
public class ReadData {
	Connection conn;
	Statement stmt;
	ResultSet rset;
	PreparedStatement pstmnt;
	Scanner scnr=new Scanner(System.in);
	public void registerDriver() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	public void getDetails() throws Exception{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Bhavana@16");
		stmt=conn.createStatement();
		//int row=stmt.executeUpdate("insert into book value(2222,'My Book','Myself',563.24)");
		
		int id;
		String name,author;
		float price;
		System.out.println("Enter book id");
		id=scnr.nextInt();
		System.out.println("Enter book name");
		name=scnr.next();
		System.out.println("Enter book author");
		author=scnr.next();
		System.out.println("Enter book price");
		price=scnr.nextFloat();
		
		
		//stmt=conn.createStatement();
		pstmnt=conn.prepareStatement("insert into book values(?,?,?,?)");
		pstmnt.setInt(1, id);
		pstmnt.setString(2, name);
		pstmnt.setString(3, author);
		pstmnt.setFloat(4, price);
		pstmnt.executeUpdate();
		//int row2=pstmt.executeUpdate("insert into book value("+id+",'"+name+"','"+author+"',"+price+")");
		//insert into book values(11,'Mybook2','Myself2',515.45s)
		rset=stmt.executeQuery("select * from book");
		
		while (rset.next()) {
			System.out.println(rset.getInt(1));
			System.out.println("\t"+rset.getString(2));
			System.out.println("\t"+rset.getString(3));
			System.out.println("\t"+rset.getFloat(4));
		}
		rset.close();
		stmt.close();
		conn.close();
	}
}
