/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.hola;
import javax.swing.JOptionPane;

/**
 *
 * @author kcerv
 */
public class mensaje implements hola {

    @Override
    public String SayMessage(String MyMessage) {
       JOptionPane.showMessageDialog(null, MyMessage);
        return MyMessage;
    }
    
}
