package com.example.perpus1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    private static MainApplication applicationInstance;

    public MainApplication() {
        applicationInstance = this;
    }

    public static MainApplication getApplicationInstance() {
        return applicationInstance;
    }

    private Stage primaryStage;
    private Scene sceneAwal;
    private SceneAwal sceneControllerAwal;
    private Scene sceneAnggota;
    private SceneAnggota sceneControllerAnggota;
    private Scene sceneBuku;
    private SceneBuku sceneControllerBuku;
    private Scene scenePeminjaman;
    private ScenePeminjaman sceneControllerPeminjaman;
    private Scene scenePengembalian;
    private ScenePengembalian sceneControllerPengembalian;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Scene getSceneAwal() {
        return sceneAwal;
    }

    public SceneAwal getSceneControllerAwal() {
        return sceneControllerAwal;
    }

    public Scene getSceneAnggota() {
        return sceneAnggota;
    }

    public SceneAnggota getSceneControllerAnggota() {
        return sceneControllerAnggota;
    }

    public Scene getSceneBuku() {
        return sceneBuku;
    }

    public SceneBuku getSceneControllerBuku() {
        return sceneControllerBuku;
    }

    public Scene getScenePeminjaman() {
        return scenePeminjaman;
    }

    public ScenePeminjaman getSceneControllerPeminjaman() {
        return sceneControllerPeminjaman;
    }

    public Scene getScenePengembalian() {
        return scenePengembalian;
    }

    public ScenePengembalian getSceneControllerPengembalian() {
        return sceneControllerPengembalian;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        sceneAwal = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerAwal = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("sceneAnggota.fxml"));
        sceneAnggota = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerAnggota = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("sceneBuku.fxml"));
        sceneBuku = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerBuku = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePeminjaman.fxml"));
        scenePeminjaman = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPeminjaman = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePengembalian.fxml"));
        scenePengembalian = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPengembalian = fxmlLoader.getController();


        stage.setTitle("Perpustakaan ABC");
        stage.setScene(sceneAwal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}