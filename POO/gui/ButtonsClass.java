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
 * @author JorgeA
 */
public class ButtonsClass {
    public static void main(String [] args) {
        JFrame marco = new JFrame("Buttons");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        // boton
        JButton b1 = new JButton("Button");
        // Botones tipo radio
        JRadioButton[] botonesRadio = new JRadioButton[3];
        ButtonGroup grupo = new ButtonGroup();
        botonesRadio[0] = new JRadioButton("Opción 1");
        botonesRadio[1] = new JRadioButton("Opción 2");
        botonesRadio[2] = new JRadioButton("Opción 3");
        for (int i = 0; i < 3; i++) {
           grupo.add(botonesRadio[i]);
        }
        // caja texto seleccionable
        JCheckBox caja = new JCheckBox("Caja de selección");
                
        // Se agregan los componentes al contenedor
        contenedor.add(b1);
        contenedor.add(caja);
        for (int i = 0; i < 3; i++) {
           contenedor.add(botonesRadio[i]);
        }
        
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
   }
}
