package application;

import javafx.event.ActionEvent;


import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import common.Customer;

public class ProfilePage implements ControlledScreen, Initializable {

	ScreensController myController;

	// Page elements
	@FXML
	private Label profileName;

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
	
	@FXML
	private Label zipcode;
	
	@FXML 
	private Label address;

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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		String status = Main.currentUser.getStatus();

			Customer user = (Customer)Main.currentUser;


		try {
			profileName.setText(user.getUserName());
			fName.setText(user.getFirstName());
			lName.setText(user.getLastName());
			city.setText(user.getCity());
			phone.setText(user.getPhone());
			state.setText(user.getState());
			email.setText(user.getEmail());
			sSN.setText(user.getsSN());
			address.setText(user.getAddress());
			phone.setText(user.getPhone());
			
		} catch (Exception ex) {
			System.out.println("Display issue");
			System.out.println(ex);
		}
		
		
		

	}

}
