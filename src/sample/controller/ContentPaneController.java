package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.mp3.Mp3Song;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    public static final String TITLE_COLUMN = "Title";
    public static final String AUTHOR_COLUMN = "Author";
    public static final String ALBUM_COLUMN = "Album";

    @FXML
    private TableView<Mp3Song> contentTable;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        configureTable();
    }

    private void configureTable() {
        TableColumn<Mp3Song, String> titleColumn = new TableColumn<Mp3Song, String>(TITLE_COLUMN);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Mp3Song, String> authorColumn = new TableColumn<Mp3Song, String>(AUTHOR_COLUMN);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        TableColumn<Mp3Song, String> albumColumn = new TableColumn<Mp3Song, String>(ALBUM_COLUMN);
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

        contentTable.getColumns().add(titleColumn);
        contentTable.getColumns().add(authorColumn);
        contentTable.getColumns().add(albumColumn);
    }
}
