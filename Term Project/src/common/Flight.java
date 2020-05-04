package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flight {

	private String airportName;
	private String destination;
	private int flightNumber;
	private int passengerCount;
	private String date;
	private String time;
	
	Flight () {
		
	}
	
	Flight(String airportName, String destination, int flightNumber, int passengerCount, String date) {
		
		this.airportName = airportName;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.passengerCount = passengerCount;
		this.date = date;
		
	}
	
	//getter and setters
	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	//adds passenger to flight
	public boolean addPassenger(int passengerCount) {
		if (this.passengerCount < 10) {
			this.passengerCount += 1;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//removes passenger from flight
	public boolean removePassenger(int passengerCount) {
		if (this.passengerCount > 0) {
			this.passengerCount--;
			return true;
		}
		else {
			return false;
		}
		
	}

}
