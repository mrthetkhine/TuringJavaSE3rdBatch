/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author thetkhine
 */
public class PaintDemo extends Frame{
    Button btnOk;
    PaintDemo()
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
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked x=> "+e.getX() +" y = "+e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed x=> "+e.getX() +" y = "+e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released x=> "+e.getX() +" y = "+e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered x=> "+e.getX() +" y = "+e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited x=> "+e.getX() +" y = "+e.getY());
            }
        });
    }
    void drawPoint(Graphics g,int x,int y)
    {
        g.drawArc(x, y, 2, 2, 0, 360);
    }
    public void drawCircle(Graphics g,int centerX, int centerY,int radius)
    {
        for (int i = 0; i < 360; i++) {
            double x = radius * Math.cos(i);
            double y  = radius * Math.sin(i);
            
            x = (int)(centerX +x);
            y = (int)(centerY +y);
            this.drawPoint(g,(int)x,(int)y);
        }
    }
    public void drawShape(Graphics g,int centerX, int centerY)
    {
        for (int i = 0; i < 360; i++) {
            double r = 200*(Math.sin(i)) - (Math.cos(2*i));
            double x = (r * Math.cos(i));
            double y  = (r* Math.sin(i));
            
            x = (int)(centerX +x);
            y = (int)(centerY +y);
            this.drawPoint(g,(int)x,(int)y);
        }
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(new Color(100,0,200));
        g.drawLine(10, 10, 10, 100);
        
        g.drawRect(10,10, 50, 50);
        
        g.drawArc(100, 200, 300, 300, 0, 360);
        
        this.drawPoint(g,100, 300);
        
        this.drawCircle(g, 200, 200, 100);
        this.drawShape(g, 500, 500);
        
        Font f = new Font("Georgia",Font.PLAIN,15);
        g.setFont(f);
        g.drawString("Hello", 100, 200);
        
    }
    public static void main(String[] args) {
        PaintDemo frame = new PaintDemo();
        //frame.setVisible(true);
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font [] fonts = ge.getAllFonts();
        for (Font f : fonts) {
            System.out.println("Font name "+f.getFontName());
        }
    }
}
