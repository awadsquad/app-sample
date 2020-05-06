package common;

import java.util.ArrayList;

public class Action {
	
	//Gets account info from window and stores in database
	public static void createAccount (Customer cust) {
		
	}
	
	//Authenticates Username and password
	public static boolean loginAuthenticate () {
		return true;
	}

	/*public static final String LOGIN = "login";
	public static final String GET_FLIGHTS = "getflight";
	public static final String BOOK_FLIGHT = "bookflight";*/

//method to book a flight
public static void bookFlight(Customer cust) {
	String selectedflight = "null";
	//select a flight	
	//ArrayList<Flights> flights = cust.getFlights();
		
	
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
/*schedule conflict, will we be keeping up with a time that flight takes to include this methd? technically it is in the user
requirements to have both already booked and schedule conflict, but im okay with leaving it out for now just to get a working code*/
public void scheduleConflict() {
}

public void deleteFlight(Flight id) {
	
}
public void insertFlight(Flight id) {
	
}
public void updateFlight(Flight id)

}
}