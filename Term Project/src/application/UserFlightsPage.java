package application;

import javafx.beans.property.SimpleStringProperty;

import common.Flight;

public class UserFlightsPage {
	
	
	
}

class ListenerFlight {
	

	private SimpleStringProperty destination, flightNumber, passengerCount, date, time;
	
	public ListenerFlight(Flight f) {
		this.destination = new SimpleStringProperty(f.getDestination());
		this.flightNumber = new SimpleStringProperty(Integer.toString(f.getFlightNumber()));
		this.passengerCount = new SimpleStringProperty(Integer.toString(f.getPassengerCount()));
		this.date = new SimpleStringProperty(f.getDate());
		this.time = new SimpleStringProperty(f.ge);
		
	}
	
}
