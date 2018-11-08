package aabduljabbar1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField zipField;
    @FXML
    Label loc;
    @FXML
    Label con;
    @FXML
    Label tem;

    public void handleWeatherButton(ActionEvent e)
    {
        Weather W = new Weather(zipField.getText());
        W.fetch();
        loc.setText(W.getLocation());
        loc.setVisible(true);
        con.setText(W.getCondition());
        con.setVisible(true);
        tem.setText(W.getTemp());
        tem.setVisible(true);
    }

    public void handleClearButton(ActionEvent e)
    {
        zipField.setText("");
        loc.setText("");
        con.setText("");
        tem.setText("");
    }
}
