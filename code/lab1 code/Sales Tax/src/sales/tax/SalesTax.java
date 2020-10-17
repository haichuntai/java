/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.tax;
import java.util.Scanner;
/**
 *
 * @author 19219
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        sum = keyboard.nextInt();
        System.out.println("purchase amount: $" + sum);
        System.out.println("State tax: $" + sum*0.04);
        System.out.println("County tax: $" + sum*0.02);
        System.out.println("Total tax: $" + sum*0.06);
        System.out.println("Total cost: $" + sum*0.06 + sum);
    }
    
}
