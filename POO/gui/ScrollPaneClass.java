/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

/**
 * @author JorgeA
 */
public class ScrollPaneClass {
    public static void main(String [] args) {
        JFrame marco = new JFrame("Scroll pane.");
        ImageIcon ii = new ImageIcon("java.jpg");
        JLabel etiqueta = new JLabel(ii);
        JScrollPane scrollPane = new JScrollPane(etiqueta);
        marco.getContentPane().add(scrollPane);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
