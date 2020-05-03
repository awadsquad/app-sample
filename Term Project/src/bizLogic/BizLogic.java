package bizLogic;
import common.Action;
import common.Customer;
import database.DBQueries;

public class BizLogic {

	public static void process (Customer co){
		
		switch (co.getAction()) {
			
		case Action.LOGIN:
			DBQueries.login(co);
			break;
		case Action.GET_FLIGHTS:
			DBQueries.getFlights(co);
			break;
		case Action.BOOK_FLIGHT:
			DBQueries.bookFlight(co);
			break;
		}
	}

	
	
}
