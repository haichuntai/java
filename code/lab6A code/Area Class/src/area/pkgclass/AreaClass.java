/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.pkgclass;

/**
 *
 * @author 19219
 */

class Areac{
    double r , h;
    int length, width;
    public void Areaclass(){
        r = h = 0.0;
        length = width = 0;
    }
    public double Area(double r){
        this.r = r;
        return r*r*Math.PI;
    }
    public double Area(int length, int width){
        this.length = length;
        this.width = width;
        return length*width/1.0;
    }
    public double Area(double r, double h){
        this.h = h;
        return Math.PI*r*r*h;
    }
}


public class AreaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r = 20.0 , h = 15.0;
        int length = 10, width = 20;
        Areac area = new Areac();
        System.out.println("The area of a circle with a radius of " + r 
                + " is " + String.format("%.2f", area.Area(r)));
        System.out.println("The area of a rectangle with a length of " + length 
                + " and a width of " + width + " is " 
                + String.format("%.2f", area.Area(length, width)));
        System.out.println("The area of a cylinders with a radius of " + r/2 
                + " and a height of " + h + " is " 
                + String.format("%.2f", area.Area(r/2,h)));
    }
    
}
