/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscoresdemo;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class TestScoresDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double test1, test2, test3;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter test score #1: ");
        test1 = keyboard.nextDouble();
        System.out.print("Enter test score #2: ");
        test2 = keyboard.nextDouble();
        System.out.print("Enter test score #3: ");
        test3 = keyboard.nextDouble();
        
        TestScores scores = new TestScores(test1, test2, test3);
        System.out.printf("The average test score is %.2f\n",
                        scores.getAverageScore());


    }
    
}
