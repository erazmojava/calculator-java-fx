package Zadatak1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Pane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button button = new Button();
        button.setText("TEST tEST");
        button.setPrefHeight(60);
        button.setLayoutX(10);
        root.getChildren().add(button);
        System.setProperty("test", "Test from previous screen");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.runLater(new Runnable() {
                    public void run() {
                        try {
                            new Screen().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
    public interface ChangeText {
        void onTextChanged(String text);
    }
}
