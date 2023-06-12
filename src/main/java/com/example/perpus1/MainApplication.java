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
    private Scene scenePeminjaman1;
    private ScenePeminjaman1 sceneControllerPeminjaman1;
    private Scene scenePeminjaman2;
    private ScenePeminjaman2 sceneControllerPeminjaman2;
    private Scene scenePengembalian1;
    private ScenePengembalian1 sceneControllerPengembalian1;
    private Scene scenePengembalian2;
    private ScenePengembalian2 sceneControllerPengembalian2;
    private Scene formAnggota;
    private FormAnggota formAnggotaController;

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

    public Scene getScenePeminjaman1() {
        return scenePeminjaman1;
    }

    public ScenePeminjaman1 getSceneControllerPeminjaman1() {
        return sceneControllerPeminjaman1;
    }

    public Scene getScenePeminjaman2() {
        return scenePeminjaman2;
    }

    public ScenePeminjaman2 getSceneControllerPeminjaman2() {
        return sceneControllerPeminjaman2;
    }

    public Scene getScenePengembalian1() {
        return scenePengembalian1;
    }

    public ScenePengembalian1 getSceneControllerPengembalian1() {
        return sceneControllerPengembalian1;
    }

    public Scene getScenePengembalian2() {
        return scenePengembalian2;
    }

    public ScenePengembalian2 getSceneControllerPengembalian2() {
        return sceneControllerPengembalian2;
    }

    public Scene getFormAnggota() {
        return formAnggota;
    }

    public FormAnggota getFormAnggotaController() {
        return formAnggotaController;
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

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePeminjaman1.fxml"));
        scenePeminjaman1 = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPeminjaman1 = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePeminjaman.fxml"));
        scenePeminjaman2 = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPeminjaman2 = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePengembalian1.fxml"));
        scenePengembalian1 = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPengembalian1 = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scenePengembalian.fxml"));
        scenePengembalian2 = new Scene(fxmlLoader.load(), 600, 400);
        sceneControllerPengembalian2 = fxmlLoader.getController();

        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("formAnggota.fxml"));
        formAnggota = new Scene(fxmlLoader.load(), 600, 400);
        formAnggotaController = fxmlLoader.getController();


        stage.setTitle("Perpustakaan ABC");
        stage.setScene(sceneAwal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}