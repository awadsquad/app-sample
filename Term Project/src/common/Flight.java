package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flight {

	private String airlineName;
	private int flightNumber;
	private Map<Integer, String>
	
	
	public Flight() {
		Map<Integer, String> map = new HashMap<>();
	}
	
	
	//getter and setters
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
}
