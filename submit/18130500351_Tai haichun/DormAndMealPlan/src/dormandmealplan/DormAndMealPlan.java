/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormandmealplan;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
  Dorm and Meal Plan Calculator
*/

public class DormAndMealPlan extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Build the Dorm ComboBox.
      ComboBox<String> dormComboBox = new ComboBox<>();
      dormComboBox.getItems().addAll("Allen Hall", 
                                     "Pike Hall",
                                     "Farthing Hall",
                                     "University Suites");




// Label to prompt the user to select a dorm
      Label dormPromptLabel = new Label("Select a Dorm");
      VBox dormVBox = new VBox(10, dormPromptLabel, dormComboBox);
      

      // Build the Meal Plan ComboBox.
      ComboBox<String> mealComboBox = new ComboBox<>();
      mealComboBox.getItems().addAll("7 meals per week",
                                      "14 meals per week",
                                      "Unlimited meals per week");
      
      // Label to prompt the user to select a meal plan
      Label mealPromptLabel = new Label("Select a Meal Plan");
      VBox mealVBox = new VBox(10, mealPromptLabel, mealComboBox);
      HBox dormAndMealHBox = new HBox(10, dormVBox, mealVBox);
      

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
         double dormCharges = 0.0;
         double mealCharges = 0.0;
         double totalCharges = 0.0;
         
         if (dormComboBox.getValue() != null)
         {
            String dorm = dormComboBox.getValue();
            if (dorm.equals("Allen Hall"))
               dormCharges = 1800.0;
            else if (dorm.equals("Pike Hall"))
               dormCharges = 2200.0;
            else if (dorm.equals("Farthing Hall"))
               dormCharges = 2800.0;
            else if (dorm.equals("University Suites"))
               dormCharges = 3000.0;
            else
               dormCharges = 0.0;
         }
 if (mealComboBox.getValue() != null)
         {
            String meal = mealComboBox.getValue();
            if (meal.equals("7 meals per week"))
               mealCharges = 600;
            else if (meal.equals("14 meals per week"))
               mealCharges = 1100;
            else if (meal.equals("Unlimited meals per week"))
               mealCharges = 1800;
            else
               mealCharges = 0.0;
         }

         if (mealComboBox.getValue() != null)
         {
            String meal = mealComboBox.getValue();
            if (meal.equals("7 meals per week"))
               mealCharges = 600;
            else if (meal.equals("14 meals per week"))
               mealCharges = 1100;
            else if (meal.equals("Unlimited meals per week"))
               mealCharges = 1800;
            else
               mealCharges = 0.0;
         }
         // Get the total charges
         totalCharges = dormCharges + mealCharges;
         
         // Display the charges.
         costOutputLabel.setText(String.format("%,.2f", totalCharges));
      });
      
      // Put everything into a VBox
      VBox mainVBox = new VBox(10, dormAndMealHBox, costHBox, calcButton);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox);
      scene.getStylesheets().add("Conference.css");
      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}

