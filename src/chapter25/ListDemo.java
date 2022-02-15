/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;


import java.awt.Button;
import java.awt.Choice;
import java.awt.List;
import java.awt.Scrollbar;

/**
 *
 * @author thetkhine
 */
public class ListDemo extends GeneralFrame{
    
    public ListDemo() {
        super("Choice Button");
        init();
    }
    public void init()
    {
        List browser = new List();
        browser.add("Firefox");
        browser.add("IE");
        browser.add("Chrome");
        
        browser.setMultipleMode(true);
        add(browser);
        
        browser.addItemListener(ie->{
            for(String str: browser.getSelectedItems())
            {
                System.out.println("Selected "+ str);
            }
            
        });
        Button btnSelect = new Button("Select");
        add(btnSelect);
        btnSelect.addActionListener(ae->{
            browser.select(0);
        });
        
        Scrollbar horizontal = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,200);
        add(horizontal);
        
        horizontal.addAdjustmentListener(ae->{
            System.out.println("Ae "+ae.getValue());
        });
                
    }
    public static void main(String[] args) {
        new ListDemo();
    }
}
