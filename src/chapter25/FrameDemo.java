/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class FrameDemo extends Frame{
    Button btnOk;
    FrameDemo()
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
        this.btnOk = new Button("Ok");
        this.setLayout(new FlowLayout());
        this.add(btnOk);
    }
    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();
        //frame.setVisible(true);
    }
}
