/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 19219
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("This is a label");
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        button1.getStyleClass().add("button-black");
        button2.getStyleClass().add("button-white");
        
        HBox hbox = new HBox(10, label, button1, button2);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        
        Scene scene = new Scene(hbox);
        scene.getStylesheets().add("demo2.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
