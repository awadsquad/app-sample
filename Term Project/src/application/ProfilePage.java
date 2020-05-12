package application;

import javafx.event.ActionEvent;


import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import common.Customer;
import common.User;

public class ProfilePage implements ControlledScreen {

	ScreensController myController;

	// Page elements
	@FXML
	private static Label profileName;

	@FXML
	private static Label lName;

	@FXML
	private static Label fName;

	@FXML
	private static Label city;

	@FXML
	private static Label phone;

	@FXML
	private static Label state;

	@FXML
	private static Label email;

	@FXML
	private static Label sSN;
	
	@FXML
	private Label zipcode;
	
	@FXML 
	private static Label address;
	
	private static User currentUser;
	
	

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
	

	public static void setLabels(User currentUser) {
		

		
		try {
			profileName.setText(currentUser.getUserName());
			fName.setText(currentUser.getFirstName());
			lName.setText(currentUser.getLastName());
			city.setText(currentUser.getCity());
			phone.setText(currentUser.getPhone());
			state.setText(currentUser.getState());
			email.setText(currentUser.getEmail());
			sSN.setText(currentUser.getsSN());
			address.setText(currentUser.getAddress());
			phone.setText(currentUser.getPhone());
			
		} catch (Exception ex) {
			System.out.println("Display issue");
			System.out.println(ex);
		}
		
		
		

	}

}
