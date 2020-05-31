package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
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
import common.User;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import common.Action;

public class LoginPage implements ControlledScreen {

	ScreensController myController;

	@FXML
	private TextField usernameInput;

	@FXML
	private TextField passInput;

	public static User currentUser;

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}

	public void setUser(User a) {
		LoginPage.currentUser = a;
	}

	public static User getUser() {
		return currentUser;
	}

	@FXML
	public void loginButtonPushed(ActionEvent event) {

		String username = usernameInput.getText();
		String password = passInput.getText();

		try {
			if (Action.validLogin(username, password)) {
				currentUser = Action.setUser(username, password);

				myController.setScreen(Main.homePageID);
				myController.addScreen("Customer", currentUser);

			} else {
				incorrectLogin();
			}
		} catch (Exception ex) {
			incorrectLogin();
			System.out.println("Authentication failed");
			System.out.println(ex);
		}
	}

	// Takes user to Create Account Page
	@FXML
	public void createAccountPushed(ActionEvent event) throws Exception {

		myController.setScreen(Main.createAccountID);

	}

	// Allows user to get password
	public void forgotPasswordPushed(ActionEvent event) {
		String username = usernameInput.getText();
		LoginPage.passwordForgotten(username);
	}

	public static void passwordForgotten(String username) {

		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Forgot Password");
		window.setMinWidth(250);

		Label label = new Label();
		Label label1 = new Label();
		label.setText(Action.getSQuestion(username));
		TextField input = new TextField();
		String correct = Action.getSAnswer(username);
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(e -> {
			String answer = input.getText();
			if (answer.equals(correct)) {
				label1.setText(Action.getPassword(username));
			} else {
				label1.setText("Incorrect");
			}
		});

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.getChildren().addAll(label, input, submitButton, label1);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();

	}

	public static void incorrectLogin() {
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Error");
		window.setMinWidth(250);

		Label label = new Label();
		label.setText("Incorrect Login, try again");
		Button submitButton = new Button("Close");
		submitButton.setOnAction(e -> window.close());

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.getChildren().addAll(label, submitButton);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}

}
