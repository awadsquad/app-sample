package database;

import common.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet.Set;
import java.sql.SQLException;

import common.Customer;
import common.Flight;
import exceptions.LoginException;

public class Queries {

	public static final void INSERT(Customer cust) throws Exception{
		try {
			
			Connection con = ConnectionMethod.getConnection();
			PreparedStatement insert = con.prepareStatement("INSERT INTO world.customer_info (first_name, last_name, username, password, address, zipcode, city, state, phone, email, "
					+ "status, ssn, securtity_question, security_answer)" + "VALUES ('" + cust.getUserName() + "', '" + cust.getFirstName() + "', '" + cust.getLastName() + "', '" + cust.getPassword() +
					"', '" + cust.getAddress() + "', '" + cust.getZipcode() + "', '" + cust.getCity() + "', '" + cust.getState() + "', '" + cust.getPhone() + "', '" + cust.getEmail()
					+ "', '" + cust.getState() + "', '" + cust.getsSN() + "', '" + cust.getSecurityQuestion() + "', '" + cust.getSecurityAnswer() +"';");
			insert.executeUpdate();
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	try {
		getConnection();
		Customer a = new Customer("John", "Wayne", "jwayne", "programmingHard@gmail.com", "4143567268", "12345", "123 Beat St", "Atlanta", "GA",  
				"30312",  "Favorite color?", "678-05-6789", "true",  "yellow");	        
    } 
    catch(Exception e) 
    { 
    	System.out.println("you have a prblem with your dbquery insertUser");
    } 

}
