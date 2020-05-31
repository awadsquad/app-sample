package application;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

import common.Customer;
import common.Action;

public class CreateAccountPage implements ControlledScreen, Initializable {

	ScreensController myController;

	// All needed page elements
	@FXML
	private TextField sSNInput;

	@FXML
	private TextField zipcodeInput;

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

	@FXML
	private TextField addressInput;

	@FXML
	private TextField adminInput;

	@FXML
	private Label submission;

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

		// Fills in choicebox
		securityQuestions.setItems(securityQuestionsList);

	}
	
	// Gets security Question
	public String getChoice() {
			return securityQuestions.getValue();

	}

	public void createAccount(ActionEvent event) {

		try {
			// Stores account inputs in Customer Object
			Customer newAccount = new Customer();

			newAccount.setFirstName(fNameInput.getText());
			newAccount.setLastName(lNameInput.getText());
			newAccount.setEmail(emailInput.getText());
			newAccount.setPhone(phoneInput.getText());
			newAccount.setsSN(sSNInput.getText());
			newAccount.setUserName(userNameInput.getText());
			newAccount.setPassword(passwordInput.getText());
			newAccount.setSecurityQuestion(getChoice());
			newAccount.setSecurityAnswer(answerInput.getText());
			newAccount.setState(stateInput.getText());
			newAccount.setCity(cityInput.getText());
			newAccount.setAddress(addressInput.getText());
			newAccount.setZipcode(zipcodeInput.getText());
			

			if (Action.usernameTaken(newAccount.getUserName()) == false) {

				// Verifies that user inputs correct admin code and inserts account
				if (adminInput.getText().equals("admin1234")) {
					newAccount.setStatus("admin");
					Action.createAccount(newAccount);
					submission.setText("Admin Approved, Account Created");
					submission.setTextFill(Paint.valueOf("00CC00"));
				}

				else {
					submission.setText("Admin Denied, Account Created");
					Action.createAccount(newAccount);
					submission.setTextFill(Paint.valueOf("00CC00"));
				}

			}
			
			else {
				submission.setText("Username taken, try again");
				submission.setTextFill(Paint.valueOf("#FF0000"));
			}

		} catch (Exception ex) {
			submission.setText("One or more invalid entry");
			submission.setTextFill(Paint.valueOf("#FF0000"));
			System.out.println(ex);
		}

	}

	

}
