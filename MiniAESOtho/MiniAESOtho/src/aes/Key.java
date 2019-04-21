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
public class Key {
    private String Nibble;
    
    public Key(String Nibble){
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
        return "Key{" + "Nibble=" + Nibble + '}';
    }
    
}
