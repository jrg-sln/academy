/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jorge A. Solano
 */
public class Flow {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Flow Layout");
        Container contenedor = frame.getContentPane();
        contenedor.setLayout(new FlowLayout());
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JLabel etiqueta = new JLabel("Nombre");
        contenedor.add(etiqueta);
        contenedor.add(b1);
        contenedor.add(b2);
        contenedor.add(b3);
        contenedor.add(b4);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }
}
