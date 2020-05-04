package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CreateAccountPage implements ControlledScreen {

	ScreensController myController;

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
	private TextField nameInput;

	@FXML
	private TextField passwordInput;

	@FXML
	private TextField emailInput;

	@FXML
	private TextField stateInput;
	
	ObservableList<String> securityQuestionsList = FXCollections.observableArrayList("Favorite color?", "Favorite food?", "Favorite animal?");

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	public void initialize() {
		securityQuestions.setItems(securityQuestionsList);
	}

	/*public void create Account() {
		
	}*/
}
