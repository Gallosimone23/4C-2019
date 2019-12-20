/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

import javax.swing.JOptionPane;

/**
 *
 * @author gallo.simone
 */
public class Hello  extends Thread{
   

    public Hello() {
        
    }
    
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            //JOptionPane.showMessageDialog(null, hello);
            System.out.println("Hello");
        }
    }

    
    
}
