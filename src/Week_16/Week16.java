package Week_16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Week16 extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField firstNameTextField = new TextField();
        firstNameTextField.setPromptText("First Name");
        TextField surnameTextField = new TextField();
        surnameTextField.setPromptText("Surname");
        Button submitButton = new Button();
        submitButton.setText("Greetings");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nameConfirmAlert(firstNameTextField.getText(),
                        surnameTextField.getText());
            }
        });
        GridPane root = new GridPane();
        root.setPadding(new Insets(70, 70, 70, 70));
        GridPane.setConstraints(firstNameTextField, 0, 0);
        GridPane.setConstraints(surnameTextField, 0, 1);
        GridPane.setConstraints(submitButton, 0, 2);
        root.getChildren().addAll(submitButton, firstNameTextField, 
                surnameTextField);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Introduction");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void nameConfirmAlert(String firstName, String surname) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Hello, is you name? "
                + firstName + " " + surname,
                ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            replyConfirmation("Amazing!");
        } else if (alert.getResult() == ButtonType.NO) {
            replyConfirmation("Whoops sorry! Try again =(");
        } else if (alert.getResult() == ButtonType.CANCEL) {
            replyConfirmation("ohh ok bye then.");
        }
    }

    public void replyConfirmation(String message) {
        Alert alertCancelReply = new Alert(AlertType.INFORMATION, message);
        alertCancelReply.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
