/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author thetkhine
 */
public class PasswordTextBox extends GeneralFrame{
    
    public PasswordTextBox() {
        super("Choice Button");
        init();
    }
    public void init()
    {
        TextField txtPassword = new TextField(30);
        txtPassword.setEchoChar('*');
        
        add(txtPassword);
        
        TextArea textArea = new TextArea(5, 10);
        add(textArea);
        
        Button btnShow = new Button("Show");
        add(btnShow);
        
        btnShow.addActionListener(ae->{
            System.out.println("Password "+ txtPassword.getText());
        });
    }
    public static void main(String[] args) {
        new PasswordTextBox();
    }
}
