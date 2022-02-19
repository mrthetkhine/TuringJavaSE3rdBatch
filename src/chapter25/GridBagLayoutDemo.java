/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */
public class GridBagLayoutDemo extends JFrame{
    GridBagLayoutDemo()
    {
        super("GridBag Layout Demo");
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
        GridBagLayout gb = new GridBagLayout();
        this.setLayout(gb);
        
        Checkbox window = new Checkbox("window");
        Checkbox android = new Checkbox("android");
        Checkbox iOS = new Checkbox("iOS");
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.ipadx = 200;
        gbc.insets = new Insets(0, 6, 0, 0);
        
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        
        gb.setConstraints(window, gbc);
        add(window);
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gb.setConstraints(android, gbc);
        
        add(android);
        
        gbc.gridy = 1;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gb.setConstraints(iOS, gbc);
        
        add(iOS);
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
