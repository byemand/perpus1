package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScenePengembalian2 {
    @FXML
    protected void saveAndBackTo1(){
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene scenePengembalian1 = app.getScenePengembalian1();
        primaryStage.setScene(scenePengembalian1);
    }
}
