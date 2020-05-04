package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import common.Customer;

public class ProfilePage implements ControlledScreen, Initializable{

	ScreensController myController;
	Customer user = new Customer("John", "Smith", "jsmith15","jsmith@gmail.com", "678-05-5378", "1234", "Atlanta", "GA", "USA", "Favorite color?");

	//Page elements
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
		/*profileName.setText(user.getUserName());
		fName.setText(user.getFirstName());
		lName.setText(user.getLastName());
		city.setText(user.getCity());
		phone.setText(user.getPhone());
		state.setText(user.getState());
		email.setText(user.getEmail());
		sSN.setText(user.getsSN());*/
		
	}
	
	
	
	

}
