/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Choice;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author thetkhine
 */
public class MenuDemo extends GeneralFrame{
    
    public MenuDemo() {
        super("Menu");
        init();
    }
    public void init()
    {
      MenuBar menuBar = new MenuBar();
      
      Menu mnuFile = new Menu("File");
      
      MenuItem openItem = new MenuItem("Open");
      mnuFile.add(openItem);
      
      openItem.addActionListener(ae->{
          System.out.println("Open Clicked");
          JOptionPane.showMessageDialog(this, "You clicked Open");
                  
      });
      MenuItem confirmItem = new MenuItem("Confirm");
      mnuFile.add(confirmItem);
      
      confirmItem.addActionListener(ae->{
          System.out.println("Open Clicked");
          int buttonType = JOptionPane.showConfirmDialog(null, "Are you sure you want", "Yes/No", JOptionPane.YES_NO_CANCEL_OPTION);
          
          if(buttonType == JOptionPane.YES_OPTION)
          {
              JOptionPane.showMessageDialog(this, "You clicked yes ");
          }
          else
          {
              JOptionPane.showMessageDialog(this, "You clicked no ");
          }
                  
      });
      mnuFile.addSeparator();
      
      MenuItem newItem = new MenuItem("New");
      mnuFile.add(newItem);
      
      Menu subMenu = new Menu("Get Data");
      subMenu.add(new MenuItem("Level 2"));
      mnuFile.add(subMenu);
      menuBar.add(mnuFile);
      
      subMenu.addActionListener((ae)->{
          String data = JOptionPane.showInputDialog(this, "Enter data");
          JOptionPane.showMessageDialog(this, "You entered "+data);
      });
      this.setMenuBar(menuBar);
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
