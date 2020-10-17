/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.counter;

import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class WordCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = null;
        counter(str);
        System.exit(0);
    }
    static void counter(String str){
        str = JOptionPane.showInputDialog("Enter a string");
        String[] tokens = str.split(" ");
        int i = 0;
        for(String s : tokens){
            i++;
        }
        JOptionPane.showMessageDialog(null, "This string has " + i
                + " word(s) in it");
    }
    
}
