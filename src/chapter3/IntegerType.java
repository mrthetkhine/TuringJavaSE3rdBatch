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
public class IntegerType {
    public static void main(String[] args) {
        byte b = -128;
        b = 127;
        b++;
        System.out.println("B "+b);
        
        short s = -32768;
        s = 32767;
        
        s = b;
        //b = s;
        
        int i = -2147483648;
        i = 2147483647;
        
        long myLong = 2147483647L;
        myLong = i;
        myLong = b;
        myLong = s;
        
        //s = myLong;
        
        char ch = 'A';
        //ch = 123;
        ch++;
        System.out.println("ch "+ch);
        
        //b = ch;
        //s = ch;
        i = ch;
    }
}
