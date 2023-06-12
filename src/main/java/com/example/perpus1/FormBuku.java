package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormBuku {
    @FXML
    protected void saveAndBackToBuku() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneBuku = app.getSceneBuku();
        primaryStage.setScene(sceneBuku);
    }
}
