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
import java.util.*;
import java.io.*;



public class keyCreation
{

    
     String Key0 = "";
     String Key1 = "";
     String Key2 = "";
     
     String W0 = null;
     String W1 = null;
     String W2 = null;
     String W3 = null;
     String W4 = null;
     String W5 = null;
     String W6 = null;
     String W7 = null;
     String W8 = null;
     String W9 = null;
     String W10 = null;
     String W11 = null;
     
    
     
	public String Keys(String[] args)
              
                
	{
            
            NibbleSub nibbleSub = new NibbleSub();
            addition Addition = new addition();
            
                
                Scanner input = new Scanner(System.in);    
		
                String[] Key0 = new String[4];
                
                for (int i = 0; i < 0;){

            Key0[i] = input.nextLine();


        }

		W0 = Key0[0];
                W1 = Key0[1];
                W2 = Key0[2];
                W3 = Key0[3];
                
                
                //Test Output System.out.println(Key0);
  
               String w3Nib = NibbleSub.NibbleSub(W3, true);
            String w4Add = "0001";
            String w4Calc = addition.addition(W0, w3Nib);
            String W4 = addition.addition(w4Calc, w4Add);
            String W5 = addition.addition(W1, W4);
            String W6 = addition.addition(W2, W5);
            String W7 = addition.addition(W3, W6);
            
            String[] Key1 = new String[4];
            
                W4 = Key1[0];
                W5 = Key1[1];
                W6 = Key1[2];
                W7 = Key1[3];
            
            System.out.println(Key1);
            
             String w7Nib = NibbleSub.NibbleSub(W7, true);
           String w8Add = "0010";
           String w8Calc = addition.addition(W4, w7Nib); 
           String W8 = addition.addition(w8Calc, w8Add);
           String W9 = addition.addition(W5, W8);
           String W10 = addition.addition(W6, W9);
           String W11 = addition.addition(W7, W10);
           
          String[] Key2 = new String[4];
            
            W8 = Key2[0];
            W9 = Key2[1];
            W10 = Key2[2];
            W11= Key2[3];
           
           System.out.println(Key2);
           
           return Key2.toString();
           
           
       }
        
        
     
}
