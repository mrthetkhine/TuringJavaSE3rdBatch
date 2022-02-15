/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */
public class CardLayoutDemo extends JFrame{
    CardLayoutDemo()
    {
        super("CardLayoutDemo");
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
        
       Button btnWindow = new Button("Window");
       add(btnWindow);
       
       Button btnOther = new Button("Other");
       add(btnOther);
       
       Panel osCards = new Panel();
       
       CardLayout card0 = new CardLayout();
       osCards.setLayout(card0);
       
       Panel panel = new Panel();
       panel.add(new Label("Window Items"));
       
       Panel otherPanel = new Panel();
       otherPanel.add(new Label("Others"));
       
       osCards.add( panel,"window");
       osCards.add( otherPanel,"other");
       
       add(osCards);
       
       btnWindow.addActionListener(ae->{
           card0.show(osCards, "window");
       });
       
       btnOther.addActionListener(ae->{
            card0.show(osCards, "other");
       });
    }
    
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
