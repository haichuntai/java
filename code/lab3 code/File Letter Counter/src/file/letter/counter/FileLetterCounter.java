/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.letter.counter;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class FileLetterCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String filename, input, str;
        str = "Hello World";
        int i, count=0;
        char ch;
        input = JOptionPane.showInputDialog("Enter the name of a file.");
        filename = input;
        PrintWriter outputFile = new PrintWriter(filename);
        input = JOptionPane.showInputDialog("Enter a letter contained "
                + "in the string");
        input = input.toUpperCase();
        ch = input.charAt(0);
        outputFile.println(str);
        outputFile.close();
        str = str.toUpperCase();
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == ch)
                count++;
        }
        JOptionPane.showMessageDialog(null, "The letter " + 
                ch + " appears " + count + " times in the life");
    }
    
}
