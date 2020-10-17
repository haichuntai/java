/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle.area.complete.the.program;

import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class RectangleAreaCompleteTheProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length = getLength();
        double wide = getWidth();
        double area = getArea(length, wide);
        displayData(length, wide, area);
    }
    public static double getLength()
    {
        String input;
        input = JOptionPane.showInputDialog("Enter the rectangle's length.");
        double length = Double.parseDouble(input);
        return length;
    }
    public static double getWidth()
    {
        String input;
        input = JOptionPane.showInputDialog("Enther the rectangle's width");
        double wide = Double.parseDouble(input);
        return wide;
    }
    public static double getArea(double length, double wide)
    {
        return length*wide;
    }
    public static void displayData(double length,double wide,double area)
    {
        JOptionPane.showMessageDialog(null, "Length = " + length
                + "\nWidth = " + wide + "\nArea = " + area);
    }
}
