/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.event;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jorge A. Solano
 */
public class KeyListenerClass implements KeyListener {
    JFrame marco;
    public KeyListenerClass(){
        marco = new JFrame("Key events");
        JTextField texto = new JTextField(20);
        texto.addKeyListener(this);
        marco.getContentPane().add(texto);
        marco.setSize(640, 480);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Typed " + e.getKeyChar() + "(" + e.getKeyCode() + ")\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed " + e.getKeyChar() + "(" + e.getKeyCode() + ")\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released " + e.getKeyChar() + "(" + e.getKeyCode() + ")\n");
    }
    
    public static void main(String [] key){
        new KeyListenerClass();
    }
}
