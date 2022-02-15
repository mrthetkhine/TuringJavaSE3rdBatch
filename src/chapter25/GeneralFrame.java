/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class GeneralFrame extends Frame{
    GeneralFrame(String title)
    {
        super(title);
        initWindow();
    }
    public void initWindow()
    {
        System.out.println("super init");
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
    }
}
