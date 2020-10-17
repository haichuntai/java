/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

/**
 *
 * @author 19219
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create an array with 3 elements. 
        /*int[] numbers = { 1, 2, 3 };
        // Attempt to read beyond the bounds 
        // of the array. 
        for (int i = 0; i <= 3; i++) 
            System.out.println(numbers[i]);
        System.out.println("Hello World");*/
        try{
            int[] numbers = {1,2,3};
            for (int i = 0; i <= 3; i++) 
            System.out.println(numbers[i]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Hello World");
    }
    
}
