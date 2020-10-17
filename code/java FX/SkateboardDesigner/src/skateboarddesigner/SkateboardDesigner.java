/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skateboarddesigner;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;


public class SkateboardDesigner extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Build the Decks ComboBox.
      ComboBox<String> deckComboBox = new ComboBox<>();
      deckComboBox.getItems().addAll("The Master Thrasher $60",
                                     "The Dictator        $45",
                                     "The Street King     $50");



// Label to prompt the user to select a deck
      Label deckPromptLabel = new Label("Select a Deck");
      VBox deckVBox = new VBox(10, deckPromptLabel, deckComboBox);
      
      // Build the Truck Assemblies ComboBox.
      ComboBox<String> truckComboBox = new ComboBox<>();
      truckComboBox.getItems().addAll("7.75 inch axle  $35",
                                      "8 inch axle     $40",
                                      "8.5 inch axle   $45");
      
      // Label to prompt the user to select a truck assembly
      Label truckPromptLabel = new Label("Select a Truck Assembly");
      VBox truckVBox = new VBox(10, truckPromptLabel, truckComboBox);
      
      // Build the Wheels ComboBox.
      ComboBox<String> wheelComboBox = new ComboBox<>();
      wheelComboBox.getItems().addAll("51mm  $20",
                                      "55mm  $22",
                                      "58mm  $24",
                                      "61mm  $28");

 // Label to prompt the user to select wheels
      Label wheelPromptLabel = new Label("Select Wheels");
      VBox wheelVBox = new VBox(10, wheelPromptLabel, wheelComboBox);
 // Build the Misc ListView.
      ListView<String> miscListView = new ListView<>();
      miscListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
      miscListView.getItems().addAll("Grip Tape        $10",
                                     "Bearings         $30",
                                     "Riser Pads       $2",
                                     "Nuts & Bolts Kit $3");
      
      // Label to prompt the user to select misc parts
      Label miscPromptLabel = new Label("Select Misc Parts");
      VBox miscVBox = new VBox(10, miscPromptLabel, miscListView);
      HBox partsHBox = new HBox(10, deckVBox, truckVBox, wheelVBox, miscVBox);
      
      // Create the output label for total cost.
      Label costDescriptor = new Label("Cost:");
      Label costOutputLabel = new Label("0.00");
      HBox costHBox = new HBox(10, costDescriptor, costOutputLabel);
      costHBox.setAlignment(Pos.CENTER);
      
      // Create the Calculate button.
      Button calcButton = new Button("Calculate Cost");

 
      // Register event handler for the button
      calcButton.setOnAction(event ->
      {
         double deckCharges = 0.0;
         double truckCharges = 0.0;
         double wheelCharges = 0.0;
         double miscCharges = 0.0;
         double totalCharges = 0.0;
  if (deckComboBox.getValue() != null)
         {
            String deck = deckComboBox.getValue();
            if (deck.equals("The Master Thrasher $60"))
               deckCharges = 60.0;
            else if (deck.equals("The Dictator        $45"))
               deckCharges = 45.0;
            else if (deck.equals("The Street King     $50"))
               deckCharges = 50.0;
            else
               deckCharges = 0.0;
         }
         
         if (truckComboBox.getValue() != null)
         {
            String truck = truckComboBox.getValue();
            if (truck.equals("7.75 inch axle  $35"))
               truckCharges = 35.0;
            else if (truck.equals("8 inch axle     $40"))
               truckCharges = 40.0;
            else if (truck.equals("8.5 inch axle   $45"))
               truckCharges = 45.0;
            else
               truckCharges = 0.0;
         }
         if (wheelComboBox.getValue() != null)
         {
            String wheel = wheelComboBox.getValue();
            if (wheel.equals("51mm  $20"))
               wheelCharges = 20.0;
            else if (wheel.equals("55mm  $22"))
               wheelCharges = 22.0;
            else if (wheel.equals("58mm  $24"))
               wheelCharges = 24.0;
            else if (wheel.equals("61mm  $28"))
               wheelCharges = 28.0;
            else
               wheelCharges = 0.0;
         }
         
         // Get the ObservableList of selected misc items.
         ObservableList<String> miscSelections = miscListView.getSelectionModel().getSelectedItems();
         for (String str : miscSelections)
         {
            if (str.equals("Grip Tape        $10"))
               miscCharges += 10.0;
            
            else if (str.equals("Bearings         $30"))
               miscCharges += 30.0;
               
            else if (str.equals("Riser Pads       $2"))
               miscCharges += 2.0;
               
            else if (str.equals("Nuts & Bolts Kit $3"))
               miscCharges += 3.0;
         }


         // Get the total charges
         totalCharges = deckCharges + truckCharges + wheelCharges + miscCharges;
         
         // Display the charges.
         costOutputLabel.setText(String.format("%,.2f", totalCharges));
      });
      
      // Put everything into a VBox
      VBox mainVBox = new VBox(10, partsHBox, costHBox, calcButton);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox);
      
      scene.getStylesheets().add("Skateboard.css");
      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
