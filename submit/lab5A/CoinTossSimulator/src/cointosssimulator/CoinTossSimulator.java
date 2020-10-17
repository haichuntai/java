/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointosssimulator;

/**
 *
 * @author 19219
 */
public class CoinTossSimulator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[])
   {
      // Constant for the number of tosses.
      final int NUM_TOSSES = 20;
      
      // Create an instance of the Coin class.
      Coin myCoin = new Coin();
      
      // Display the side facing up.
      System.out.println("The side initially facing up: " +
                         myCoin.getSideUp() );
      
      // Toss the coin repeatedly.
      System.out.println("Now I will toss the coin " +
                         NUM_TOSSES + " times.");
                         
      for (int i = 0; i < NUM_TOSSES; i++)
      {
         // Toss the coin.
         myCoin.toss();
         
         // Display the side facing up.
         System.out.println("Toss:   " + myCoin.getSideUp());
      }
   }
}
