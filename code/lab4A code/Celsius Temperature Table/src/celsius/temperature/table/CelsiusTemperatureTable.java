/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius.temperature.table;

/**
 *
 * @author 19219
 */
public class CelsiusTemperatureTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celsius();
    }
    public static void Celsius()
    {
        int F;
        double C;
        System.out.println("Fahrenheit             Celsius");
        System.out.println("================================");
        for(F=0; F<=20; F++)
        {
            C = (F - 32)*5.0/9;
            System.out.println(F + "\t\t\t" + String.format("%.2f", C));
        }
    }
}
