/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter.counter;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class LetterCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,count = 0;
        String str, input, string;
        char ch;
        input = JOptionPane.showInputDialog("Enter a string");
        str = input.toUpperCase();
        string = input;
        input = JOptionPane.showInputDialog("Enter a letter contained"
                + "in the string");
        input = input.toUpperCase();
        ch = input.charAt(0);
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == ch)
               count++; 
        }
        JOptionPane.showMessageDialog(null, "The letter " +
                ch + " appears " + count + " times in the string: " + string);
    }
    
}
