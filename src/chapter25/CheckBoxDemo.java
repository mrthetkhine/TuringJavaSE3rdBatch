/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

/**
 *
 * @author thetkhine
 */
public class CheckBoxDemo extends GeneralFrame{
   
    public CheckBoxDemo() {
        super("Checkbox");
       
        this.init();
    }
    public void init()
    {
        System.out.println("Child init");
        CheckboxGroup gp = new CheckboxGroup();
        
        Checkbox android = new Checkbox("Android",false,gp);
        add(android);
        
        android.addItemListener((ie)->{
            System.out.println("Item Listener "+ android.getState());
            
        });
        Checkbox ios =new Checkbox("iOS",false, gp);
        add(ios);
        ios.addItemListener((ie)->{
            System.out.println("iOS"+ ios.getState());
        });
        
        Checkbox window =new Checkbox("Window");
        add(window);
        window.addItemListener((ie)->{
            System.out.println("Window"+ ios.getState());
        });
    }
    public static void main(String[] args) {
        new CheckBoxDemo();
    }
    
}
