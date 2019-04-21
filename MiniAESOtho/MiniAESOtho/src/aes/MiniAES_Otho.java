/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

import java.util.ArrayList;

/**
 *
 * @author 1811506
 */
public class MiniAES_Otho {
    static   ArrayList<Key> key = new ArrayList<>();
    static ArrayList<Output> ei = new ArrayList<>();
    static ArrayList<Input> input= new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main_Window mw=new Main_Window();
        mw.setVisible(true);//opens up Main Window
    }
    
}
