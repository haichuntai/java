/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.manipulator;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author 19219
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String city;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of your favourate city:");
        city = keyboard.nextLine();
        int length = city.length();
        System.out.println("Number of characters" + length);
        System.out.println(toUpperCase(city));
        System.out.println(toLowerCase(city));
        System.out.println(city.charAt(0));
        
        
    }

    
}
