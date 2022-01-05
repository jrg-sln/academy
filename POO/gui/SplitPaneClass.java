/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

/**
 * @author JorgeA
 */
public class SplitPaneClass {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Split panel");
        
        ImageIcon ii = new ImageIcon("dragon.png");
        JScrollPane scrollPane = new JScrollPane(new JLabel(ii));
        
        JPanel labelPane = new JPanel();
        JLabel label = new JLabel("Message");
        labelPane.add(label);
        
        JSplitPane splitPane;
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, labelPane);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(0.5d);
        
        frame.getContentPane().add(splitPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      }
}
