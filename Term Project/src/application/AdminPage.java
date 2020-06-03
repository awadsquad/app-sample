package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import common.Action;
import common.Admin;
import common.Customer;
import database.Queries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Paint;

public class AdminPage implements ControlledScreen, Initializable {
	
	
	ObservableList<String> updateList = FXCollections.observableArrayList("Departure", "Destination", "Date", "Time",
			"Passengers");
	
	ScreensController myController;
	Customer currentUser;
	Admin currentAdmin;

	private ObservableList<FlightDetails> data;
	
	//Variables in UI
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
	@FXML
	private TextField input;
	@FXML
	private Label deleteResult;
	@FXML
	private ChoiceBox<String> flightAttributes;
	@FXML
	private TextField deleteNumber;
	@FXML
	private TextField updateValue;
	@FXML
	private TextField updateNumber;
	@FXML
	private Label updateResult;

	@FXML
	private TextField passInput;
	@FXML
	private TextField timeInput;
	@FXML
	private TextField dateInput;
	@FXML
	private TextField departureInput;
	@FXML
	private TextField destinationInput;
	@FXML
	private Label insertResult;

	

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;

	}

	// Takes user back to BookingPage Page
	public void back(ActionEvent event) {

		myController.setScreen(Main.userFlightsID);
	}

	// Takes user back to home page
	public void home(ActionEvent event) {

		myController.setScreen(Main.homePageID);

	}
	
	//Allows admin to remove a flight
	public void deleteFlight(ActionEvent e) {
		Action.deleteFlight(deleteNumber.getText());
	}
	
	//Allows admin to make a new flight
	public void insertFlight(ActionEvent e) {
		try {
			insertResult.setText(Action.insertFlight(departureInput.getText(), destinationInput.getText(),
					dateInput.getText(), timeInput.getText(), passInput.getText()));
			if(insertResult.getText().equals("Added")) {
				insertResult.setTextFill(Paint.valueOf("#00CC00"));
			}
			else {
				insertResult.setTextFill(Paint.valueOf("#FF0000"));
			}
		} catch (Exception ex) {
			
			System.out.println(ex);
		}
	}
	
	//Allows admin to access change different attributes of Flight
	public void updateFlight(ActionEvent e) {
		
		String fNumber = updateNumber.getText();
		String choice = flightAttributes.getValue();
		String value = updateValue.getText();
		updateResult.setText(Action.updateFlight(choice, value, fNumber));
		if (updateResult.getText().equals("Updated")) {
			updateResult.setTextFill(Paint.valueOf("#00CC00"));
		}
		else {
			updateResult.setTextFill(Paint.valueOf("#FF0000"));
		}

	}
	
	
	//Loads table showing flights in database
	@FXML
	private void loadDataFromDatabase(ActionEvent event) throws Exception {
		try {
			Connection con = Queries.getConnection();
			data = FXCollections.observableArrayList();
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `world`.`flights`");
			while (rs.next()) {
				data.add(new FlightDetails(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6)));
			}
			con.close();
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
	
	//Sets up list of attributes that can be updated
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		flightAttributes.setItems(updateList);

	}

}
