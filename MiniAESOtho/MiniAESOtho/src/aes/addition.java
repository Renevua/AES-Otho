package aes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan2001
 */
public class addition {
     public static String addition(String valueA,String valueB){
        
        //Creating Output Variable
        String outputString = "";
        
        //Loop Through String To Change Values
        for(int i = 0;i<4;i++){
            if (valueA.charAt(i) == valueB.charAt(i)){outputString += "0";}
            else{outputString += "1";}
        }
        
        //Testing Output
        //System.out.println(outputString);
        //Return Value
        return outputString;
    }
    
}
