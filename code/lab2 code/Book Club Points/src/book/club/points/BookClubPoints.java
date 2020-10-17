/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.club.points;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class BookClubPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many books have you purchased this month ?");
        int num = keyboard.nextInt();
        if(num==0)
            System.out.println("You've earned 0 points.");
        else if(num==1)
            System.out.println("You've earned 5 points.");
        else if(num==2)
            System.out.println("You've earned 15 points.");
        else if(num==3)
            System.out.println("You've earned 30 points.");
        else
            System.out.println("You've earned 60 points.");
    }
    
}
