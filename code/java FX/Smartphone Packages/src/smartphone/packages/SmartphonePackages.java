/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone.packages;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 19219
 */
public class SmartphonePackages extends Application {
    private Label label1;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    
    private Label label6;
    private Label label7;
    private Label label8;
    private Label label9;
    
    
    
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private RadioButton radio5;
    private RadioButton radio6;
    
    private ToggleGroup radiogroup1;
    private ToggleGroup radiogroup2;
    
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        label1 = new Label("Select a Data Plan");
        label2 = new Label("Data Plan Cost: $");
        label3 = new Label("Select a Phone");
        label4 = new Label("Data Plan Cost: $");
        label5 = new Label("Options Cost: $");
        
        label6 = new Label("0per month");
        label7 = new Label("0.00per month");
        label8 = new Label("+O.00per month");
        label9 = new Label("0per month");
        
        radio1 = new RadioButton("8 gigabytes per month");
        radio2 = new RadioButton("16 gigabytes per month");
        radio3 = new RadioButton("20 gigabytes per month");
        radio4 = new RadioButton("Model 100");
        radio5 = new RadioButton("Model 110");
        radio6 = new RadioButton("Model 200");
        
        radiogroup1 = new ToggleGroup();
        radiogroup2 = new ToggleGroup();
        
        radio1.setToggleGroup(radiogroup1);
        radio2.setToggleGroup(radiogroup1);
        radio3.setToggleGroup(radiogroup1);
        radio4.setToggleGroup(radiogroup2);
        radio5.setToggleGroup(radiogroup2);
        radio6.setToggleGroup(radiogroup2);
        
        checkbox1 = new CheckBox("Phone Replacement Insurance");
        checkbox2 = new CheckBox("WiFi Hotspot Capability");
        
        HBox hbox1 = new HBox(label2,label6);
        HBox hbox2 = new HBox(label4, label7, label8);
        HBox hbox3 = new HBox(label5, label9);
        
        
        VBox vbox = new VBox(10,label1, radio1, radio2, radio3, hbox1, label3, 
                radio4, radio5, radio6, hbox2, checkbox1, checkbox2, hbox3);
        vbox.setAlignment(Pos.CENTER_LEFT);
        vbox.setPadding(new Insets(10));
        
        radio1.setOnAction(event->
        {
            label6.setText("45per month");
        });
        radio2.setOnAction(event->
        {
            label6.setText("65per month");
        });
        radio3.setOnAction(event->
        {
            label6.setText("99per month");
        });
        radio4.setOnAction(event->
        {
            label7.setText("299.95per month");
            label8.setText("+18.00per month");
        });
        radio5.setOnAction(event->
        {
            label7.setText("399.95per month");
            label8.setText("+24.00per month");
        });
        radio6.setOnAction(event->
        {
            label7.setText("499.95per month");
            label8.setText("+30.00per month");
        });
        
        checkbox1.setOnAction(event->
        {
            if(checkbox2.isSelected()){
                label9.setText("15per month");
            }
            else{
                label9.setText("5per month");
            }
        });
        checkbox2.setOnAction(event->
        {
            if(checkbox1.isSelected()){
                label9.setText("15per month");
            }
            else{
                label9.setText("10per month");
            }
        });
        
        Scene scene = new Scene(vbox, 400, 400);
        scene.getStylesheets().add("Smartphone.css");
        
        primaryStage.setTitle("Smartphone Packages");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
