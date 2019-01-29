package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import sample.mp3.Mp3Collection;
import sample.mp3.Mp3Song;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {

    public static final String TITLE_COLUMN = "Title";
    public static final String AUTHOR_COLUMN = "Author";
    public static final String ALBUM_COLUMN = "Album";
    private Mp3Collection mp3Collection;

    @FXML
    private TableView<Mp3Song> contentTable;

    public TableView<Mp3Song> getContentTable() {
        return contentTable;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
