/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread22;

/**
 *
 * @author gallo.simone
 */
public class EsercizioThread22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say a1 = new Say("Ciao");
        Say a2 = new Say("Hello");
        Say a3 = new Say("Hi");

        a1.start();
        a2.start();
        a3.start();

    }
}
