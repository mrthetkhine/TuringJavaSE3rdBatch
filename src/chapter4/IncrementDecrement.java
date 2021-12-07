/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author thetkhine
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int c = ++a;
        
        
        System.out.println("C "+ c);
        System.out.println("A "+ a);
        
        int d = a ++;
        System.out.println("D "+ d);
        System.out.println("A "+ a);
        
        int e = 10;
        e += 2+3;//e = e+ 2;
        System.out.println("E "+e);
        
        float f = 3.1f;
        e += f;
        
        System.out.println("e "+e);
    }
}
