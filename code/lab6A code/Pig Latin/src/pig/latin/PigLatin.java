/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pig.latin;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string and I will convert it to Pig Latin");
        str = keyboard.nextLine();
        String[] tokens = str.split(" ");
        StringBuilder string = new StringBuilder();
        for(String s:tokens){
            StringBuilder temp = new StringBuilder(s);
            temp.append(temp.charAt(0));
            temp.deleteCharAt(0);
            temp.append("AY");
            string.append(temp);
            string.append(" ");
        }
        System.out.println(string);
        
    }
    
}
