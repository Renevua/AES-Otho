

import java.util.*;

public class Mixed {
    
    
	public static void main(String[] args) {
        
		//Createing a test String array
        String[] teststring = {"1110","0110","1011","0101"};
        
		shiftRows(teststring);
        //mixColoums(teststring);
    }
    
	//ShiftRows swaps the 3rd and 4th list value
    public static String[] shiftRows(String[] inputArray){
        
        String[] outputArray = new String[4];
        
        outputArray[0] = inputArray[0];
        outputArray[1] = inputArray[1];
        outputArray[2] = inputArray[3];
        outputArray[3] = inputArray[2];
        
		//Testing output
        //System.out.println(outputArray[0]);
        //System.out.println(outputArray[1]);
        //System.out.println(outputArray[2]);
        //System.out.println(outputArray[3]);
        
        return outputArray;
    }
    
	//Takes a binary input and changes it to a decimal
    public static int binaryToDecimal(String binaryInput){
		
		//Defining the output
        int outputDecimal = 0;
        
		//loops for each bit in the input
        for(int i = 0; i < 4; i++){
			
			//Checks each character in the String and depending on thair position adds thair value to the output
            if( binaryInput.charAt(i) == '1'){
                switch(i){
                    case 0 : outputDecimal += 8; break;
                    case 1 : outputDecimal += 4; break;
                    case 2 : outputDecimal += 2; break;
                    case 3 : outputDecimal += 1; break;
                    default: System.out.println("Binary to Decimal error");
                }
            }
        }
		
        //test output
        //System.out.println(outputDecimal);
        return outputDecimal;
    }
    
    //Multiplication of two binary values 
    public static String multiplication(String nibble1, String nibble2){
        
		//Defining and empty output string
        String outputString = "";
        
		//Converting the binary inputs into hexadecimal and setting them equal to a new vairable
        String hexadecimal1 = Integer.toHexString(binaryToDecimal(nibble1));
        String hexadecimal2 = Integer.toHexString(binaryToDecimal(nibble2));
        
        //test the conversion
        //System.out.println(hexadecimal1);
        
		//Defining the position of the hex's (0-15) 
        int tablePlaceX = hexadecimalToListPosition(hexadecimal1);
        int tablePlaceY = hexadecimalToListPosition(hexadecimal2);
        
        //Defining the multiplication lookup table
        String[][] hexadecimalMultiplicationTable = {
                {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
                {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"},
                {"0","2","4","6","8","a","c","e","3","1","7","5","b","9","f","d"},
                {"0","3","6","5","c","f","a","9","b","8","d","e","7","4","1","2"},
                {"0","4","8","c","3","7","b","f","6","2","e","a","5","1","d","9"},
                {"0","5","a","f","7","2","d","8","e","b","4","1","9","c","3","6"},
                {"0","6","c","a","b","d","7","1","5","3","9","f","e","8","2","4"},
                {"0","7","e","9","f","8","1","6","d","a","3","4","2","5","c","8"},
                {"0","8","3","b","6","e","5","d","c","4","f","7","a","2","9","1"},
                {"0","9","1","8","2","b","3","a","4","d","5","c","6","f","7","e"},
                {"0","a","7","d","e","4","9","3","f","5","8","2","1","b","6","c"},
                {"0","b","5","e","a","1","f","4","7","c","2","9","d","6","8","3"},
                {"0","c","b","7","5","9","e","2","a","6","1","d","f","3","4","8"},
                {"0","d","9","4","1","c","8","5","2","f","b","6","3","e","a","7"},
                {"0","e","f","1","d","3","2","c","9","7","6","8","4","a","b","5"},
                {"0","f","d","2","9","6","4","8","1","e","c","3","8","7","5","a"}
                };
        
        //looking up the output using the above tabale
        String hexOutput = hexadecimalMultiplicationTable[tablePlaceX][tablePlaceY];
        
        //testing hex lookup output
        //System.out.println(hexOutput);
        
        //conversion from Hex to int
        int decimalResult  = Integer.parseInt(hexOutput ,16);
        
		//Converts from int to binary string and adds leading 0's
        outputString = String.format("%4s", Integer.toBinaryString(decimalResult)).replace(' ', '0');

        //testing multiplication binary output
        //System.out.println(outputString);
        
        return outputString;
    }
    
	//Converts a hexValue into a number from 0-15 for the table loopup
    public static int hexadecimalToListPosition(String hexValue){
        
		//defining an output int 
        int outputPosition = 0;
        
        switch(hexValue){
            case "0" : outputPosition = 0; break;
            case "1" : outputPosition = 1; break;
            case "2" : outputPosition = 2; break;
            case "3" : outputPosition = 3; break;
            case "4" : outputPosition = 4; break;
            case "5" : outputPosition = 5; break;
            case "6" : outputPosition = 6; break;
            case "7" : outputPosition = 7; break;
            case "8" : outputPosition = 8; break;
            case "9" : outputPosition = 9; break;
            case "a" : outputPosition = 10; break;
            case "b" : outputPosition = 11; break;
            case "c" : outputPosition = 12; break;
            case "d" : outputPosition = 13; break;
            case "e" : outputPosition = 14; break;
            case "f" : outputPosition = 15; break;
            default: break;
        }
        return outputPosition;
    }
    
    //Mixcoloums Multiplys the inpit array with the constant array.
    public static String[] mixColoums(String[] binaryArray){
		
		//Defining an output array
        String[] outputArray = new String[4];
       
	    //Defining an array for coloum1 and coloum2
        String[] coloum1 = new String[2];
        String[] coloum2 = new String[2];
       
	    //Defining a constant Binary array
        String[] CONSTANT_NIBBLES = {"0011","0010","0010","0011"};
       
        //First coloum calculations
        coloum1[0] = addition( multiplication(CONSTANT_NIBBLES[0],binaryArray[0]), multiplication(CONSTANT_NIBBLES[1],binaryArray[2]));
        coloum1[1] = addition( multiplication(CONSTANT_NIBBLES[2],binaryArray[0]), multiplication(CONSTANT_NIBBLES[3],binaryArray[2]));
       
        //Second coloum calculations 
        coloum2[0] = addition( multiplication(CONSTANT_NIBBLES[0],binaryArray[1]), multiplication(CONSTANT_NIBBLES[1],binaryArray[3]));
        coloum2[1] = addition( multiplication(CONSTANT_NIBBLES[2],binaryArray[1]), multiplication(CONSTANT_NIBBLES[3],binaryArray[3]));
       
        //conbination of two coloums into output array
        outputArray[0] = coloum1[0];
        outputArray[1] = coloum2[0];
        outputArray[2] = coloum1[1];
        outputArray[3] = coloum2[1];
       
        //test output's
        //System.out.println(outputArray[0]);
        //System.out.println(outputArray[1]);
        //System.out.println(outputArray[2]);
        //System.out.println(outputArray[3]);
		
        return outputArray;
    }
    

    //lewis's code -- Do not copy this version! --
    public static String addition(String valueA,String valueB){
        
        
        //System.out.println(valueA);
        //System.out.println(valueB);
        
        //Creating Output Variable
        String outputString = "";
        
        //Loop Through String To Change Values
        for(int i = 0; i < 4; i++){
            if (valueA.charAt(i) == valueB.charAt(i)){outputString += "0";}
            else{outputString += "1";}
        }
        
        //Testing Output
        //System.out.println(outputString);
        
        return outputString;
    }
}