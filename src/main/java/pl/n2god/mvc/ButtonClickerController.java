package pl.n2god.mvc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonClickerController implements Initializable {

    @FXML
    private AnchorPane MainPane;

    @FXML
    private VBox PaneWithButtons;

    @FXML
    private Label firstLabel;

    @FXML
    private Button firstButton;

    @FXML
    private Label secondLabel;

    @FXML
    private Button secondButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstLabel.setText("Pierwszy tekst");
        secondLabel.setText("Drugi tekst");
        firstButton.setText("Tekst pierwszego przycisku");
        secondButton.setText("Tekst drugiego przycisku");
    }
}
