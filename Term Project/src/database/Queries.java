
package database;

import common.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet.Set;
import java.sql.SQLException;

import common.Customer;
import common.Flight;
//import exceptions.LoginException;

public class Queries {
	
	public static void main(String[] args) {

		try {
			getConnection();
			Customer a = new Customer("John", "Wayne", "jwayne", "programmingHard@gmail.com", "41435672", "12345",
					"123 Beat St", "Atlanta", "GA", "30312", "Favorite color?", "4143567", "true", "yellow");
			INSERT(a);
			System.out.println("Inserted");
		} catch(Exception e) {
			System.out.println("you have a problem with your dbquery insertUser");
		}
	}

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

	public static final void INSERT(Customer cust) throws Exception{
		try {
			String tempQuer = "INSERT INTO `world`.`customer_info` VALUES (10,'" + cust.getUserName() + "', '" + cust.getFirstName() + "', '" + cust.getLastName() + "', '" + cust.getPassword() +
					"', '" + cust.getAddress() + "', " + cust.getZipcode() + ", '" + cust.getCity() + "', '" + cust.getState() + "', '" + cust.getPhone() + "', '" + cust.getEmail()
					+ "', '" + cust.getState() + "', '" + cust.getsSN() + "', '" + cust.getSecurityQuestion() + "', '" + cust.getSecurityAnswer() +"')";
			System.out.println(tempQuer);
			Connection con = ConnectionMethod.getConnection();
			PreparedStatement insert = con.prepareStatement(tempQuer);
			insert.executeUpdate();
			
		} catch (Exception ex) {
			System.out.println(ex);
		}


	}
	
}

