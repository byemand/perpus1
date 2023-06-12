package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScenePeminjaman2 {

    @FXML
    protected void saveAndBackTo1(){
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene scenePeminjaman1 = app.getScenePeminjaman1();
        primaryStage.setScene(scenePeminjaman1);
    }
}
