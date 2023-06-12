package com.example.perpus1;


import javafx.fxml.FXML;
import javafx.scene.Scene;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormAnggota{
    public TextField id;
    public TextField nama;
    public TextField noTelp;
    @FXML
    protected void saveAndBackToAnggota() {
        Anggota anggota = new Anggota(id.getText(),nama.getText(), noTelp.getText());

        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneAnggota = app.getSceneAnggota();
        primaryStage.setScene(sceneAnggota);
    }


}

