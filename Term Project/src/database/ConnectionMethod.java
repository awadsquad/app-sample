package database;

import java.sql.Connection;

import java.sql.DriverManager;
import common.Customer;

public class ConnectionMethod {

	
	
	public static Connection getConnection() throws Exception {
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://34.67.46.88:3306/world";
			String username = "root";
			String password = "nA97114780!!";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		
	}

}
