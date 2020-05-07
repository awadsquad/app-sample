
package database;

import common.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet.Set;
import java.sql.SQLException;
import java.sql.Statement;

import common.Customer;
import common.Flight;
//import exceptions.LoginException;

public class Queries {
	
	public static void main(String[] args) {
		Flight c = viewFlights("date", "time", "destination");
		System.out.println(c.getDate() + " " + c.getDestination() + " " + c.getTime());
		
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
		
		finally {
			
		}

	}

	public static final void INSERT(Customer cust) throws Exception{
		try {
			String tempQuer = "INSERT INTO `world`.`customer_info` VALUES (13,'" + cust.getUserName() + "', '" + cust.getFirstName() + "', '" + cust.getLastName() + "', '" + cust.getPassword() +
					"', '" + cust.getAddress() + "', " + cust.getZipcode() + ", '" + cust.getCity() + "', '" + cust.getState() + "', '" + cust.getPhone() + "', '" + cust.getEmail()
					+ "', '" + cust.getState() + "', '" + cust.getsSN() + "', '" + cust.getSecurityQuestion() + "', '" + cust.getSecurityAnswer() +"')";
			System.out.println(tempQuer);
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(tempQuer);
			insert.executeUpdate();
			con.close();
			
			
		} catch (Exception ex) {
			System.out.println(ex);
		}



	}
	
	//sql query for viewing flights to book
	public static Flight viewFlights(String a, String b, String c) {
		Statement stmt;
		String query = ("SELECT * FROM `world`.`flights` where destination = '" 
				+ a + "' and date = '" 
				+ b + "' and time = '" 
				+ c + "'");
		//i hope all this is still here
		Flight f2 = new Flight();
		
		try {
    	Connection con = getConnection();
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
         
            String destination = rs.getString("destination");
            int flightNumber = rs.getInt("flightNumber");    
            int passengerCount = rs.getInt("passenger");
            String date = rs.getString("date");
            String time = rs.getString("time");
        
            //need to pass the information to the user.
            Flight f1 = new Flight(destination, flightNumber, passengerCount, date, time);
            con.close();
            return f1;
        }
    //catch exception
    } catch (Exception e ) {
    	System.out.println("Works");
        System.out.print(e);
    //close connection
    }
		return f2; 
}
	
}

