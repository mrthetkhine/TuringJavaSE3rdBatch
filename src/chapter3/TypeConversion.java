/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author thetkhine
 */
public class TypeConversion {
    public static void main(String[] args) {
        short s = 10;
        int i = s;
        
        i = 19999999;
        s =(short) i;
        
        System.out.println("S "+s);
        
        float f = 3.1f;
        
        i = (int)f;
        
        String str = "Hello";
        //i = (int)str;
        
        byte b = 10;
        b =(byte)( b + b);
    }
}
