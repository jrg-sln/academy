/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Jorge A. Solano
 */
public class NoInteractive {
    public static void main(String [] args) {
        JFrame marco = new JFrame("No interactive components");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        // etiqueta
        JLabel label = new JLabel("Nombre");
        
        JProgressBar barraProgreso = new JProgressBar();
	barraProgreso.setValue(25);
	barraProgreso.setStringPainted(true);
        
        ImageIcon ii = new ImageIcon("java.jpg");
        JLabel image = new JLabel(ii);
        image.setToolTipText("coffee!!");
        
        contenedor.add(barraProgreso);
        contenedor.add(label);
        contenedor.add(image);
        
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
