package TermProject;

import java.util.Date;

public class ScheduleFlight{

	
	
	
	//need a method to display schedule flights for user
	
	
	
	//method for booking a flight
	
	
iu	protected void bookAFlight();{
	
	for ( int count = 21; count <= 40; count++ )
	{
	    if ( seating[count] == false ) // if false, then a seat is available for assignment
	    {
	        seating[count] = true; // assign seat
	        System.out.printf("Business Seat# %d\n", count);
	        break;
	    }

	    else if ( seating[40] == true) // If seating[40] is true then business is fully booked

	    	if ( seating[20] == true) // If seating[20] is true then FirstClass is fully booked
	    	if ( seating[60] == true) // If seating[60] is true then Economy is fully booked
	      {
	      System.out.println("Sorry, flight fully booked.");
	  }
	     else // ask if passenger would like a first class ticket instead
	         {
	             System.out.println("Business Class is fully booked. Would you. like First Class? 1 for Yes 2 for No");
	             int choice = input.nextInt();
	             if ( choice == 1 )
	             {
	                 FirstClass();
	                 start();
	             }
	             else // ask if passenger would like a Economy ticket instead
	             {
	             System.out.println("Business Class is fully booked. Would you like Economy Class? 1 for Yes 2 for No");
	             int choice = input.nextInt();
	             if ( choice == 1 )
	             {
	                 EconomyClass();
	                 start();
	             }
	             else

	                 System.exit(0);
	             }
	         } 
	
	
	// This print boarding pass with date of issue and flight information
	
	    private static void printBoardingPass(/*what data are we passing here?*/) {
	
	        Date timenow = new Date();
	
	       System.out.println("Date: " + timenow.toString());
	
	      //we need to add a line where we retrieve flight info from database
	
	        System.out.println("Thank you for choosing whatever company we named this thing");
	
	        System.out.println();

}
