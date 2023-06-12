package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScenePengembalian {
    @FXML
    protected void onClickBack(){
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneAwal = app.getSceneAwal();
        primaryStage.setScene(sceneAwal);
    }
}
