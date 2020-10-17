/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package body.mass.index;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will calculate your BIM");
        System.out.println("Enter your weight, in pounds:");
        double weight = keyboard.nextDouble();
        System.out.println("Enter your height, in inches");
        double height = keyboard.nextDouble();
        double BIM = weight * 703 / (height * height);
        System.out.println("your body index (IBM) is " + BIM);
        if(BIM <18.5)
            System.out.println("you are underweight");
        else if(BIM > 22.5)
            System.out.println("you are overweight");
        else
            System.out.println("you are optimal");
    }
    
}
