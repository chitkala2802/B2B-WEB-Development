package com.higradius;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.sun.java.util.jar.pack.Package.Class.Member;

public class Adddetails {
private String dburl="jdbc:mysql://localhost:3306/userdb";
private String dbuname="root";
private String dbpassword="root";
private String dbdriver="com.mysql.jdbc.Driver";

public void loadDriver(String dbDriver) {
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


public Connection getConnection()
{
	Connection con=null;
	try {
		DriverManager.getConnection(dburl,dbuname,dbpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	
	
}

public String insert(invoice invoice ) {
	loadDriver(dbdriver);
	Connection con=getConnection();
	String result="data entered successfully";
	String sql="insert into userdb.invoice values(?,?,?,?,?,?,?)";
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, invoice.getCust_name());
		ps.setString(2,invoice.getNotes());
		ps.setInt(3, invoice.getCust_id());
		ps.setInt(4, invoice.getInvoice_id());
		ps.setInt(5, invoice.getInvoice_amount());
		ps.setDate(6,invoice.getDue_date());
		ps.setDate(7,invoice.getPredicted_date());
		ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result="Data not entered";
	}
	return result;
	
}
}
