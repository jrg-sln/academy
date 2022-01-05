/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jorge A. Solano
 */
public class ActionListenerClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyFrame extends JFrame {
    public static final int WIDTH_PIXELS = 250;
    public static final int HEIGHT_PIXELS = 70;

    public MyFrame() {
        setTitle("Test action event");
        setSize(WIDTH_PIXELS, HEIGHT_PIXELS);
        MyPanel panel = new MyPanel();
        add(panel);
    }
}

class MyPanel extends JPanel {
    public MyPanel() {
        JButton button = new JButton("Acept");
        add(button);
        // crear la acción del botón
        ButtonAction accion = new ButtonAction();
        // asociar la acción al botón
        button.addActionListener(accion);
    }

    private class ButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Clic");
            String texto = "", aux;
            try{
                JFileChooser file=new JFileChooser();
                file.showOpenDialog(new JFrame());
                File abre=file.getSelectedFile();
                if(abre!=null) {     
                    FileReader archivos=new FileReader(abre);
                    BufferedReader lee=new BufferedReader(archivos);
                    while((aux=lee.readLine())!=null) {
                        texto+= aux+ "\n";
                    }
                    lee.close();
                    System.out.println(texto);
                }    
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, e + "\nNo se ha encontrado el archivo.", "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
