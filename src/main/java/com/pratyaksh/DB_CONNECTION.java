package com.pratyaksh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_CONNECTION {

	final static String DB_URL = "jdbc:mysql://localhost:3306/simplilearn";
		final static String USER_NAME ="root";
		final static String USER_PASS = "root12345";
		final static String DRIVER = "com.mysql.cj.jdbc.Driver";
		
			public static Connection getConn() throws ClassNotFoundException, SQLException
			{
				Class.forName(DRIVER);
				Connection con = DriverManager.getConnection(DB_URL,USER_NAME,USER_PASS);
				return con;
			}
	}