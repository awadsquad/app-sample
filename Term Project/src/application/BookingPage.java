package application;

import common.Action;
import common.Flight;
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
	private TextField timeInput;

	@FXML
	private Label timeOutput;

	@FXML
	private Label dateOutput;
	@FXML
	private Label destinationOutput;

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
		
		Flight f = new Flight();
		try {
			f = Action.bookFlight(destinationInput.getText(), dateInput.getText(), timeInput.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean b = false;

			flightConfirmation.setText("Flight Confirmed");
			destinationOutput.setText(f.getDestination());
			timeOutput.setText(f.getTime());
			dateOutput.setText(f.getDate());
	}

}
