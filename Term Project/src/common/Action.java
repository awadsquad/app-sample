package common;

import java.util.ArrayList;

public class Action {

	public static final String LOGIN = "login";
	public static final String GET_FLIGHTS = "getflight";
	public static final String BOOK_FLIGHT = "bookflight";
	public static final String DELETE_FLIGHT = "deleteflight";
}


//method to book a flight
public static void bookAFlight() {
	
	//select a flight	
	
	String selectedflight = "null";//this needs to be changed to  debquerie flight id
	
			
	//call methods
	if (isFull(selectedflight) || isBooked(selectedflight)) {	
		//if either of these methods are true, the user needs to select a different flight
		//user warning should be the selected flight is either full or already booked by you
		//please select anotuher flight
		//print this notification and then start method again
		bookAFlight();//do i need to add this
		break;
	}
	
	else {
		
		Customer.addflight(selectedflight)
		
		
		
		
	}
	//add flight to user flight list
	//need to add 
		
}


//method to check if flight if full
public static boolean isFull(String a) {
	
	//check to see if seating is full
	if ( seating[60] == true)
	{

	return true;
	}
	else
		return false;
	
		
	}
	
	else
		
			
//cannot book flight more than once, Method to check if flight if booked
public static boolean isBooked(String a) {
	boolean alreadybooked = false;
	
	for (int i = 0; i <  flights.length;i++ )//is this wrong code, I want the length of the get flights array to iterate thru it.
		if (flights[i].equals(a));
			alreadybooked = true
	
		return alreadybooked;
			
//delete booked flight from flight array
public void deleteBooked (string a) {
	
	for (int i = 0; i <  flights.length;i++ )
		if (flights[i].equals(a));
			flights[i] = null
	
//need to add code to 
					decrease # of passengers
					

}			
/*schedule conflict, will we be keeping up with a time that flight takes to include this methd? technically it is in the user
requirements to have both already booked and schedule conflict, but im okay with leaving it out for now just to get a working code*/
public void scheduleConflict() {
	
	
}

}
}