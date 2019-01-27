package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuPaneController implements Initializable {

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private Menu fileMenu;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }
}
