/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jorge A. Solano
 */
public class Grid {
    public static void main(String [] args) {
       JFrame frame = new JFrame("Grid layout");
       Container container = frame.getContentPane();
       container.setLayout(new GridLayout(2,3));
       JButton b1 = new JButton("1");
       JButton b2 = new JButton("2");
       JButton b3 = new JButton("3");
       JButton b4 = new JButton("4");
       JButton b5 = new JButton("5");
       JButton b6 = new JButton("6");
       container.add(b1);
       container.add(b2);
       container.add(b3);
       container.add(b4);
       container.add(b5);
       container.add(b6);
       frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
