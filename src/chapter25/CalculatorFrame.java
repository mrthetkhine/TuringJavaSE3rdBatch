/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class CalculatorFrame extends Frame implements ActionListener{
    CalculatorFrame()
    {
        super("Calculator");
        this.init();
    }
    public void init()
    {
        this.setVisible(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Window closing");
                System.exit(0);
            }
        
        });
        this.setLayout(new GridLayout(4,3));
        
        Button buttons []= new Button[10];
        for (int i = 0; i < buttons.length; i++) {
            
            buttons[i] = new Button(i+"");
            this.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        Button btnLast = new Button("Last");
        add(btnLast);
        btnLast.addActionListener((ae)->{
            System.out.println("Btn last clicked");
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action "+e.getActionCommand());
    }
    public static void main(String[] args) {
        new CalculatorFrame();
    }

    
}
