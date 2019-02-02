package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* <h1>Create a DB connection</h1>
* This program creates a DB connection with the MySQL database.
*
* @author  https://github.com/e-business-app
* @version 1.0
* @since   2019-01-31
*/

public class DBConnection {
	/**
	 * 
	 * This static method helps you set up a connection with the database.
	 * 
	 * @return Connection if connection is made, else print error and return null;
	 */
	public static Connection getConnectionToDatabase(){
		try {
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);   
			String url = "jdbc:mysql://localhost:3306/Player";
			Connection c = DriverManager.getConnection(url,"hoshang","test");
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
