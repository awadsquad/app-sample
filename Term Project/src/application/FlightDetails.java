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
		public FlightDetails(String flightNumber, String destination, String departure, String passengerCount, String date,
				String time) {

			this.destination = new SimpleStringProperty(destination);
			this.departure = new SimpleStringProperty(departure);
			this.passengerCount = new SimpleStringProperty(passengerCount);
			this.date = new SimpleStringProperty(date);
			this.time = new SimpleStringProperty(time);
			this.flightNumber = new SimpleStringProperty(flightNumber);

		}

		// Getters
		public StringProperty getDestination() {
			return destination;
		}

		public StringProperty getDeparture() {
			return departure;
		}

		public StringProperty getFlightNumber() {
			return flightNumber;
		}

		public StringProperty getPassengerCount() {
			return passengerCount;
		}

		public StringProperty getDate() {
			return date;
		}

		public StringProperty getTime() {
			return time;
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
