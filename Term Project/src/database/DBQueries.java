package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.Customer;
import common.Flight;
//import exceptions.LoginException;
import common.User;


public class DBQueries {
	
	
	//sql query for login
	public static String login(String a, String b){	
	return ("SELECT username, password FROM world.customer_info where username " + "= '" + a + "' and password '" + "'=" + b);
	}
	
	//sql query for viewing customers booked flights
	public static String viewbookedFlight(String a, String b) {
	return ("SELECT * FROM world.bookedflight WHERE first_name " + "= '" + a + "' AND last_name '" + "'=" + b);
	}
	
	//sql query for inserting a new user
	//TODO write .get
	public static String insertUser(Customer Cust) {
		return ("INSERT INTO `world`.`customer_info` VALUES" 
				+ " 'user_id',"
				+ " 'first_name',"
				+ " 'last_name',"
				+ " 'username',"
				+ " 'password',"
				+ " 'address',"
				+ " 'zipcode',"
				+ " 'city',"
				+ " 'state',"
				+ " 'phone',"
				+ " 'email',"
				+ " 'status',"
				+ " 'ssn',"
				+ " 'security_question',"
				+ " 'security_question',");
	}
	
	//sql query for viewing flights to book
	public static String viewAllFlights() {
	return ("SELECT * FROM world.flight_info");
	}
	
	//sql query for inserting a new booked flight by customer
	//TODO
	public static String insertBooking(String flightnumber) {
	return ("INSERT INTO world.current_flights");
	}
	
	//sql query for deleting a booked flight by customer
	public static String deleteBooking(String a, String b) {
	return ("DELETE * FROM `world`.`booked_flight` where username " + "= '" + a + "' and password '" + "'=" + b);
	}
	
	//sql query for inserting a new flight in database
	//TODOput the gets in here
	public static String insertFlight(Flight a){
		return  ("INSERT INTO `world`.`flight_info` VALUES" 
			+ " flight_number," 
			+ " 'user_id',"  
			+ " 'airport_name',"  
			+ " 'destination',"  
			+ " passenger_count,"  
			+ " 'date'," 
			+ " 'time',"  
			+ " 'start_date',"  
			+ " 'end_date'," 
			+ " 'location_from'," 
			+ " 'location_to'");
	
	}
	
	//sql query for updating an existing flight in database
	//TODO i think this one got deleted
	public static String updateFlight() {
	return ("you need to redo me");
	}
	
	//sql query for deleting an existing flight in database
	//TODO finish query statement
	public static String deleteFlight() {
		return  ("DELETE * FROM `world`.`atl_routes_50` where _________________");
	}







}
	