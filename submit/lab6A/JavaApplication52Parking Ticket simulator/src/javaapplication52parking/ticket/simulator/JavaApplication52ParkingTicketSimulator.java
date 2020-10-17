/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52parking.ticket.simulator;

/**
 *
 * @author 19219
 */
class ParkedCar{
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutes;
    
    public ParkedCar(String mk, String mod, String col, String lic, int min){
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutes = min;
    }
    
    public void setMake(String mk){
        make = mk;
    }
    public void setModel(String mod){
        model = mod;
    }
    public void setLicenseNumber(String lic){
        licenseNumber = lic;
    }
    public void setColor(String col){
        color = col;
    }
    public void setMinutes(int min){
        minutes = min;
    }
    
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getLicenseNumber(){
        return licenseNumber;
    }
    public String getColor(){
        return color;
    }
    public int getMinutes(){
        return minutes;
    }
    
    public String toString(){
        String str = "Car Data:" +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nLicence Number: " + licenseNumber +
                "\nMinutes: " + minutes + "\n";
        return str;
    }
}

class ParkingMeter{
    private int minutesPurchased;
    
    public ParkingMeter(int m){
        minutesPurchased = m;
    }
    
    public void  setMinutesPurchased(int m){
        minutesPurchased = m;
    }
    
    public int getMinutesPurchased(){
        return minutesPurchased;
    }
}

class ParkingTicket{
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;
    public double BASE_FINE = 25.0;
    public double HOURLY_FINE = 10.0;
    
    public void ParkingTicket(ParkedCar acar, PoliceOfficer anofficer, int min){
        car = acar;
        officer = anofficer;
        minutes = min;
    }
    
    public void getParkedCar(ParkedCar acar){
        car = acar;
    }
    public void getPoliceOfficer(PoliceOfficer anofficer){
        officer = anofficer;
    }
    public void getminutes(int min){
        minutes = min;
    }
    
    private void calculateFine(){
        fine = BASE_FINE + (car.getMinutes()/60)*HOURLY_FINE;
    }
    
    public void setMinutes(int min){
        minutes = min;
    }
    public int getMinutes(){
        return minutes;
    }
    public double getfine(){
        calculateFine();
        return fine;
    }
}

class PoliceOfficer{
    private String name;
    private String badgeNumber;
    
    public PoliceOfficer(String n,String bn){
        name = n;
        badgeNumber = bn;
    }
    
    public ParkingTicket patrol(ParkedCar acar, ParkingMeter meter){
        
        ParkingTicket pt = new ParkingTicket();
        pt.setMinutes(acar.getMinutes() - meter.getMinutesPurchased());
   //     pt.calculateFine();
        
        return pt;
    }
    
    public String toString(){
        String str = "Officer Data:" +
                "\nName: " + name +
                "\nBadgeNumber: " + badgeNumber + "\n";
        return str;
    }
}


public class JavaApplication52ParkingTicketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParkedCar car = new ParkedCar("Volkseagen","1972","Red","147RHZM",125);
        PoliceOfficer officer = new PoliceOfficer("Joe Frifay", "4788");
        String str1 = car.toString();
        String str2 = officer.toString();
        System.out.println(str1);
        System.out.println(str2);
        
        ParkingMeter meter = new ParkingMeter(60);
        ParkingTicket pt = officer.patrol(car, meter);
        pt.setMinutes(car.getMinutes()-meter.getMinutesPurchased());
        System.out.println("Minutes Illegally Parked: " + pt.getMinutes());
//        pt.calculateFine();
        pt.getParkedCar(car);
        pt.getPoliceOfficer(officer);
        System.out.println("Fine: " + pt.getfine());
    }
    
}
