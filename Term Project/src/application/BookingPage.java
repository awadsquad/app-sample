package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BookingPage implements ControlledScreen {

	// Elements on Page
	@FXML
	private TextField destinationInput;

	@FXML
	private TextField dateInput;

	@FXML
	private Label airportOutput;

	@FXML
	private Label timeOutput;

	@FXML
	private Label dateOutput;

	ScreensController myController;
	@FXML
	private Label flightConfirmation;
	
	//Sets Initial Screen
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
	//Books Flight
	public void flightConfirmed(ActionEvent event) {

		boolean b = false;

		if (b) {
			flightConfirmation.setText("Flight Confirmed");
		} else {
			flightConfirmation.setText("Error: Try Again");
		}
	}

}
