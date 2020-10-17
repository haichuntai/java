/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardemo;

/**
 *
 * @author 19219
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int y, String m) {
        yearModel = y;
        make = m;
        speed = 0;
    }
    
    public void setYearModel(int y){
        yearModel = y;
    }
    public void setMake(String m){
        make = m;
    }
    public void setSpeed(int s){
        speed = s;
    }
    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }
    
    public  void accelerate(){
        speed += 5;
    }
    public void brake(){
        speed -=5;
    }
   
}
