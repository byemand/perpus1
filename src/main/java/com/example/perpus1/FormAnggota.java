package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormAnggota {

    @FXML
    protected void saveAndBackToAnggota() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneAnggota = app.getSceneAnggota();
        primaryStage.setScene(sceneAnggota);
    }
}
