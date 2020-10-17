/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showchar.method;

import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class ShowCharMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int pos;
        String str;
        System.out.println("Enter the string and position: ");
        str = keyboard.nextLine();
        pos = keyboard.nextInt();
        showChar(str,pos);
    }
    public static void showChar(String str, int pos)
    {
        System.out.println(str.charAt(pos));
    }
}
