/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipping.charges;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class ShippingCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your Weight of Package: ");
        float weight = keyboard.nextFloat();
        System.out.println("Enter your Miles of Package: ");
        int miles = keyboard.nextInt();
        if(weight<=2)
            JOptionPane.showMessageDialog(null, "The shipping charges are $"
                    + ((miles-1)/500+1)*1.10);
        else if(weight <=6)
            JOptionPane.showMessageDialog(null, "The shipping charges are $"
                    + ((miles-1)/500+1)*2.20);
        else if(weight <=10)
            JOptionPane.showMessageDialog(null, "The shipping charges are $"
                    + ((miles-1)/500+1)*3.70);
        else
            JOptionPane.showMessageDialog(null, "The shipping charges are $"
                    + ((miles-1)/500+1)*3.80);
        System.exit(0);
    }
}
