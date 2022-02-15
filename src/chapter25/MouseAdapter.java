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
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class MouseAdapter extends Frame{
    Button btnOk;
    MouseAdapter()
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
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked x=> "+e.getX() +" y = "+e.getY());
            }

        });
        
        this.btnOk = new Button("Ok");
        this.setLayout(new FlowLayout());
        this.add(btnOk);
        
        Label label = new Label("Hello");
        this.add(label);
    }
    public static void main(String[] args) {
        MouseAdapter frame = new MouseAdapter();
        //frame.setVisible(true);
    }
}
