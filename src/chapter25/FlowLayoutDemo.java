/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
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
public class FlowLayoutDemo extends Frame implements ActionListener{
    Button btnOk;
    FlowLayoutDemo()
    {
        super("Hello World");
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
        this.setLayout(new FlowLayout());
        this.btnOk = new Button("Ok");
      
        this.btnOk.addActionListener(this);
        this.add(btnOk);
        Button btnTwo = new Button("Two");
        this.add(btnTwo);
        
        btnTwo.addActionListener(this);
        this.add(new Label("One"));
        this.add(new Label("Two"));
        this.add(new Label("Three"));
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button  clicked "+e.getActionCommand());
    }
     public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        //frame.setVisible(true);
    }
}
