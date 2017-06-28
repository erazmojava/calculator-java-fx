package sample;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TextField one;
    @FXML
    public TextField two;

    @FXML
    public Label y;
    @FXML
    public Label x;

    @FXML
    Button submit;

    int x1= 4, y1 = -3, x2= 3, y2= -5, r1=-14, r2=-5;

    EventHandler submitHandler = new EventHandler() {
        @Override
        public void handle(Event event) {
            x1 = Integer.parseInt(one.getText().substring(0, one.getText().indexOf('x')));
            y1 = Integer.parseInt(one.getText().substring(one.getText().indexOf('x')+1, one.getText().indexOf('y')));
            r1 = Integer.parseInt(one.getText().substring(one.getText().indexOf('=')+1, one.getText().length()));

            x2 = Integer.parseInt(two.getText().substring(0, two.getText().indexOf('x')));
            y2 = Integer.parseInt(two.getText().substring(two.getText().indexOf('x')+1, two.getText().indexOf('y')));
            r2 = Integer.parseInt(two.getText().substring(two.getText().indexOf('=')+1, two.getText().length()));

            double d = (x1*y2) -(y1*x2);
            double dx = (r1*y2) -(r2*y1);
            double dy = (r2*x1) - (r1*x2);
            x.setText(String.valueOf(dx/d));
            y.setText(String.valueOf(dy/d));
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        submit.setOnAction(submitHandler);
    }
}
