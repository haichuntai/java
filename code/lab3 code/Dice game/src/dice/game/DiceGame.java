/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.game;

import java.util.Random;

/**
 *
 * @author 19219
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random randomNumbers = new Random();
        int i,cup, man, computer=0, user=0, tie=0;
        for(i=0; i<10; i++){
            cup = randomNumbers.nextInt(6)+1;
            man = randomNumbers.nextInt(6)+1;
            if(cup > man)
                computer++;
            else if(cup < man)
                user++;
            else
                tie++;
        }
        System.out.println("Computer...." + computer);
        System.out.println("User........" + user);
        System.out.println("Ties........" + tie);
        if(computer > user)
            System.out.println("The computer is the grand winner");
        else if(computer < user)
            System.out.println("The user is the grand winner");
        else
            System.out.println("This is a tie");
    }
    
}
