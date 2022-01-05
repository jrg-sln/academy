/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author JorgeA
 */
public class ImageClass {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Image.");
        ImageIcon icon = new ImageIcon("./dragon.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
