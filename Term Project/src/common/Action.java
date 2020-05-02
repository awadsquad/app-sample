package common;

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
	
	
	
	
		boolean fullFlight = isFlightFull();
		
		
} 
}