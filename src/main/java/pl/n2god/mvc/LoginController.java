package pl.n2god.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Button loginButton;

    @FXML
    private Label primaryLabel;

    @FXML
    private TextField usernameTextField;

    public void initialize(){
        String labelText = usernameTextField.getText();
        System.out.println(labelText);
        usernameTextField.setText("tekst z kontrolera!");
    }
}

