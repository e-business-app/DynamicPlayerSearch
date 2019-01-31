package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnectionToDatabase(){
		try {
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);   
			String url = "jdbc:mysql://localhost:3306/Player";
			Connection c = DriverManager.getConnection(url,"blogger","blogger");
			return c;
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
		catch (SQLException ex) {
			System.out.println("Connect failed ! "+ex);
		}
		return null;
	}
}
