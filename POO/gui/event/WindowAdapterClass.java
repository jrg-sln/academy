/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.event;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeA
 */
public class WindowAdapterClass extends WindowAdapter {
    JFrame ventana;
    public WindowAdapterClass(){
        ventana = new JFrame("Eventos en ventana");
        ventana.setSize(640, 480);
        ventana.setVisible(true);
        ventana.addWindowListener(this);
        ventana.setDefaultCloseOperation(JFrame. DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void windowClosing(WindowEvent e){
            if (JOptionPane.YES_OPTION ==
                JOptionPane.showConfirmDialog(null,
                            "¿Está seguro que desea salir?",
                            "Salir.",
                            JOptionPane.YES_NO_OPTION)){
                ventana.dispose();
                System.exit(0);
            }
    }
    public static void main(String[] args){
        new WindowAdapterClass();
    }

}
