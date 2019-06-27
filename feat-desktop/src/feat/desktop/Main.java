/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feat.desktop;

/**
 *
 * @author kcerv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hola_mundo hm = new Hola_mundo();
        
        hm.setTitle("Primer Hola Mundo");
        hm.setVisible(true);
        
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
    }
    
}
