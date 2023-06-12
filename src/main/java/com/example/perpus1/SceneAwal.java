package com.example.perpus1;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneAwal {
    @FXML
    private Text text;

    @FXML
    protected void onClickAnggota() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneAnggota = app.getSceneAnggota();
        primaryStage.setScene(sceneAnggota);
    }
    @FXML
    protected void onClickBuku() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene sceneBuku = app.getSceneBuku();
        primaryStage.setScene(sceneBuku);
    }
    @FXML
    protected void onClickPeminjaman() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene scenePeminjaman = app.getScenePeminjaman();
        primaryStage.setScene(scenePeminjaman);
    }
    @FXML
    protected void onClickPengembalian() {
        MainApplication app = MainApplication.getApplicationInstance();
        Stage primaryStage = app.getPrimaryStage();
        Scene scenePengembalian = app.getScenePengembalian();
        primaryStage.setScene(scenePengembalian);
    }

}