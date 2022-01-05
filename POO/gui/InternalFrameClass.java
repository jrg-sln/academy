/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * @author JorgeA
 */
public class InternalFrameClass {
    public static void main (String[]a){
        JFrame frame = new JFrame("Internal frame.");
        JDesktopPane escritorio = new JDesktopPane();
		
        // new JInternalFrame (nombre, redimensión, cerrar, max, min)
        JInternalFrame internalFrame1;
        internalFrame1 = new JInternalFrame ("Inner 1", true, true, true, true);
        internalFrame1.setSize(200,200);
        internalFrame1.setLocation(50,50);
        internalFrame1.setVisible(true);
        escritorio.add(internalFrame1);
        
         // new JInternalFrame (nombre, redimensión, cerrar, max, min)
        JInternalFrame internalFrame2;
        internalFrame2 = new JInternalFrame ("Inner 2", false,false, false, false);
        internalFrame2.setSize(200,200);
        internalFrame2.setLocation(250,250);
        internalFrame2.setVisible(true);
        escritorio.add(internalFrame2);

        frame.setContentPane(escritorio);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
