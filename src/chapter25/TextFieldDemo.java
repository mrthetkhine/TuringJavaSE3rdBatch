/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author thetkhine
 */
public class TextFieldDemo extends GeneralFrame{
    
    public TextFieldDemo() {
        super("Choice Button");
        init();
    }
    public void init()
    {
        Choice browser = new Choice();
        browser.add("Firefox");
        browser.add("IE");
        browser.add("Chrome");
        
        add(browser);
        
        browser.addItemListener(ie->{
            System.out.println("Selected "+ browser.getSelectedItem());
        });
        Label lblAmount = new Label("Price");
        add(lblAmount);
        
        TextField txtPrice = new TextField(20);
        add(txtPrice);
        
        add( new Label("Qty"));
        TextField txtQuantity = new TextField(20);
        add(txtQuantity);
        
        add( new Label("Total"));
        TextField txtTotal = new TextField(20);
        txtTotal.setEditable(false);
        add(txtTotal);
        
        Button btnShow  = new Button("Show");
        add(btnShow);
        btnShow.addActionListener(ae->{
            float price = Float.parseFloat(txtPrice.getText());
            float quantity = Float.parseFloat(txtQuantity.getText());
            
            txtTotal.setText(price* quantity+"");
            System.out.println("Amount "+ txtQuantity.getText());
        });
    }
    public static void main(String[] args) {
        new TextFieldDemo();
    }
}
