
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
	public static boolean Login(String a, String b) throws Exception{
		boolean access = false;
		try {
			String userN = a; 
		    String passW = b;	 
		    String userNameDB = "";
		    String passwordDB = "";
		    
			
			Connection con = ConnectionMethod.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT username, password FROM `world`.`customer_info` where username= '" + a + "' and password = '" + b + "'");
			
			 while(rs.next()) 
	        	{ //info from  database
	        	userNameDB = rs.getString("userName");
	        	passwordDB = rs.getString("password");

	        	if(userN.equals(userNameDB) && passW.equals(passwordDB))
	          
	             access = true;
	          }
	        
		}
		catch(Exception ex)
        {
          System.out.print(ex);		  
        } 
		return access;
}
	
		
	//sql query for viewing customers booked flights
	public static String viewbookedFlight(String a, String b) {
		Statement stmt;
	
try {
	String query = ("SELECT * FROM `world`.`bookedflight` WHERE first_name = '" + a + "' AND last_name '=" + b + "'");
	Connection con = ConnectionMethod.getConnection();
    stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
        String airportName = rs.getString("airport_name");
        String destination = rs.getString("destination");
        int flightNumber = rs.getInt("flightNumber");    
        int passengerCount = rs.getInt("passenger");
        String date = rs.getString("date");
        String time = rs.getString("time");
        
        { stmt.close(); }

    //need to display the information to the user.
       
	
	//sql query for viewing flights to book
	public static Flight viewFlights(String a, String b, String c) {
		Statement stmt;
		String query = ("SELECT * FROM `world`.`flights` where destination = '" 
				+ a + "' and date = '" 
				+ b + "' and time = '" 
				+ c + "'");
		Flight f1 = new Flight();
		try {
    	Connection con = ConnectionMethod.getConnection();
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while (rs.next()) {
         
            String destination = rs.getString("destination");
            int flightNumber = rs.getInt("flightNumber");    
            int passengerCount = rs.getInt("passenger");
            String date = rs.getString("date");
            String time = rs.getString("time");
        
        //need to passthe information to the user.
            
           f1 = new Flight(destination, flightNumber, passengerCount, date, time);
            
            
        }
         {stmt.close();
          }
         
		}
         catch (Exception e ) {
        System.out.println("you have an exception");
    }
	
		return f1;
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
	public static void insertFlight(Flight a) throws Exception{
		try { 
String query =  ("INSERT INTO `world`.`flights` VALUES (" 
			+ " '" + a.getDestination() + "',"  
			+ a.getFlightNumber() + ","
			+ a.getPassengerCount() + ","  
			+ " '" + a.getDate() + "'," 
			+ " '" + a.getTime() + "',"); 

		}
		catch (Exception e){
			System.out.println("you have an exception");
		}
	}
	
	//sql query for updating an existing flight in database
	//TODO i think this one got deleted
	public static String updateFlight() {
	return ("you need to redo me");
	}
	
	//sql query for deleting an existing flight in database
	//TODO finish query statement
	public static String deleteFlight() {
		String o = null;
		return  ("DELETE * FROM `world`.`atl_routes_50` where = '"+o+"'");
	}







}

	