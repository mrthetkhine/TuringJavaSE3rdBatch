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
public class BitwiseOp {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        
        System.out.println("0 =>"+ Integer.toBinaryString(0));
        System.out.println("1 =>"+ Integer.toBinaryString(1));
        System.out.println("0 & 1=> "+Integer.toBinaryString(0 & 1));
        System.out.println("1 & 1=> "+Integer.toBinaryString(1 & 1));
        
        System.out.println("0 | 1=> "+Integer.toBinaryString(0 | 1));
        System.out.println("1 | 1=> "+Integer.toBinaryString(1 | 1));
        System.out.println("0 | 0=> "+Integer.toBinaryString(0 | 0));
        
        System.out.println("~0=> "+Integer.toBinaryString(~0));
        System.out.println("~1  1=> "+Integer.toBinaryString(~1));
        
        System.out.println("1^1 => "+Integer.toBinaryString(1^1));
        System.out.println("0^1 "+Integer.toBinaryString(0^1));
        System.out.println("1^0 "+Integer.toBinaryString(1^0));
        System.out.println("0^0 "+Integer.toBinaryString(0^0));
        
        System.out.println("5 => "+Integer.toBinaryString(5));
        System.out.println("5>>1 => "+Integer.toBinaryString(5>>1));
        System.out.println("5>>>1 => "+Integer.toBinaryString(5>>>1));
        
         System.out.println("5<<1 => "+Integer.toBinaryString(5<<1));
        
    }
}
