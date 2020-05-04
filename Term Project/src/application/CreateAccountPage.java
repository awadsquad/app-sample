package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import common.Customer;

public class CreateAccountPage implements ControlledScreen, Initializable {

	ScreensController myController;
	Customer newAccount;

	// All needed page elements
	@FXML
	private TextField sSNInput;

	@FXML
	private TextField userNameInput;

	@FXML
	private TextField cityInput;

	@FXML
	private ChoiceBox<String> securityQuestions;

	@FXML
	private TextField answerInput;

	@FXML
	private TextField phoneInput;

	@FXML
	private TextField fNameInput;
	
	@FXML
	private TextField lNameInput;

	@FXML
	private TextField passwordInput;

	@FXML
	private TextField emailInput;

	@FXML
	private TextField stateInput;
	
	private String question;
	

	ObservableList<String> securityQuestionsList = FXCollections.observableArrayList("Favorite color?",
			"Favorite food?", "Favorite animal?");

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}

	// Takes user back to Login Page
	public void Logout(ActionEvent event) {

		myController.setScreen(Main.loginPageID);
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Fills in choicebox
		securityQuestions.setItems(securityQuestionsList);
		
	}

	public void createAccount(ActionEvent event) {
		//Stores account inputs in Customer Object
		newAccount.setFirstName(fNameInput.getText());
		newAccount.setLastName(lNameInput.getText());
		newAccount.setEmail(emailInput.getText());
		newAccount.setPhone(phoneInput.getText());
		newAccount.setsSN(sSNInput.getText());
		newAccount.setUserName(userNameInput.getText());
		newAccount.setPassword(passwordInput.getText());
		newAccount.setSecurityQuestion(question);
		newAccount.setSecurityAnswer(answerInput.getText());
		newAccount.setState(stateInput.getText());
		newAccount.setCity(cityInput.getText());
		
		System.out.print("Account created");
		
	 }
	//Gets security Question
	public void getChoice(ActionEvent event) {
		question = securityQuestions.getValue();
	
	}
	 
}
