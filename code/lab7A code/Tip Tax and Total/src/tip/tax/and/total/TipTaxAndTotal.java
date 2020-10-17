/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tip.tax.and.total;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TipTaxAndTotal extends Application {
    final double TIP = 0.18; 
    final double TAX = 0.07;
    
    private Label meal;
    private Label tip;
    private Label tax;
    private Label total;
    private Button button;
    private TextField sum; 
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        meal = new Label("Meal charge: ");
        tip = new Label("Tip: ");
        tax = new Label("Tax: ");
        total = new Label("Label: ");
        button = new Button("Calculate");
        sum = new TextField();
        button.setOnAction(new ButtonClickerHandler());
        
        HBox hbox = new HBox(meal, sum);
        hbox.setAlignment(Pos.CENTER);
        VBox but = new VBox(button);
        but.setAlignment(Pos.CENTER);
        VBox lab = new VBox(tip, tax, total);
        lab.setAlignment(Pos.CENTER_LEFT);
        VBox vbox = new VBox(hbox, lab, but);
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox,400,200);
        primaryStage.setTitle("TipTaxAndTotal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    class ButtonClickerHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            double cost = Double.parseDouble(sum.getText());
            tip.setText("Tip: " + String.format("%.2f", cost*TIP));
            tax.setText("Tax: " + String.format("%.2f", cost*TAX));
            total.setText("Total: " + String.format("%.2f", cost*(1+TIP+TAX)));

        }
    }
    
}
