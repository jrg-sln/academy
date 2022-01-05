/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

/**
 *
 * @author Jorge A. Solano
 */
public class MenuBar {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Menu bar");
        JMenuBar jmb = new JMenuBar();
        frame.setJMenuBar(jmb);
        
        // Menu options
        JMenu archivo, edicion, ayuda;
        archivo = new JMenu("File");
        edicion = new JMenu("Edition");
        ayuda = new JMenu("Help");

        // Menu elements
        JMenuItem nuevo, guardar, cargar, cerrar;
        nuevo = new JMenuItem("New");
        guardar = new JMenuItem("Save");
        cargar = new JMenuItem("Load");
        cerrar = new JMenuItem("Close");
        JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("Choose");
        
        // Add items to menu
        archivo.add(nuevo);
        archivo.add(guardar);
        archivo.add(cargar);
        archivo.addSeparator();
        archivo.add(cerrar);
        archivo.add(jcbmi);

        // Add menus to menubar
        jmb.add(archivo);
        jmb.add(edicion);
        jmb.add(ayuda);

        frame.pack();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
