/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */
public class BorderLayoutDemo extends JFrame{
    BorderLayoutDemo()
    {
        init();
    }

    private void init() throws HeadlessException {
        this.setVisible(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Window closing");
                System.exit(0);
            }
        
        });
        this.setLayout(new BorderLayout());
        
        Button btnWest = new Button("West");
        this.add(btnWest, BorderLayout.WEST);
        
        Button btnEast = new Button("East");
        this.add(btnEast, BorderLayout.EAST);
        
        Button btnNorth = new Button("North");
        this.add(btnNorth, BorderLayout.NORTH);
        
        Button btnSouth = new Button("South");
        this.add(btnSouth, BorderLayout.SOUTH);
        
        Button btnCenter = new Button("Center");
        this.add(btnCenter, BorderLayout.CENTER);
        
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
