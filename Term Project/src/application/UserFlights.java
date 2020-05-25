package application;


import java.sql.Connection;
import java.sql.ResultSet;

import common.Customer;
import common.User;
import database.Queries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserFlights implements ControlledScreen{

	//Variables
		ScreensController myController;
		
		public void setScreenParent(ScreensController screenParent) {
			myController = screenParent;
		}
		
		@FXML
		private TableView<FlightDetails> tableFlight;
		@FXML
		private TableColumn<FlightDetails, String> columnFlightNumber;
		@FXML
		private TableColumn<FlightDetails, String> columnDeparture;
		@FXML
		private TableColumn<FlightDetails, String> columnDestination;
		@FXML
		private TableColumn<FlightDetails, String> columnDate;
		@FXML
		private TableColumn<FlightDetails, String> columnTime;
		@FXML
		private TableColumn<FlightDetails, String> columnPassengerCount;
		@FXML
		private TableColumn<FlightDetails, String> columnBook;
		@FXML
		private Button btnLoad;
		
		public User currentUser;
		
		private ObservableList<FlightDetails> data;
		
		@FXML
		private void loadDataFromDatabase(ActionEvent event) throws Exception {
			//TODO fix
			currentUser = (Customer) (myController.getScreen("Customer"));
			try {
				Connection con = Queries.getConnection();
				data = FXCollections.observableArrayList();
				ResultSet rs = con.createStatement().executeQuery("SELECT flight_number FROM `world`.`reservations`"
						+ "WHERE cust_id = " + currentUser.getUserId());
				while (rs.next()) {
					data.add(new FlightDetails(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getString(6), rs.getString(7)));
				}
			} catch (Exception ex) {
				System.out.println("Error" + ex);
			}
			
			columnFlightNumber.setCellValueFactory(new PropertyValueFactory<>("flightNumber"));
			columnDeparture.setCellValueFactory(new PropertyValueFactory<>("departure"));
			columnDestination.setCellValueFactory(new PropertyValueFactory<>("destination"));
			columnDate.setCellValueFactory(new PropertyValueFactory<>("date"));
			columnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
			columnPassengerCount.setCellValueFactory(new PropertyValueFactory<>("passengerCount"));
			
			tableFlight.setItems(null);
			tableFlight.setItems(data);
			
			
		}
		


		

		
		
}
	
	

