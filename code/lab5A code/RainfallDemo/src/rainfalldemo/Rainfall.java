/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainfalldemo;

/**
 *
 * @author 19219
 */
public class Rainfall {
    
    private double[] rain; // Array to hold rainfall data
      
    public Rainfall(double r[])
    {
      // Create a new array.
      rain = new double[r.length];
      
      // Copy the argument's elements to the
      // new array.
      for (int i = 0; i < r.length; i++)
         rain[i] = r[i];
    }
    
    public double getTotalRainFall(){
        double sum = 0;
        for(int i=0; i<rain.length; i++){
            sum += rain[i];
        }
        return sum;
    }
    
    public double getAverageRainFall(){
        double sum = 0;
        for(int i=0; i<rain.length; i++){
            sum += rain[i];
        }
        return sum/rain.length;
    }

    public int getHighestMonth(){
        double count = 0;
        int high = 0;
        for(int i=0; i<rain.length; i++){
            if(rain[i] > count)
            {
                count = rain[i];
                high = i;
            }
        }
        return high;
    }
    
    public int getLowestMonth(){
        double count = 9999;
        int low =0;
        for(int i=0; i<rain.length; i++){
            if(rain[i] < count)
            {
                count = rain[i];
                low = i;
            }
        }
        return low;
    }
    
    public double getRainAt(int e){
        return rain[e];
    }
    
}
