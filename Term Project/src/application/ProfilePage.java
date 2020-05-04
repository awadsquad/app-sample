package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProfilePage implements ControlledScreen {

	ScreensController myController;

	// Displays page elements
	@FXML
	private Label lName;

	@FXML
	private Label fName;

	@FXML
	private Label city;

	@FXML
	private Label phone;

	@FXML
	private Label state;

	@FXML
	private Label email;

	@FXML
	private Label sSN;
	
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
	
	//Gets and displays user information
	
	
	

}
