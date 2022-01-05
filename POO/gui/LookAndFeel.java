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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jorge A. Solano
 */
public class LookAndFeel {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           System.out.println("Look and feel not unsupported.");
        }

        JFrame frame = new JFrame("Look & Feel");
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JButton button = new JButton("Button");
        container.add(button);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
