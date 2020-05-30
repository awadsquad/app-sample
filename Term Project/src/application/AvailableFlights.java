package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

import common.Action;
import common.Admin;
import common.Customer;
import common.User;
import database.Queries;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AvailableFlights implements ControlledScreen {

	@FXML
	private TableView<FlightDetails> tableFlight1;
	@FXML
	private TableColumn<FlightDetails, String> columnFlightNumber1;
	@FXML
	private TableColumn<FlightDetails, String> columnDeparture1;
	@FXML
	private TableColumn<FlightDetails, String> columnDestination1;
	@FXML
	private TableColumn<FlightDetails, String> columnDate1;
	@FXML
	private TableColumn<FlightDetails, String> columnTime1;
	@FXML
	private TableColumn<FlightDetails, String> columnPassengerCount1;
	@FXML
	private TableColumn<FlightDetails, String> columnBook1;
	@FXML
	private Button btnLoad;
	@FXML
	private TextField input;
	@FXML
	private Label result;
	@FXML
	private MenuItem admin;

	ScreensController myController;
	Customer currentUser;
	Admin currentAdmin;

	private ObservableList<FlightDetails> data;

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;

	}

	// Takes user back to Login Page
	public void Logout(ActionEvent event) {

		myController.setScreen(Main.loginPageID);
	}

	// Takes user back to home page
	public void home(ActionEvent event) {

		myController.setScreen(Main.homePageID);

	}
	
	//Takes admin to adminPage
	public void adminPage(ActionEvent event) {
		
		currentUser = (Customer) (myController.getScreen("Customer"));
		if(/*currentUser.getStatus().equals("true")*/ true) {
			myController.setScreen(Main.adminPageId);
		}
			admin.setText("Denied");
		
	}

	public void bookFlight(ActionEvent event) {

		currentUser = (Customer) (myController.getScreen("Customer"));
		String flightId = input.getText();
		String custId = currentUser.getUserId();
		System.out.println(custId);
		String output;
		try {
			output = Action.bookFlight(flightId, custId);
			result.setText(output);
		} catch (Exception ex) {
			System.out.println("Flight not booked");
			System.out.println(ex);
		}

	}
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
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}

		columnFlightNumber1.setCellValueFactory(new PropertyValueFactory<>("flightNumber"));
		columnDeparture1.setCellValueFactory(new PropertyValueFactory<>("departure"));
		columnDestination1.setCellValueFactory(new PropertyValueFactory<>("destination"));
		columnDate1.setCellValueFactory(new PropertyValueFactory<>("date"));
		columnTime1.setCellValueFactory(new PropertyValueFactory<>("time"));
		columnPassengerCount1.setCellValueFactory(new PropertyValueFactory<>("passengerCount"));

		tableFlight1.setItems(null);
		tableFlight1.setItems(data);

	}

}
