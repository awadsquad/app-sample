package bizLogic;
import common.Action;
import common.Customer;
import common.Flight;
import database.Queries;

public class BizLogic {
	
	//todo do we need action for isFull?

	public static void processFl (Flight fl) throws Exception {
		
		switch (fl.getAction()) {
		//admin actions
//			case Action.updateFlight(fl):
////			DBQueries.updateFlight(co);
//			Queries.UPDATE(fl);
//			break;
			case "wtf":
			Queries.INSERT(fl); // This needs to be a flight not a co
			break;
//			case Action.deleteFlight:
//			Queries.DELETE(fl); // This needs to be a flight not a co
//			break;
			default:
			System.out.println("choose an action");
		}
	}


	public static void processCo (Customer co) throws Exception {

		switch (co.getAction()) {
			case "login":
				//DBQueries.login(co);
				Queries.INSERT(co);
				break;
			case "getFlight":
//			DBQueries.getFlights(co); 4/01	1:15am	DME
				Queries.viewFlights("DME", "04/01", "1:15am");
				break;
			case "bookFlight":
//			DBQueries.bookFlight(co);
//				Queries.viewFlights(co);
				break;
			//admin actions
			case "updateCustomer":
//			DBQueries.updateFlight(co);
				Queries.UPDATECO(co);
				break;
			default:
				System.out.println("choose an action");
		}
	}



}
