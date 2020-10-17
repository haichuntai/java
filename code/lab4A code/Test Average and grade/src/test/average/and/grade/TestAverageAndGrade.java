/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.average.and.grade;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class TestAverageAndGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int first, second, third, fourth, fifth;
        System.out.println("Enter the first test score: ");
        first = keyboard.nextInt();
        System.out.println("Enter the second test score: ");
        second = keyboard.nextInt();
        System.out.println("Enter the third test score: ");
        third = keyboard.nextInt();
        System.out.println("Enter the fourth test score: ");
        fourth = keyboard.nextInt();
        System.out.println("Enter the fifth test score: ");
        fifth = keyboard.nextInt();
        System.out.println("Here are the grades and the average:");
        System.out.println("Test 1:" + determineGrade(first));
        System.out.println("Test 2:" + determineGrade(second));
        System.out.println("Test 3:" + determineGrade(third));
        System.out.println("Test 4:" + determineGrade(fourth));
        System.out.println("Test 5:" + determineGrade(fifth));
        double ave = calcAverage(first, second, third, fourth, fifth);
        System.out.println("Average score: " + ave);
        System.out.println("Average Letter Grade: " + determineGrade((int)ave));
        
    }
    public static double calcAverage(int S1,int S2,int S3,int S4,int S5)
    {
        return (S1+S2+S3+S4+S5)/5.0;
    }
    public static char determineGrade(int score)
    {
        if(score >= 90)
            return 'A';
        else if(score >= 80)
            return 'B';
        else if(score >= 70)
            return 'C';
        else if(score >= 60)
            return 'D';
        else
            return 'F';
    }
}
