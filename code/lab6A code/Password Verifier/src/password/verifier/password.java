/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.verifier;

/**
 *
 * @author 19219
 */
public class password {
    static String str;
    static private int MIN_PASSWORD_LENGTH = 6;
    public password() {
        str = null;
    }
    public password(String s) {
        str = s;
    }
    
    public static void getString(String s){
        str = s;
    }
    
    private static boolean hasUpperCase(){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                count ++;
        }
        if(count > 0)
            return true;
        else
            return false;
    }
    
    private static boolean hasLowerCase(){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                count ++;
        }
        if(count > 0)
            return true;
        else
            return false;
    }
    
    private static boolean hasDigit(){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                count ++;
        }
        if(count > 0)
            return true;
        else
            return false;
    }
    
    public static boolean isValid(){
        if(str.length() < MIN_PASSWORD_LENGTH)
            return false;
        else if(!hasUpperCase() || !hasLowerCase() || !hasDigit() ){
            return false;
        }
        return true;
    }
}
