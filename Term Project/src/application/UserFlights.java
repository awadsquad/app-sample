package application;

import common.Flight;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserFlights {

	//Variables
		ScreensController myController;
		
		public void setScreenParent(ScreensController screenParent) {
			myController = screenParent;
		}
		
		@FXML 
		private TableView<ListenerFlight> tableview;
		
		@FXML
		private TableColumn<ListenerFlight, String> destination;
		private TableColumn<ListenerFlight, String> date;
		private TableColumn<ListenerFlight, String> time;
		private TableColumn<ListenerFlight, String> passengerCount;
		
		
		
	}

	class ListenerFlight {
		

		private SimpleStringProperty destination, flightNumber, passengerCount, date, time;
		
		public ListenerFlight(Flight f) {
			this.destination = new SimpleStringProperty(f.getDestination());
			this.flightNumber = new SimpleStringProperty(Integer.toString(f.getFlightNumber()));
			this.passengerCount = new SimpleStringProperty(Integer.toString(f.getPassengerCount()));
			this.date = new SimpleStringProperty(f.getDate());
			this.time = new SimpleStringProperty(f.getTime());
			
		}

		public SimpleStringProperty getDestination() {
			return destination;
		}

		public void setDestination(SimpleStringProperty destination) {
			this.destination = destination;
		}

		public SimpleStringProperty getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(SimpleStringProperty flightNumber) {
			this.flightNumber = flightNumber;
		}

		public SimpleStringProperty getPassengerCount() {
			return passengerCount;
		}

		public void setPassengerCount(SimpleStringProperty passengerCount) {
			this.passengerCount = passengerCount;
		}

		public SimpleStringProperty getDate() {
			return date;
		}

		public void setDate(SimpleStringProperty date) {
			this.date = date;
		}

		public SimpleStringProperty getTime() {
			return time;
		}

		public void setTime(SimpleStringProperty time) {
			this.time = time;
		}
		
		
		
	}



