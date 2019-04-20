/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;



public class keyCreation
{

    
     String Key0 = "";
     String Key1 = "";
     String Key2 = "";
     
    
     
	public String Keys(String[] args)
              
                
	{
            
            NibbleSub nibbleSub = new NibbleSub();
            addition Addition = new addition();
            
                
		Scanner sc = new Scanner(System.in);
                
                
                
		String W0 = sc.nextLine();    
		String W1 = sc.nextLine();
                String W2 = sc.nextLine();
                String W3 = sc.nextLine();

		String Key0 = W0+" "+W1+" "+W2+" "+W3;
                
                System.out.println(Key0);
  
               String w3Nib = NibbleSub.NibbleSub(W3);
            String w4Add = "0001";
            String w4Calc = addition.addition(W0, w3Nib);
            String W4 = addition.addition(w4Calc, w4Add);
            String W5 = addition.addition(W1, W4);
            String W6 = addition.addition(W2, W5);
            String W7 = addition.addition(W3, W6);
            
            String Key1 = W4+" "+W5+" "+W6+" "+W7;
            
            System.out.println(Key1);
            
             String w7Nib = NibbleSub.NibbleSub(W7);
           String w8Add = "0010";
           String w8Calc = addition.addition(W4, w7Nib);
           String W8 = addition.addition(w8Calc, w8Add);
           String W9 = addition.addition(W5, W8);
           String W10 = addition.addition(W6, W9);
           String W11 = addition.addition(W7, W10);
           
           String Key2 = W8+" "+W9+" "+W10+" "+W11;
           
           System.out.println(Key2);
           
           return Key2;
        
       }
        
        
     
}
