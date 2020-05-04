package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginPage implements ControlledScreen {
	
	ScreensController myController;
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	@FXML
	private void loginButtonPushed(ActionEvent event) {

		boolean loginAccepted = true;
		if (loginAccepted) {

			myController.setScreen(Main.homePageID);
			
		} else {
			// TODO make password not accepted popup window
		}
	}
	//Takes user to Create Account Page
	@FXML
	private void createAccountPushed(ActionEvent event) throws Exception{
		
		myController.setScreen(Main.createAccountID);
		
	}
	
	//Allows user to get password
	public void forgotPasswordPushed(ActionEvent event) {
		LoginPage.passwordForgotten();
	}
	
	public static void passwordForgotten() {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Forgot Password");
		window.setMinWidth(250);
		
		Label label = new Label();
		Label label1 = new Label();
		label.setText(/*Customer.securityQuestion*/"");
		TextField input = new TextField();
		String answer = input.getText();
		String correct = "Hello";//Customer.answer;
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(e -> {if (answer.equals(correct)) {
			label1.setText("Ayyy"/*Customer.password*/);
		} else {
			label1.setText("Incorrect");
		}});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, input, submitButton, label1);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
	}
	
}
