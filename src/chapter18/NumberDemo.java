/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class NumberDemo {
    public static void main(String[] args) {
        Float f= 2.1f;
        System.out.println("F intValue "+f.intValue());
        System.out.println("Float min "+Float.min(10, 2));
        
        f = 0.0f/0.0f;
        System.out.println("F "+f);
        System.out.println("IsNaN "+Float.isNaN(f));
        
        f = 1.0f/0.0f;
        System.out.println("F "+f);
        System.out.println("inifinity "+Float.isInfinite(f));
        
        String str = "1.0";
        f = Float.parseFloat(str);
        System.out.println("F "+f);
        
        System.out.println("IsDigit "+Character.isDigit('0'));
    }
}
