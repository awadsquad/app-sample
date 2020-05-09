package bizLogic;
import common.Action;
import common.Customer;
import database.DBQueries;
import database.Queries;

public class BizLogic {
	
	//todo do we need action for isFull?	
	
	public static void process (Customer co){
		
		switch (co.getAction()) {
			
		case Action.LOGIN:
			//DBQueries.login(co);
			Queries.INSERT(cust);
			break;
		case Action.GET_FLIGHTS:
//			DBQueries.getFlights(co);
			Queries.viewFlights(a,b,c);
			break;
			case Action.bookFlight(co):
//			DBQueries.bookFlight(co);
			Queries.INSERT(fl);
			break;
			case Action.deleteBooked(co):
//			DBQueries.deleteBooked(co);
			Queries.DELETE(fl);
			break;
		//admin actions
			case Action.updateFlight(co):
//			DBQueries.updateFlight(co);
			Queries.UPDATE(fl);
			break;	
			case Action.insertFlight(co):
			DBQueries.insertFlight(co);
			break;	
			case Action.deleteFlight:
			DBQueries.insertFlight(co);
			break;	
			default:
			System.out.println("choose an action");
		}
	}

	
	
}
