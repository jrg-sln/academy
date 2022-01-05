/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Jorge A. Solano
 */
public class Especialized {
    public static void main(String [] args) {
        JFrame marco = new JFrame("JComponents");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
               
	JColorChooser jcc = new JColorChooser();

	JTree jt = new JTree();

        // Se agregan los componentes al contenedor
        contenedor.add(jcc);
        contenedor.add(jt);
        
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
   }
}