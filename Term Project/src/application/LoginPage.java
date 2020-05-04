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
import common.Customer;
import common.Action;

public class LoginPage implements ControlledScreen {
	
	ScreensController myController;
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	@FXML
	public void loginButtonPushed(ActionEvent event) {
		
		
		boolean loginAccepted = true;
		if (loginAccepted) {

			myController.setScreen(Main.homePageID);
			
		} else {
			// TODO make password not accepted popup window
		}
	}
	//Takes user to Create Account Page
	@FXML
	public void createAccountPushed(ActionEvent event) throws Exception{
		
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
		String correct = "1234";//Customer.answer;
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(e -> {
			String answer = input.getText();
			if (answer.equals(correct)) {
			label1.setText("1234"/*Customer.password*/);
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
