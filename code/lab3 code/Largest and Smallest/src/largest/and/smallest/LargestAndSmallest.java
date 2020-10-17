/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.and.smallest;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class LargestAndSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int min, max, num;
        System.out.println("Enter an integer, or -99 to qiut: ");
        num = keyboard.nextInt();
        min = max = num;
        if(num == -99)
            System.out.println("You did not enter any numers.");
        else{
            while(num != -99){
            if(min > num)
                min = num;
            if(max < num)
                max = num;
            System.out.println("Enter an integer, or -99 to qiut: ");
            num = keyboard.nextInt();
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        }
    }
    
}
