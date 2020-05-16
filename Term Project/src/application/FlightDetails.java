package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FlightDetails {
	
		private final StringProperty destination;
		private final StringProperty departure;
		private final StringProperty flightNumber;
		private final StringProperty passengerCount;
		private final StringProperty date;
		private final StringProperty time;

		// default constructor
		public FlightDetails(String flightNumber, String passengerCount, String date, String time, String departure,
				String destination) {

			this.destination = new SimpleStringProperty(destination);
			this.departure = new SimpleStringProperty(departure);
			this.passengerCount = new SimpleStringProperty(passengerCount);
			this.date = new SimpleStringProperty(date);
			this.time = new SimpleStringProperty(time);
			this.flightNumber = new SimpleStringProperty(flightNumber);

		}

		// Getters
		public String getDestination() {
			return destination.get();
		}

		public String getDeparture() {
			return departure.get();
		}

		public String getFlightNumber() {
			return flightNumber.get();
		}

		public String getPassengerCount() {
			return passengerCount.get();
		}

		public String getDate() {
			return date.get();
		}

		public String getTime() {
			return time.get();
		}

		// setters
		public void setDestination(String value) {
			destination.set(value);
		}

		public void setDeparture(String value) {
			departure.set(value);
		}

		public void setflightNumber(String value) {
			flightNumber.set(value);
		}

		public void setPassengerCount(String value) {
			passengerCount.set(value);
		}

		public void setDate(String value) {
			date.set(value);
		}

		public void setTime(String value) {
			time.set(value);
		}

	
}
