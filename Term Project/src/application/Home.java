package application;

import common.Customer;
import common.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Home implements ControlledScreen {

	ScreensController myController;

	User currentUser;

	public void setCurrentUser(User a) {
		currentUser = a;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;

	}

	// Opens profile page when Profile button is clicked
	public void profileButtonPushed(ActionEvent event) {
		
		currentUser = (Customer) (myController.getScreen("Customer"));
		myController.setScreen(Main.profilePageID);
		
	}

	// Displays scene for booking flights
	public void bookingButtonPushed(ActionEvent event) throws Exception {
		
		currentUser = (Customer) (myController.getScreen("Customer"));
		myController.setScreen(Main.flightListingsID);

	}

	public void Logout(ActionEvent event) {

		myController.setScreen(Main.loginPageID);
	}

}
