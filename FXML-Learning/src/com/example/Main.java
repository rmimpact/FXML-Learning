package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void (Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        Loader.setController(this);
        Scene scene = new Scene(Loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void closeApp() {
        System.exit(0);
    }

    public static void main(String[] string) {
        launch();
    }
}