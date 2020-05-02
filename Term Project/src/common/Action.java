package common;

import java.util.ArrayList;

public class Action {

	public static final String LOGIN = "login";
	public static final String GET_FLIGHTS = "getflight";
	public static final String BOOK_FLIGHT = "bookflight";
	public static final String DELETE_FLIGHT = "deleteflight";
}




public static boolean isFlightFull() {
	
	//check to see if seating is full
	if ( seating[60] == true)
	{

	return true;
	}
	else
		return false;
	}

public static void bookAFlight() {
	
	//select a flight	
	boolean flightfull = false;
	boolean flightfull = isFlightFull();
	
	if (flightfull) {	
		//needs to pick anew flight
		
	}
	
	else
		//needs to send over to dbqueries to get other flight info.



} 
//cannot book flight more than once
public boolean isflightbooked(int a) {
	
	//needs to open connection to db
	boolean alreadybooked = false;
	
	for (int i = 0; i<Customer.getflights().length();i++ )
		if (Customer.getflights[i].equals(a));
			alreadybooked = true
	
		return alreadybooked;
}