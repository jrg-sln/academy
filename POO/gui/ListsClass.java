/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Jorge A. Solano
 */
public class ListsClass {
    public static void main(String [] args) {
        JFrame marco = new JFrame("Mi primer ventana");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        String [] listaCombo = new String[]{"Pig", "Bird", "Cat"};
	JComboBox jcb = new JComboBox(listaCombo);
	jcb.addItem("Dog");
	jcb.addItem("Rabbit");

	String [] listaMeses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        JScrollPane scrollPane = new JScrollPane();
	JList jl = new JList(listaMeses);
        scrollPane.getViewport().setView(jl);
	        
        SpinnerListModel modeloMeses = new SpinnerListModel(listaMeses);
	JSpinner spinner = new JSpinner(modeloMeses);

        // Se agregan los componentes al contenedor
        contenedor.add(jcb);
        contenedor.add(scrollPane);
        contenedor.add(spinner);

        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
   }
}