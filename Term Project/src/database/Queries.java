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

	public final void INSERT(Customer cust) throws Exception{
		try {
			
			Connection con = MainClass.getConnection();
			PreparedStatement insert = con.prepareStatement("INSERT INTO login_info (first_name, last_name, username, password, address, zipcode, city, state, phone, email, "
					+ "status, ssn, securtity_question, security_answer)" + "VALUES('" + cust.getUserame() + "', '" + cust.getFirstName() + "', '" + cust.getLastName() + "', '" + cust.getPassword +
					"', '" + cust.getAddress + "', '" + ");
			
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

}
