/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioconflitto;

import static esercizioconflitto.Inc1000.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gallo.simone
 */
public class Inc1000 extends Thread {

    static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Inc1();
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private static void Inc1() {
        count++;
    }
}
