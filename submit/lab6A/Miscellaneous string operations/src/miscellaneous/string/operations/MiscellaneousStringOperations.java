/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscellaneous.string.operations;

import java.util.Arrays;

/**
 *
 * @author 19219
 */
public class MiscellaneousStringOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "the dog jumpd over the fence";
        String str2 = "the";
        String str3 = "that";
        char[] ch = {'t','h','e','r','e',' ','i','s',' ','a',' ','d','o','g'};
        String str4;
        int count = WordCount(str1);
        str4 = arrayToString(ch);
        char c = mostfrequent(str1);
        String str5 = replaceSubstring(str1, str2, str3);
        System.out.println("Number of words in the \"" + str1 + "\" is " + count);
        System.out.println("Most frequently occuring character: " + c);
        System.out.println(str5);
        System.out.println(str4);
        System.out.println();
        
    }
    
    public static int WordCount(String str){
        String[] tokens = str.split(" ");
        int i = 0;
        for(String s:tokens){
            i++;
        }
        return i;
    }
    
    public static String arrayToString(char[] ch){
        String str = String.valueOf(ch);
        return str; 
    }
    
    public static char mostfrequent(String str){
        char[] ch1 = str.toCharArray();
        char[] ch2 = new char[]{'a','b','c','d','e','f','g','h','i',
            'g','k','l','m','n','o','p','q','r','s','t','u','v',
            'w','x','y','z'
        };
        int[] count = new int[26]; 
        int i,j;
        for(i=0; i<26; i++){
            count[i] = 0;
        }
        for(i=0; i<str.length(); i++){
            for(j=0; j<26; j++){
               if(ch1[i] == ch2[j]){
                   count[j]++;
                   break;
               } 
            }
        }
        int max = 0, flag=0;
        for(i=0; i<26; i++){
            if(count[i] > max){
                max = count[i];
                flag = i;
            }
        }
        return ch2[flag];
    }
    
    public static String replaceSubstring(String str1, String str2, String str3){
        String[] tokens = str1.split(" ");
        StringBuilder str4 = new StringBuilder();
        int count = 0;
        for(String s:tokens){
            if(s.equals(str2)){
                str4.append(str3);
                str4.append(" ");
            }
            else{
                str4.append(s);
                str4.append(" ");
            }
        }
        String str = new String(str4);
        return str;
    }
}
