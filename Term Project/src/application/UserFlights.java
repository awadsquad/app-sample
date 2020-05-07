package application;

import java.net.URL;
import java.util.ResourceBundle;

import common.Flight;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserFlights implements Initializable{

	//Variables
		ScreensController myController;
		
		public void setScreenParent(ScreensController screenParent) {
			myController = screenParent;
		}
		
		@FXML 
		private TableView<ListenerFlight> tableview;
		
		@FXML
		private TableColumn<ListenerFlight, String> destination;
		@FXML
		private TableColumn<ListenerFlight, String> date;
		@FXML
		private TableColumn<ListenerFlight, String> time;
		@FXML
		private TableColumn<ListenerFlight, String> passengerCount;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			destination.setCellValueFactory(new PropertyValueFactory<ListenerFlight, String>(" "));
			
			//tableView.setItems();
			
		}
		
		/*public ObservableList<ListenerFlight> getFlights() {
			ObservableList<ListenerFlight>
		}*/
		
		
	}
	
	//Makes flight object into a listener type
	class ListenerFlight {
		

		private SimpleStringProperty destination, flightNumber, passengerCount, date, time;
		
		public ListenerFlight(Flight f) {
			this.destination = new SimpleStringProperty(f.getDestination());
			this.flightNumber = new SimpleStringProperty(Integer.toString(f.getFlightNumber()));
			this.passengerCount = new SimpleStringProperty(Integer.toString(f.getPassengerCount()));
			this.date = new SimpleStringProperty(f.getDate());
			this.time = new SimpleStringProperty(f.getTime());
			
		}

		//Getters and Setters
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



