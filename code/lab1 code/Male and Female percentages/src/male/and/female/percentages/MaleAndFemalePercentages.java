/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package male.and.female.percentages;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class MaleAndFemalePercentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of male students:");
        double male = keyboard.nextDouble();
        System.out.println("Enter the number of female students:");
        double female = keyboard.nextDouble();
        System.out.println("Male:" + male/(male + female)*100 + "%");
        System.out.println("Female:" + female/(male + female)*100 + "%");
    }
}
