package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.ConnectionMethod;
import database.DBQueries;
import database.Queries;


public class Action {
	
	public static final String LOGIN = "login";
	public static final String GET_FLIGHTS = "getflight";
	public static final String BOOK_FLIGHT = "bookflight";
	
	/*public static void main(String[] args) {
		Customer a = new Customer("sgyuhs", "vasgju", "vgvhjas", "bsach@bsjk", "72899", "vsaghj", "hbsdkj", "ncjskl", "GA", "1234", "shujis", "ncjskl", "false", "Atl" );
		try {
			Queries.INSERT(a);
			System.out.print("added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	//Gets account info from window and stores in database
	public static void createAccount(Customer cust) throws Exception{
		try {
			Queries.INSERT(cust);
			System.out.println("Added");
		} catch (Exception ex) {
			System.out.println("Failed");
			System.out.println(ex);

		}
	
	}
	
	//method to book a flight
	public static void bookFlight(String a, String b, String c) {
	String selectedflight = "null";
	
	String destination = a;
	String date = b;
	String time = c;
	DBQueries.viewFlights(a, b, c)
	
		
	
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
	public static boolean isFull(Flight a) {
	
	//check to see if seating is full
	
	if ( a.getPassengerCount() == 10){
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
		removePassenger.subtract(1);		

}			

	public void deleteFlight(Flight id) {
		.getConnection();
}
	public void insertFlight(Flight id) {
		getConnection()
}
	public void updateFlight(Flight id) {
		INSERT(id);
}
	private void INSERT(Flight id) {
		// TODO Auto-generated method stub
		
	}

	//Authenticates Username and password
	public static boolean loginAuthenticate throws SQLException (String a, String b) {
		try {
			
		if(DBQueries.Login(a,b)) {
			return true;
		}		
		else
			return false;
		}
	        
		catch(Exception ex)
	        {
	          System.out.print(ex);		  
	        }

	}
			
	//view a list of available flights		
	public static Flight viewFlights(Customer a) throws Exception {
			
	//create database connection
	String query = DBQueries.viewAllFlights();
//this i sdumb
	{
			    	Connection con = ConnectionMethod.getConnection();
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery(query);
			        while (rs.next()) {
			            String airportName = rs.getString("airport_name");
			            String destination = rs.getString("destination");//THESE NEED TO BE FILLEDOUT
			            int flightNumber = rs.getInt("flightNumber");     //WITH THE COLUMN NAMES
			            int passengerCount = rs.getInt("passenger");
			            String date = rs.getString("date");
			            String time = rs.getString("");
			        
			        //need to display the information to the user.
			            
			        }
			    //catch exception
			    } catch (Exception e ) {
			        
			    //close connection
			    } finally {
			    	//TODO
			    }
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