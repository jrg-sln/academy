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
public class JComponents {
    public static void main(String [] args) {
        JFrame marco = new JFrame("JComponents");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 30, 15);
	slider.setMajorTickSpacing(30);
	slider.setMinorTickSpacing(0);
	slider.setPaintTicks(true);
	slider.setPaintLabels(true);
        
        // Se agregan los componentes al contenedor
        contenedor.add(slider);
        
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
   }
}