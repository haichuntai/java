/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentence.capitalizer;

import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class SentenceCapitalizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder str;
        str =  sentance();
        JOptionPane.showMessageDialog(null, str);
        System.exit(0);
    }
    static StringBuilder sentance(){
        StringBuilder str = new StringBuilder();
        String input;
        input = JOptionPane.showInputDialog("Enter a string");
        str.append(input);
        str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        int i;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                i += 2;
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return str;
    }
    
}
