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

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}

	public void flightConfirmed(ActionEvent event) {

		boolean b = false;

		if (b) {
			flightConfirmation.setText("Flight Confirmed");
		} else {
			flightConfirmation.setText("Error: Try Again");
		}
	}

}
