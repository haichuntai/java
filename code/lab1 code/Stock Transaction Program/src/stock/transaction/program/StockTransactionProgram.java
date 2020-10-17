/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.transaction.program;

/**
 *
 * @author 19219
 */
public class StockTransactionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Joe paid $" + 32.87*1000 + " for the stock");
        System.out.println("Joe paid his broker a commission of $"
                + 32.87*1000*0.02 + "on the purchase");
        System.out.println("So, Joe paid a total of $" + 32.87*1000*1.02);
        System.out.println();
        System.out.println("Joe sold the stock for $" + 33.92*1000);
        System.out.println("Joe paid his broker a commission of $" + 
                33.92*1000*0.02 + " on the sale");
        System.out.println("So, Joe paid a total of $" + 33.92*1000*0.98);
        System.out.println();
        System.out.println("Joe's profit or loss: $" +
                (33.92*1000*0.98-32.87*1000*1.02));
    }
    
}
