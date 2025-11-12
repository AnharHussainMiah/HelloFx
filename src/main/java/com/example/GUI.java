package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createContent(), 480, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Region createContent() {
        HBox results = new HBox(new Label("Hello World!"), new TextField(""));
        results.setSpacing(6);
        results.setPadding(new Insets(0, 0, 0, 50));
        results.setAlignment(Pos.CENTER_LEFT);
        return results;
    }
}