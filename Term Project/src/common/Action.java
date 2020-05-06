package common;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.DBQueries;

public class Action {
	
	//Gets account info from window and stores in database
	public static void createAccount () {
	Customer Cust= new Customer();
	
	
	}
	
	//Authenticates Username and password
	public static boolean loginAuthenticate () {
		return true;
	}

	public static final String LOGIN = "login";
	public static final String GET_FLIGHTS = "getflight";
	public static final String BOOK_FLIGHT = "bookflight";

	//method to book a flight
	public static void bookFlight(Customer cust) {
	String selectedflight = "null";
	//select a flight	
		viewFlights();
	
	for (int i = 0; i < flights.length; i++) {
		
		if (flights[i].)
		
		
		bookFlight();//do i need to add this
		break;
	}
	
	else {
		
		Customer.addflight(selectedflight);
	}
	//add flight to user flight list
	//need to add 
		
}


	//method to check if flight if full
	public static boolean isFull(flight a) {
	
	//check to see if seating is full
	if ( flight.passengerCount == 10){
	return true;
	}
	else
		return false;
}
		
			
	//cannot book flight more than once, Method to check if flight if booked
	public static boolean isBooked(String a) {
	boolean alreadybooked = false;
	
	for (int i = 0; i <  flights.length;i++ )//is this wrong code, I want the length of the get flights array to iterate thru it.
		if (flights[i].equals(a));
			alreadybooked = true;
		
			return false;
	}
	
	//delete booked flight from flight array
	public void deleteBooked(String a) {
	
	for (int i = 0; i <  flights.length;i++ )
		if (flights[i].equals(a)) {
			flights[i] = null;
		//TODO need to subtract 1 from passenger count for that flight
		flight.subtract(1)			

}			

	public void deleteFlight(Flight id) {
		.getConnection();
}
	public void insertFlight(Flight id) {
		getConnection()
}
	public void updateFlight(Flight id) {

}



	//login
	public static void login(String a, String b) throws SQLException{
		
		//Assign user entered values to temporary variables.
		String userN = a; 
	    String passW = b;

	   
	    String userNameDB = "";
	    String passwordDB = "";

	    try
	    {	//connection database
	    	//TODO i am loosing my mind how to use this connection as a method
	    	.getConnection();
			
	        //getting all the records and storing in a resultSet.
	    	Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(DBQueries.login(userN, passW);
		    
	        // Until next row is present otherwise it return false
	        while(rs.next()) 
	        	{ //info from  database
	        	userNameDB = rs.getString("userName");
	        	passwordDB = rs.getString("password");

	          if(userN.equals(userNameDB) && passW.equals(passwordDB))
	          {
	             //LOGIN SUCCESS
	          }
	      }
	 }
	        catch(Exception ex)
	        {
	          System.out.print(ex);		  
	        }

	}
			
	//view a list of available flights		
	public static Flight viewFlights(Connection con, String Flight) throws SQLException {
			
	//create database connection
	Statement stmt = null;
	String query = DBQueries.viewAllFlights();
			    try {
			    	
			        stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery(query);
			        while (rs.next()) {
			            String airportName = rs.getString("airport_name");
			            String destination = rs.getString("");//THESE NEED TO BE FILLEDOUT
			            int flightNumber = rs.getInt("");     //WITH THE COLUMN NAMES
			            int passengerCount = rs.getInt("");
			            String date = rs.getString("");
			            String time = rs.getString("");
			        
			        //need to display the information to the user.
			            
			        }
			    //catch exception
			    } catch (Exception e ) {
			        
			    //close connection
			    } finally {
			        { stmt.close(); }
			    }
			}
		
	//insert a new flight into the database for booking		
	public static void insertFlight(Connection con, Flight ) throws SQLException {
		
		 try
	        { //create database connection
	            Class.forName(" "); //what is this?
	            Connection con = DriverManager.getConnection(" ", " ", " "); 
	            
	          //mysql query insert statement
	            String query = "  ";
	            
	              
	            // Inserting data in database with preparedstatement
	            PreparedStatement preparedStmt = con.prepareStatement(query);
	            preparedStmt.setString(1, Flight.getAirportName());//are these correct, like the int? or is flight is a string?
	            preparedStmt.setDate(2, );
	            preparedStmt.setString(3,);
	            preparedStmt.setString(4, );
	            preparedStmt.setDate(5, );
	            
	            int x = stmt.executeUpdate(q1); 
	            if (x > 0)             
	                System.out.println("Successfully Inserted");             
	            else            
	                System.out.println("Insert Failed"); 
	            
	        } 
	        catch(Exception e) 
	        { 
	         
	        } 
		 finally
		 //close connection
	            {con.close(); }
	    } 
	}