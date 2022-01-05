/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jorge A. Solano
 */
public class Border {
    public static void main(String [] args) {
       JFrame frame = new JFrame("Border layout");
       Container container = frame.getContentPane();
       container.setLayout(new BorderLayout());
       JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(2,1));
       JButton pane1 = new JButton("PANE 1");
       JButton pane2 = new JButton("PANE 2");
       panel.add(pane1);
       panel.add(pane2);

       JButton b1 = new JButton("NORTH");
       JButton b2 = new JButton("SOUTH");
       JButton b4 = new JButton("WEST");
       JButton b5 = new JButton("CENTER");
       container.add(b1,BorderLayout.NORTH);
       container.add(b2,BorderLayout.SOUTH);
       container.add(panel,BorderLayout.EAST);
       container.add(b4,BorderLayout.WEST);
       container.add(b5,BorderLayout.CENTER);
       frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
