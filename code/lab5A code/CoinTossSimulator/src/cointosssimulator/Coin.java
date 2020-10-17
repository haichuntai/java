/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointosssimulator;

import java.util.Random;

/**
 *
 * @author 19219
 */
class Coin {
    /**
      The constructor randomly sets the side of
      the coin that is facing up: heads or tails.
   */
    String sideUp;
   public Coin()
   {
      // Call the toss method to set the
      // initial state of sideUp.
      toss();
   }
   
   public void toss()
   {
      // Create a random object.
      Random rand = new Random();
      
      // Get a random value, 0 or 1.
      int value = rand.nextInt(2);
      
      // Set the value of sideUp.
      // 0 = "heads" or 1 = "tails"
      if (value == 0)
         sideUp = "heads";
      else
         sideUp = "tails";
   }
   public String getSideUp(){
       return sideUp;
   }

}
