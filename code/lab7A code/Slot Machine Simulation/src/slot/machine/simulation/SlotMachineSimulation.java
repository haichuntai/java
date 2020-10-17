/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.machine.simulation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 19219
 */
public class SlotMachineSimulation extends Application {
    Label amount;
    Label won;
    Label total;
    Label words;
    Button button;
    TextField money;
    Image sign0;
    Image sign1;
    Image sign2;
    Image sign3;
    Image sign4;
    Image sign5;
    Image sign6;
    Image sign7;
    Image sign8;
    Image sign9;
    Image sign10;
    ImageView show1;
    ImageView show2;
    ImageView show3;
    double win = 0,sum = 0;
    
    @Override
    public void start(Stage primaryStage) {
        amount = new Label("Amount Inserted:$ ");
        won = new Label("Amount Won This Spin:$ " + String.format("%.2f", win));
        total = new Label("Total Amount Won:$ " + String.format("%.2f", sum));
        words = new Label("Insert an amount to paly");
        sign0 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\BlankFruit.png");
        sign1 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Apple.png");
        sign2 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Banana.png");
        sign3 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Cherries.png");
        sign4 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Grapes.png");
        sign5 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Lemon.png");
        sign6 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Lime.png");
        sign7 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Orange.png");
        sign8 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Pear.png");
        sign9 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Strawberry.png");
        sign10 = new Image("file:C:\\Users\\19219\\Desktop\\homework\\java"
                + "\\lab\\Lab7\\Images\\Excercise4\\Watermelon.png");
        show1 = new ImageView(sign0);
        show2 = new ImageView(sign0);
        show3 = new ImageView(sign0);
        money = new TextField();
        button = new Button("Spin");
        button.setOnAction(new ButtonClickerHandler());
        HBox hbox1 = new HBox(show1, show2, show3);
        hbox1.setAlignment(Pos.CENTER);
        HBox hbox2 = new HBox(amount, money);
        hbox2.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(hbox1, hbox2, won, total, button, words);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(5));
        Scene scene = new Scene(vbox,500,300);
        
        primaryStage.setTitle("SlotMachineSimulation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
class ButtonClickerHandler implements EventHandler<ActionEvent>
{
    @Override
    public void handle(ActionEvent event)
    {
        int flag1 = (int)(Math.random()*10+1);
        int flag2 = (int)(Math.random()*10+1);
        int flag3 = (int)(Math.random()*10+1);
        switch(flag1)
        {
            case 1: show1.setImage(sign1);break;
            case 2: show1.setImage(sign2);break;
            case 3: show1.setImage(sign3);break;
            case 4: show1.setImage(sign4);break;
            case 5: show1.setImage(sign5);break;
            case 6: show1.setImage(sign6);break;
            case 7: show1.setImage(sign7);break;
            case 8: show1.setImage(sign8);break;
            case 9: show1.setImage(sign9);break;
            case 10: show1.setImage(sign10);break;
        }
        switch(flag2)
        {
            case 1: show2.setImage(sign1);break;
            case 2: show2.setImage(sign2);break;
            case 3: show2.setImage(sign3);break;
            case 4: show2.setImage(sign4);break;
            case 5: show2.setImage(sign5);break;
            case 6: show2.setImage(sign6);break;
            case 7: show2.setImage(sign7);break;
            case 8: show2.setImage(sign8);break;
            case 9: show2.setImage(sign9);break;
            case 10: show2.setImage(sign10);break;
        }
        switch(flag3)
        {
            case 1: show3.setImage(sign1);break;
            case 2: show3.setImage(sign2);break;
            case 3: show3.setImage(sign3);break;
            case 4: show3.setImage(sign4);break;
            case 5: show3.setImage(sign5);break;
            case 6: show3.setImage(sign6);break;
            case 7: show3.setImage(sign7);break;
            case 8: show3.setImage(sign8);break;
            case 9: show3.setImage(sign9);break;
            case 10: show3.setImage(sign10);break;
        }
        double temp = Double.parseDouble(money.getText());
        
        if(flag1 != flag2 && flag2 != flag3)
        {
            win = 0;
            words.setText("No luck. Play again");
            sum -= temp;
            won.setText("Amount Won This Spin:$ " + String.format("%.2f", win));
            total.setText("Total Amount Won:$ " + String.format("%.2f", sum));
        }
        else if(flag1 == flag2 && flag2 == flag3)
        {
            win = temp*3;
            words.setText("AWOSOME! TRIBLE WIN *3!!");
            sum += temp*2;
            won.setText("Amount Won This Spin:$ " + String.format("%.2f", win));
            total.setText("Total Amount Won:$ " + String.format("%.2f", sum));
        }
        else
        {
            win = temp*2;
            words.setText("Sweet! DOUBLE WIN *2!!");
            sum += temp;
            won.setText("Amount Won This Spin:$ " + String.format("%.2f", win));
            total.setText("Total Amount Won:$ " + String.format("%.2f", sum));
        }
        
    }
}
    
}
