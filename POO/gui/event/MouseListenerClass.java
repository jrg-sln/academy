/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.event;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jorge A. Solano
 */
public class MouseListenerClass implements MouseListener {
    JFrame marco;
    public MouseListenerClass(){
        marco = new JFrame("Eventos del ratón");
        JTextField texto = new JTextField(20);
        texto.addMouseListener(this);
        marco.addMouseListener(this);
        marco.setSize(640, 480);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic count." + e.getClickCount());
        System.out.println(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited.");
    }
    
    public static void main(String [] ooo){
        new MouseListenerClass();
    }
}

