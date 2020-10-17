/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backward.string;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class BackwardString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter something: ");
        str = keyboard.nextLine();
        backward(str);
    }
    
    static void backward(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(str.length()-i-1));
        }
        System.out.println();
    }
}
