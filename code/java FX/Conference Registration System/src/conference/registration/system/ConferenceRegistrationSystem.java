/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conference.registration.system;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 19219
 */
public class ConferenceRegistrationSystem extends Application {
    private double sum = 0;
    private RadioButton radio1;
    private RadioButton radio2;
    private ToggleGroup radiogroup;
    private Label label;
    private Label label1;
    private Label label2;
    private CheckBox checkbox; 
    private ListView<String> listview;
    private Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        radio1 = new RadioButton("General Registration");
        radio2 = new RadioButton("Student Registration");
        radiogroup = new ToggleGroup();
        label = new Label("Select an Option Workshop");
        label1 = new Label("Cost: ");
        label2 = new Label("0.0");
        checkbox = new CheckBox("Opening Night Dinner.");
        listview = new ListView<>();
        radio1.setToggleGroup(radiogroup);
        radio2.setToggleGroup(radiogroup);
        radio1.setSelected(true);
        button = new Button("Calculate Cost");
        
        button.setOnAction(new buttonhandler());
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        
        listview.getItems().addAll("introduction to E-commence",
                "The Future of the Web", "Advanced Java Programming", 
                "NetWorkSecurity");
        listview.setPrefSize(400, 100);
        
        HBox hbox = new HBox(checkbox);
        HBox hbox1 = new HBox(label1,label2);
        HBox hbox2 = new HBox(button);
        
        hbox.setAlignment(Pos.CENTER);
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(10, radio1, radio2, hbox, label, 
                listview, hbox1, hbox2);
        vbox.setAlignment(Pos.CENTER_LEFT);
        
        vbox.setPadding(new Insets(10));
        
        Scene scene = new Scene(vbox, 400, 400);
        scene.getStylesheets().add("Conference.css");
        primaryStage.setTitle("Conference Registration System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    class buttonhandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            sum = 0;
            if(radio1.isSelected()){
                sum += 895;
            }
            else{
                sum += 495;
            }
            
            ObservableList<String> miscSelections = listview.getSelectionModel().getSelectedItems();
            for (String str : miscSelections)
            {
                if (str.equals("introduction to E-commence"))
                    sum += 295;
            
                else if (str.equals("The Future of the Web"))
                    sum += 295;
               
                else if (str.equals("Advanced Java Programming"))
                    sum += 395;
               
                else if (str.equals("NetWorkSecurity"))
                    sum += 395;
            }
            
            if(checkbox.isSelected()){
                sum += 30;
            }
            
            label2.setText(String.format("%.2f", sum));
            
        }
        
        
    }
    
}
