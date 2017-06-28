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

public class Controller1 implements Initializable {

    @FXML
    public Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText(System.getProperty("test"));
    }
    public interface ChangeText {
        void onTextChanged(String text);
    }
}
