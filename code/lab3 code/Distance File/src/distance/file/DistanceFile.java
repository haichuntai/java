/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance.file;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 19219
 */
public class DistanceFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int i;
        double speed, hour, distance;
        System.out.println("Enter the vehicle's speed: ");
        speed = keyboard.nextDouble();
        System.out.println("Enter the number of hours the vehicle was "
                + "in motion: ");
        hour = keyboard.nextDouble();
        PrintWriter outputFile = new PrintWriter("DistanceFile.txt");
        outputFile.println("Hour      Distance Traveled");
        outputFile.println("-----------------------------------------");
        for(i=1; i<=hour; i++){
            outputFile.println( i + "              " + i*speed );
        }
        outputFile.close();
    }
    
}
