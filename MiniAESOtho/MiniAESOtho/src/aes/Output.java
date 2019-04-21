/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

/**
 *
 * @author Łada
 */
public class Output {
    private String Nibble;
    
    public Output(String Nibble){
        this.Nibble=Nibble;
    }

    public String getNibble() {
        return Nibble;
    }

    public void setNibble(String Nibble) {
        this.Nibble = Nibble;
    }

    @Override
    public String toString() {
        return "Encryption_Input{" + "Nibble=" + Nibble + '}';
    }
    
    
}
