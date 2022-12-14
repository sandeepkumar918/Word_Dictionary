package com.example.word_dictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws Exception {
        root=new Group();
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Word Dictionary");

        DictionaryPage page=new DictionaryPage();
        root.getChildren().add(page.root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}