/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package app;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

/**
 *
 * @author Jorge A. Solano
 */
public class Login {
    JFrame ventana;
    JTextField usrTxt;
    JPasswordField pwdTxt;

    public Login(){
        ventana = new JFrame("Login");

        Container container = ventana.getContentPane();
        container.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 1));

        JLabel user = new JLabel("User");
        usrTxt = new JTextField();
        panel.add(user);
        panel.add(usrTxt);

        JLabel pwd = new JLabel("Password");
        pwdTxt = new JPasswordField(10);
        panel.add(pwd);
        panel.add(pwdTxt);

        JButton btn = new JButton("Login");
        ButtonAction action = new ButtonAction();
        btn.addActionListener(action);
        panelButton.add(btn);

        container.add(panel,BorderLayout.CENTER);
        container.add(panelButton,BorderLayout.SOUTH);
        
        ventana.setSize(350, 150);
        ventana.setResizable(false);
        ventana.setVisible(true);
        //ventana.addWindowListener(this);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                String pwd = String.valueOf(pwdTxt.getPassword());
                String usr = usrTxt.getText() + ":" + pwd;
                File file = new File("/Users/jrg_sln/Documents/UNAM/Academias/POO/Apuntes/Programas/gui/login/users.txt");
                Scanner myReader = new Scanner(file);
                JFrame f = new JFrame();
                while (myReader.hasNextLine()) {
                    if (usr.equals(myReader.nextLine())){
                        JOptionPane.showMessageDialog(f,"Welcome!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(f,"Login fail");
                myReader.close();
              } catch (FileNotFoundException e) {
                e.printStackTrace();
              }
        }
    }
    public static void main(String[] args){
        new Login();
    }

}
