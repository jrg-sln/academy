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
public class TextClass {
    public static void main(String [] args) {
        JFrame marco = new JFrame("Text components");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        // etiqueta
        JLabel etiqueta = new JLabel("Nombre");
        // campo texto
        JTextField campoTexto = new JTextField("Campo de texto");
        // caja de texto
        JTextArea areaTexto = new JTextArea("Area de texto");
        
        // Se agregan los componentes al contenedor
        contenedor.add(etiqueta);
        contenedor.add(campoTexto);
        contenedor.add(areaTexto);

        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
   }
}