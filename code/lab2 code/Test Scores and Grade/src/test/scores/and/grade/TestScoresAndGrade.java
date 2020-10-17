/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.scores.and.grade;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class TestScoresAndGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter test score #1");
        int s1 = keyboard.nextInt();
        System.out.println("Enter test score #2");
        int s2 = keyboard.nextInt();
        System.out.println("Enter test score #3");
        int s3 = keyboard.nextInt();
        int ave = (s1+s2+s3)/3;
        System.out.println("Aaverage score: " + ave);
        if(ave>=90)
            System.out.println("Letter grade: A");
        else if(ave>=80)
            System.out.println("Letter grade: B");
        else if(ave>=70)
            System.out.println("Letter grade: C");
        else if(ave>=60)
            System.out.println("Letter grade: D");
        else
            System.out.println("Letter grade: F");
    }
}
