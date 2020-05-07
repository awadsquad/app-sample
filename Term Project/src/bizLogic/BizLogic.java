package bizLogic;
import common.Action;
import common.Customer;
import database.DBQueries;

public class BizLogic {
	
	//todo do we need action for isFull?	
	
	public static void process (Customer co){
		
		switch (co.getAction()) {
			
		case Action.LOGIN:
			DBQueries.login(co);
			break;
		case Action.GET_FLIGHTS:
			DBQueries.getFlights(co);
			break;
		case Action.bookFlight(co);
			DBQueries.bookFlight(co);
			break;
		case Action.deleteBooked(co);
			DBQueries.deleteBooked(co);
			break;
		//admin actions
		case Action.updateFlight(co);
			DBQueries.updateFlight(co)
			break;	
		case Action.insertFlight(co);
			DBQueries.insertFlight(co);
			break;	
		case Action.deleteFlight
			DBQueries.insertFlight(co);
			break;	
		default
			System.out.println("choose an action")
		}
	}

	
	
}
