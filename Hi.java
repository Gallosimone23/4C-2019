/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

import sun.text.resources.es.FormatData_es_PY;



/**
 *
 * @author gallo.simone
 */
public class Hi extends Thread{

 

    public Hi() {
        
    }
    
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            
        }
    }
        
    

}
