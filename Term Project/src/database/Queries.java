
package database;

import common.Customer;

import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet.Set;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import common.*;
//import exceptions.LoginException;

public class Queries {

	public static void main(String[] args) throws Exception {
		// Customer a = new Customer("he", "bds", "bhj", "cfsy@jnk", "5627", "vgha",
		// "gshu", "bhds", "GA", "235678", "bsj", "63784", "true", "sbyhu");
//		try {
//			Flight fl = new Flight();
//			fl.setFlightNumber(1095);
//			fl.setPassengerCount(23);
//			fl.setDestination("ATL");
//			fl.setDate("4/20");		    
//			fl.setTime("2:00pm");
//			UPDATE(fl);
//		} catch(IOException e) {
//			e.printStackTrace(); 	
//		} finally {
//		    // ... cleanup that will execute whether or not an error occurred ...
//		}
//
//	}
	}
	public static Connection getConnection() throws Exception {

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://34.67.46.88:3306/world";
			String username = "root";
			String password = "nA97114780!!";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			System.out.println("Finished");
		}

	}

	public static final void INSERT(Customer cust) throws Exception {
		try {
			String tempQuer = "INSERT INTO `world`.`customer_info` (first_name" + ",last_name" + ",username"
					+ ",password" + ",address" + ",zipcode" + ",city" + ",state" + ",phone" + ",email" + ",status"
					+ ",ssn" + ",securtity_question" + ",security_answer) VALUES ('" + cust.getUserName() + "', '"
					+ cust.getFirstName() + "', '" + cust.getLastName() + "', '" + cust.getPassword() + "', '"
					+ cust.getAddress() + "', " + cust.getZipcode() + ", '" + cust.getCity() + "', '" + cust.getState()
					+ "', '" + cust.getPhone() + "', '" + cust.getEmail() + "', '" + cust.getState() + "', "
					+ cust.getsSN() + ", '" + cust.getSecurityQuestion() + "', '" + cust.getSecurityAnswer() + "')";
			System.out.println(tempQuer);
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(tempQuer);
			insert.executeUpdate();
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	// sql query for viewing flights to book
	public static Flight viewFlights(String a, String b, String c) {
		Statement stmt;
		String query = ("SELECT * FROM `world`.`flights` where destination = '" + a + "' and date = '" + b
				+ "' and time = '" + c + "'");
		// i hope all this is still here
		Flight f2 = new Flight();

		try {
			Connection con = getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				String destination = rs.getString("destination");
				int flightNumber = rs.getInt("flightNumber");
				int passengerCount = rs.getInt("passenger");
				String date = rs.getString("date");
				String time = rs.getString("time");

				// need to pass the information to the user.
				Flight f1 = new Flight(destination, flightNumber, passengerCount, date, time);
				con.close();
				return f1;
			}
			// catch exception
		} catch (Exception e) {
			System.out.println("Works");
			System.out.print(e);
			// close connection
		}
		return f2;
	}

	// Returns array of each value in column
	public static final ArrayList<String> GETCOLUMN(String cName, String tName) throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT " + cName + " FROM " + tName);
			System.out.println(statement);
			System.out.println("SELECT " + cName + " FROM " + tName);
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while (result.next()) {
				array.add(result.getString(cName));
			}
			System.out.println("All records have been selected!");
			con.close();
			return array;
		} catch (Exception ex) {
			return null;
		}
	}

	// TODO Fix
	public static final ArrayList<String> GETCUSTOMERROW(String cName, String identifier) throws Exception {

		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM `world`.`customer_info` WHERE " + cName + " = " + identifier);

			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while (result.next()) {
				String[] arr = { "user_id", "first_name", "last_name", "username", "password", "address", "zipcode",
						"city", "state", "phone", "email", "status", "ssn", "securtity_question", "security_answer" };

				array.add(result.getString(arr[0]));
				array.add(result.getString(arr[1]));
				array.add(result.getString(arr[2]));
				array.add(result.getString(arr[3]));
				array.add(result.getString(arr[4]));
				array.add(result.getString(arr[5]));
				array.add(result.getString(arr[6]));
				array.add(result.getString(arr[7]));
				array.add(result.getString(arr[8]));
				array.add(result.getString(arr[9]));
				array.add(result.getString(arr[10]));
				array.add(result.getString(arr[11]));
				array.add(result.getString(arr[12]));
				array.add(result.getString(arr[13]));
				array.add(result.getString(arr[14]));

			}

			System.out.println("All done");
			return array;

		} catch (Exception ex) {
			System.out.print(ex);
			return null;
		}

	}

	public static final void INSERT(Flight fl) throws Exception {
		try {
			String tempQuer = "INSERT INTO `world`.`flights`(`passenger_count`,`date`,`time`, `destination`) VALUES ( " + fl.getPassengerCount() + ", '"
					+ fl.getDate() + "', '" + fl.getTime() + "', '" + fl.getDestination() + "')";
			System.out.println(tempQuer);
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(tempQuer);
			insert.executeUpdate();
			con.close();
			System.out.println("Information has been added!");
		

		} catch (Exception ex) {
			System.out.println(ex);
		}
		}

		public static ArrayList<String> viewAllFlights() throws Exception {
			 Connection con = getConnection();
			 ArrayList<String> allFlights = new ArrayList<String>();
			try {
				String tempQuer = "SELECT * FROM `world`.`flights`;";
				System.out.println(tempQuer);
				con = getConnection();
				PreparedStatement prepState = con.prepareStatement(tempQuer);
				ResultSet result = prepState.executeQuery();
				System.out.println("Show me all the flights!");
				System.out.println(result);
				while(result.next()) {
					allFlights.add(result.getString(0));
				}
			} catch (Exception ex) {
				System.out.println(ex);
			} finally {
				con.close();
			}
				return allFlights;
			}

	public void UPDATEFL(Flight fl) throws Exception {
		try {
			String tempQuer = "UPDATE `world`.`flights`SET`flight_number` = "
					+ fl.getFlightNumber() +", `passenger_count` = "
					+ fl.getPassengerCount() + ", `date` = '"+ fl.getDate() + " ', `time` = '"
					+ fl.getTime() + "' , `destination` = '" + fl.getDestination() +
					"' WHERE `flight_number` = " +fl.getFlightNumber() +" ;";
			System.out.println(tempQuer);
			Connection con = getConnection();
			PreparedStatement delete= con.prepareStatement(tempQuer);
			delete.executeUpdate();
			con.close();
			System.out.println("Update has been completed!");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void UPDATECO(Customer co) throws Exception {
		try {

			//5	ducky	rubber	odd	pass	dress drive	309303	heaven	GE	0	n@.com	loser	0	why?	why not.
			String tempQuer = "UPDATE `world`.`customer_info` SET `user_id` = "
					+ co.getUserId() +", `first_name` = "
						+ co.getFirstName() + ", `last_name` = '"+ co.getLastName() + " ', `username` = '"
					+ co.getUserName() + "' , `password` = '" + co.getPassword() + "' , `password` = '" + co.getPassword()
					+ "' , `address` = '" + co.getAddress() + "' , `zipcode` = '" + co.getZipcode()
					+ "' , `city` = '" + co.getCity() + "' , `state` = '" + co.getState()
					+ "' , `phone` = '" + co.getPhone() + "' , `email` = '" + co.getEmail()
					+ "' , `status` = '" + co.getStatus() + "' , `ssn` = '" + co.getsSN()
					+ "' , `security_questions` = '" + co. getSecurityQuestion()
					+ "' , `security_answer` = '" + co.getSecurityAnswer() +
					"' WHERE `user_id` = " + co.getUserId() +" ;";
			System.out.println(tempQuer);
			Connection con = getConnection();
			PreparedStatement delete= con.prepareStatement(tempQuer);
			delete.executeUpdate();
			con.close();
			System.out.println("Update has been completed!");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
