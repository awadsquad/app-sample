package common;

import java.util.ArrayList;
import database.Queries;
import common.User;

public class Action {

	// Name of customer info table
	final static String cTName = "`world`.`customer_info`";

	// Gets What flights user has reserved
	public static String removeUserFlight(String userId, String flightId) {
		try {

			if (alreadyBooked(flightId, userId)) {
				int passCount = Integer
						.parseInt(Queries.SELECT(flightId, "`world`.`flights`", "flight_number", "passenger_count"));
				--passCount;
				Queries.DELETE(userId, flightId);
				Queries.UPDATE("`world`.`reservations`", "passenger_count", Integer.toString(passCount), flightId,
						"flight_number");
				return "Removed";
			} else {
				return "Not found";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return "Error";
		}

	}

	// Booking flight method
	public static String bookFlight(String flightId, String customerId) {

		int passCount;

		// Checks to see if input is correct
		if (correctFlightId(flightId)) {
			// Gets flights number of passengers
			try {
				passCount = Integer
						.parseInt(Queries.SELECT(flightId, "`world`.`flights`", "flight_number", "passenger_count"));
			} catch (Exception ex) {
				return "error";
			}

			// Checks to see if user already booked flight
			if (alreadyBooked(flightId, customerId) == false) {
				// Checks to see if passenger limit has been reached
				if (passCount < 10) {
					try {
						// Inserts data into reservations table
						Queries.INSERT(flightId, customerId);
						++passCount;
						// adds passenger to flight
						Queries.UPDATE("`world`.`flights`", "passenger_count", Integer.toString(passCount), flightId,
								"flight_number");
						return "flight booked";
					} catch (Exception ex) {
						System.out.println(ex);
						return "Problem booking flight";
					}
				} else {
					return "Full";
				}
			} else {
				return "Already booked";
			}
		} else {
			return "Not found";
		}

	}

	// Checks to see if user already booked flight
	public static boolean alreadyBooked(String fId, String uId) {
		try {
			ArrayList<String> flightIds = Queries.GETCOLUMN("flight_id", "`world`.`reservations`");
			ArrayList<String> userIds = Queries.GETCOLUMN("cust_id", "`world`.`reservations`");
			for (int i = 0; i < flightIds.size(); i++) {
				if (fId.equals(flightIds.get(i)) && uId.equals(userIds.get(i))) {
					return true;
				}
			}
			return false;
		} catch (Exception ex) {
			System.out.println("Already booked error");
			System.out.println(ex);
			return true;
		}
	}

	// Checks to see if username already exists
	public static boolean usernameTaken(String uName) {
		try {
			ArrayList<String> usernames = Queries.GETCOLUMN("username", "`world`.`customer_info`");
			for (int i = 0; i < usernames.size(); i++) {
				if (uName.equals(usernames.get(i))) {
					return true;
				}
			}
			return false;

		} catch (Exception ex) {
			System.out.println(ex);
			return true;
		}
	}

	// Checks to see if input is correct
	public static boolean correctFlightId(String id) {
		try {
			Queries.SELECT(id, "`world`.`flights`", "flight_number");
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}
	}
	
	

	// Gets account info from window and stores in database
	public static void createAccount(Customer cust) throws Exception {
		try {
			Queries.INSERT(cust);
			System.out.println("Added");
		} catch (Exception ex) {
			System.out.println("Failed");
			System.out.println(ex);

		}

	}
	
	

	public static String insertFlight(String dep, String dest, String date, String time, String pCount)
			throws Exception {

		if (dep.equals(null) || dest.equals(null) || date.equals(null) || time.equals(null) || pCount.equals(null)) {
			return "Empty field";
		}

		try {
			Flight f1 = new Flight(dep, dest, Integer.parseInt(pCount), date, time);
			Queries.INSERT(f1);
			return "Added";
		} catch (Exception o) {
			System.out.print("o");
			return "Failed";
		}
	}

	// Authenticates Username and password
	public static boolean validLogin(String a, String b) throws Exception {

		boolean validUsername = false;
		boolean validPassword = false;
		try {
			ArrayList<String> usernames = Queries.GETCOLUMN("username", "`world`.`customer_info`");
			ArrayList<String> passwords = Queries.GETCOLUMN("password", "`world`.`customer_info`");
			for (int i = 0; i < usernames.size(); i++) {
				if (a.equals(usernames.get(i))) {
					validUsername = true;
					break;
				}
			}
			if (validUsername) {

				for (int i = 0; i < passwords.size(); i++) {
					if (b.equals(passwords.get(i))) {
						validPassword = true;
						return true;
					}
				}
			}

			return false;

		}

		catch (Exception ex) {
			System.out.println("Not found");
			System.out.println(ex);
			return false;
		}

	}

	public static boolean validUsername(String uName) {
		try {

			ArrayList<String> usernames = Queries.GETCOLUMN("username", "`world`.`customer_info`");
			for (int i = 0; i < usernames.size(); i++) {
				if (uName.equals(usernames.get(i))) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}
	
	public static String getSQuestion(String uName) {
		return Queries.SELECT(uName, "`world`.`customer_info`", "username", "securtity_question");
	}
	
	public static String getSAnswer(String uName) {
		return Queries.SELECT(uName, "`world`.`customer_info`", "username", "security_answer");
	}
	
	public static String getPassword(String uName) {
		return Queries.SELECT(uName, "`world`.`customer_info`", "username", "password");
	}

	public static String updateFlight(String choice, String value, String fNumber) {

		String cName;

		if (choice.equals("Destination")) {
			cName = "destination";
		} else if (choice.equals("Departure")) {
			cName = "departure";
		} else if (choice.equals("Date")) {
			cName = "date";
		} else if (choice.equals("Time")) {
			cName = "time";
		} else {
			cName = "passenger_count";
		}

		try {

			Queries.UPDATE(fNumber, cName, value);
			return "Updated";

		} catch (Exception ex) {

			System.out.println(ex);
			return "Error";

		}
	}

	public static User setUser(String username, String password) {
		User account = new User();
		String setUserId = null;

		try {
			ArrayList<String> usernames = Queries.GETCOLUMN("username", "`world`.`customer_info`");
			ArrayList<String> passwords = Queries.GETCOLUMN("password", "`world`.`customer_info`");
			ArrayList<String> userIds = Queries.GETCOLUMN("user_id", "`world`.`customer_info`");
			for (int i = 0; i < usernames.size(); i++) {
				if (usernames.get(i).equals(username) && passwords.get(i).equals(password)) {
					setUserId = userIds.get(i);
				}

			}
		} catch (Exception ex) {
			System.out.println("Find userId failed");
			System.out.println(ex);
			return null;
		}

		try {

			ArrayList<String> usernames = Queries.GETCUSTOMERROW("user_id", setUserId);
			account = userToArray(usernames);
			return account;

		} catch (Exception ex) {
			System.out.println("Set user failed");
			System.out.println(ex);
			return null;
		}
	}

	// Converts array to user
	public static User userToArray(ArrayList<String> arr) {

		Customer output = new Customer();

		output.setUserId(arr.get(0));
		output.setFirstName(arr.get(1));
		output.setLastName(arr.get(2));
		output.setUserName(arr.get(3));
		output.setPassword(arr.get(4));
		output.setAddress(arr.get(5));
		output.setZipcode(arr.get(6));
		output.setCity(arr.get(7));
		output.setState(arr.get(8));
		output.setPhone(arr.get(9));
		output.setEmail(arr.get(10));
		output.setStatus(arr.get(11));
		output.setsSN(arr.get(12));
		output.setSecurityQuestion(arr.get(13));
		output.setSecurityAnswer(arr.get(14));

		return output;
	}


	public static String deleteFlight(String flId) {
		if (correctFlightId(flId)) {
			try {
				Queries.DELETE(flId);
				return "Deleted";
			} catch (Exception e) {
				e.printStackTrace();
				return "Error";
			}
		} else {
			return "Incorrect #";
		}
	}

	public static boolean isAdmin(User currentUser) {
		if (currentUser.getStatus().equals("admin")) {
			return true;
		}

		return false;
	}

}
