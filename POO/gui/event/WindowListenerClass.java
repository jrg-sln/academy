/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.event;

import javax.swing.JFrame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge A. Solano
 */
public class WindowListenerClass implements WindowListener {
    JFrame ventana;
	public WindowListenerClass(){
            ventana = new JFrame("Eventos en ventana");
            ventana.setSize(640, 480);
            ventana.setVisible(true);
            ventana.addWindowListener(this);
            ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	}

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (JOptionPane.YES_OPTION ==
			JOptionPane.showConfirmDialog(null,
				"¿Está seguro que desea salir?",
				"Salir.",
				JOptionPane.YES_NO_OPTION)){
		            ventana.dispose();
		            System.exit(0);
		}

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Deactivated");
    }
    
    public static void main (String [] window) {
        new WindowListenerClass();
    }
}
