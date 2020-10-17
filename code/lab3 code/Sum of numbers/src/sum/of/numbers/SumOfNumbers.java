/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.numbers;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive non zero number: ");
        int count = keyboard.nextInt();
        int i,sum = 0;
        if(count == 0){
            System.out.println("Invalid. Enter "
                    + "a positive nonzero number: ");
            count = keyboard.nextInt();
        }
        if(count != 0){
            for(i=0;i<count;i++)
                sum+=i + 1; 
            System.out.println("The sum of all the integers from "
                    + "1 to " + count +" is " + sum);
        }
    }
    
}
