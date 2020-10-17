/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larger.than.n;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class LargerThanN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int number; 
        System.out.print("Enter the number: ");
        number = keyboard.nextInt();
        int[] numbers = {1, 23, 43, 54, 4, 34, 2, 5, 7, 9};
        System.out.println("The number greater: ");
        displayGreaterThan(numbers, number);
    }
    
    private static void displayGreaterThan(int[] array, int n)
    {
        for(int i=0; i<array.length; i++){
            if(array[i] > n){
                System.out.println(array[i]);
            }
        }
    }
    
}
