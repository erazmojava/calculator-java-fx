package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Float data = 0f;
    int operation = -1;

    @FXML
    public Button prefix;
    @FXML
    public Button zero;
    @FXML
    public Button backspace;
    @FXML
    public Button dot;
    @FXML
    public Button delete_all;
    @FXML
    public Button open_bracket;
    @FXML
    public Button close_bracket;
    @FXML
    public Button doResult;
    @FXML
    private Label result;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button divide;
    @FXML
    private Button multiple;
    @FXML
    EventHandler handleNine = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "9");
        }
    };
    EventHandler handleEight = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "8");
        }
    };
    EventHandler handleSeven = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "7");
        }
    };
    EventHandler handleSix = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "6");
        }
    };
    EventHandler handleFive = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "5");
        }
    };
    EventHandler handleFour = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "4");
        }
    };
    EventHandler handleThree = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "3");
        }
    };
    EventHandler handleTwo = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "2");
        }
    };
    EventHandler handleOne = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "1");
        }
    };
    EventHandler handleZero = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "0");
        }
    };
    EventHandler handlePlus = new EventHandler() {
        @Override

        public void handle(Event event) {
            if (result.getText() != "") {
                data = Float.parseFloat(result.getText());
                operation = 1; //Addition
                result.setText("");
            }
        }
    };
    EventHandler handleMinus = new EventHandler() {
        @Override
        public void handle(Event event) {
            if (result.getText() != "") {
                data = Float.parseFloat(result.getText());
                operation = 2; //Addition
                result.setText("");
            }
        }
    };
    EventHandler handleDivide = new EventHandler() {
        @Override
        public void handle(Event event) {
            if (result.getText() != "") {
                data = Float.parseFloat(result.getText());
                operation = 3; //Addition
                result.setText("");
            }
        }
    };
    EventHandler handleMultiple = new EventHandler() {
        @Override
        public void handle(Event event) {
            if (result.getText() != "") {
            data = Float.parseFloat(result.getText());
            operation = 4; //Addition
            result.setText("");
        }
        }
    };
    EventHandler handleBackspace = new EventHandler() {

        @Override
        public void handle(Event event) {
            if (result.getText().length()>0){
                result.setText(result.getText().substring(0,result.getText().length()-1));
            }
        }

    };
    EventHandler handleDeleteAll = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText("");
        }
    };
    EventHandler handlePrefix = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "-");
        }
    };
    EventHandler handleOpenBracket = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + "(");
        }
    };
    EventHandler handleCloseBracket = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + ")");
        }
    };
    EventHandler handleDoResult = new EventHandler() {
        @Override
        public void handle(Event event) {
            if (result.getText() != "") {
                Float secondOperand = Float.parseFloat(result.getText());
                switch (operation) {
                    case 1:
                        Float ans = data + secondOperand;
                        result.setText(String.valueOf(ans));
                        break;
                    case 2:
                        ans = data - secondOperand;
                        result.setText(String.valueOf(ans));
                        break;
                    case 4:
                        ans = data * secondOperand;
                        result.setText(String.valueOf(ans));
                        break;
                    case 3:
                        ans = 0f;
                        try {
                            ans = data / secondOperand;
                        } catch (Exception e) {
                            result.setText("Error");
                        }
                        result.setText(String.valueOf(ans));
                        break;
                }
            }
        }
    };
    EventHandler handleDot = new EventHandler() {
        @Override
        public void handle(Event event) {
            result.setText(result.getText() + ".");
        }
    };
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nine.setOnAction(handleNine);
        eight.setOnAction(handleEight);
        seven.setOnAction(handleSeven);
        six.setOnAction(handleSix);
        five.setOnAction(handleFive);
        four.setOnAction(handleFour);
        three.setOnAction(handleThree);
        two.setOnAction(handleTwo);
        one.setOnAction(handleOne);
        zero.setOnAction(handleZero);
        plus.setOnAction(handlePlus);
        minus.setOnAction(handleMinus);
        multiple.setOnAction(handleMultiple);
        divide.setOnAction(handleDivide);
        backspace.setOnAction(handleBackspace);
        delete_all.setOnAction(handleDeleteAll);
        prefix.setOnAction(handlePrefix);
        open_bracket.setOnAction(handleOpenBracket);
        close_bracket.setOnAction(handleCloseBracket);
        doResult.setOnAction(handleDoResult);
        dot.setOnAction(handleDot);
    }
}
