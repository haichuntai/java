/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latin.translator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author 19219
 */
public class LatinTranslator extends Application {
    private Label label;
    //private Button button1;
    //private Button button2;
    //private Button button3;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        label = new Label("Left");
        Button button1 = new Button("Sinister");
        Button button2 = new Button("Dexter");
        Button button3 = new Button("Medium");
        
        button1.setOnAction(new ButtonClickerHandler1());
        button2.setOnAction(new ButtonClickerHandler2());
        button3.setOnAction(new ButtonClickerHandler3());
        
        VBox vbox = new VBox(10, button1, button2, button3, label);
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox,300,200);
        
        primaryStage.setTitle("LatinTranslator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    
    class ButtonClickerHandler1 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            label.setText("Left");
        }
    }
    
    class ButtonClickerHandler2 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            label.setText("Right");
        }
    }
    
    class ButtonClickerHandler3 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            label.setText("Center");
        }
    }
    
}
