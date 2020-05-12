package common;

import java.sql.Connection;

import database.Queries;

public class sandbox {

	public static void main(String[] args) {

		Flight a = new Flight();
		try {
			a = bookFlight("ATL", "4/20", "6:00PM");
			System.out.println(a.getDestination());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void checksFlight(Flight fl) throws Exception {

		try { // create database connection
			Connection connect = Queries.getConnection();
			String tempQuer = "SELECT date, time, destination  FROM `world`.`flights` WHERE destination ='"
					+ fl.getDestination() + "' AND date=' " + fl.getDate() + "' AND time= ' " + fl.getTime() + " ');";
			System.out.println(tempQuer);
			if (tempQuer.contains(fl.getDestination()) && tempQuer.contains(fl.getDate())
					&& tempQuer.contains(fl.getTime())) {
				fl.setPassengerCount(fl.getFlightNumber() + 1);
			}
		} catch (Exception o) {
			System.out.print("eat a potato");
		}
	}

	public static Flight bookFlight(String dest, String date, String time) throws Exception {

		try { // create database connection
			Connection connect = Queries.getConnection();
			Flight f1 = new Flight(dest, date, time);
			Queries.INSERT(f1);
			return f1;
		} catch (Exception o) {
			System.out.print("eat a potato");
			return null;
		}
	}

}
