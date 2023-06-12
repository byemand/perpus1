package com.example.perpus1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SceneAnggota implements Initializable {
    @FXML
    protected void onClickBack() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneAwal = app.getSceneAwal();
        primaryStage.setScene(sceneAwal);
    }

    @FXML
    protected void onAdd() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene formAnggota = app.getFormAnggota();
        primaryStage.setScene(formAnggota);
    }

    public TableView<Anggota> tabelAnggota;
    public TableColumn<Anggota, String> colID;
    public TableColumn<Anggota, String> colNama;
    public TableColumn<Anggota, String> colNoTelp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colID.setCellValueFactory(new PropertyValueFactory<>("idAnggota"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colNoTelp.setCellValueFactory(new PropertyValueFactory<>("noTelp"));
        tabelAnggota.setItems(listAnggota);
    }

    ObservableList<Anggota> listAnggota = FXCollections.observableArrayList();
    public TextField id;
    public TextField nama;
    public TextField noTelp;
    @FXML
    protected void save() {
        Anggota anggota = new Anggota(id.getText(),nama.getText(), noTelp.getText());
        tabelAnggota.getItems().add(anggota);
        clear();
    }

    @FXML
    protected void clear(){
        id.setText("");
        nama.setText("");
        noTelp.setText("");

    }
}

