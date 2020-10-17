/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retail.price.calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class RetailPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cost, per, sum;
        String input;
        input = JOptionPane.showInputDialog("Enter the item's wholesale cost.");
        cost = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the item's"
                + " markup persentage");
        per = Double.parseDouble(input);
        sum =  calculateRetail(cost, per);
        JOptionPane.showMessageDialog(null, "The item's retail is $" + sum);
    }
    public static double calculateRetail(double cost, double per)
    {
        return cost*(1+per/100);
    }
 
    
}
