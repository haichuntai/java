/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.simulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DiceSimulator extends Application {
    private Button button;
    Image die1;
    Image die2;
    Image die3;
    Image die4;
    Image die5;
    Image die6;
        
    ImageView show1;
    ImageView show2;
    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) {
        die1 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die1.png");
        die2 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die2.png");
        die3 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die3.png");
        die4 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die4.png");
        die5 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die5.png");
        die6 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java\\lab"
            + "\\Lab7\\Images\\Excercise3\\Die6.png");
        show1 = new ImageView(die1);
        show2 = new ImageView(die1);
        
        button = new Button("Toss");
        button.setOnAction(new ButtonClickerHandler());
        HBox hbox = new HBox(show1, show2);
        hbox.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(hbox, button);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox,300,300);
        


        
        primaryStage.setTitle("DiceSimulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

class ButtonClickerHandler implements EventHandler<ActionEvent>
{
    @Override
    public void handle(ActionEvent event)
    {
        int flag = (int)(Math.random()*6+1);
        switch(flag)
        {
            case 1: show1.setImage(die1);break;
            case 2: show1.setImage(die2);break;
            case 3: show1.setImage(die3);break;
            case 4: show1.setImage(die4);break;
            case 5: show1.setImage(die5);break;
            case 6: show1.setImage(die6);break;
        }
        flag = (int)(Math.random()*6+1);
        switch(flag)
        {
            case 1: show2.setImage(die1);break;
            case 2: show2.setImage(die2);break;
            case 3: show2.setImage(die3);break;
            case 4: show2.setImage(die4);break;
            case 5: show2.setImage(die5);break;
            case 6: show2.setImage(die6);break;
        }
                
    }
}
    
    
    
    
}
