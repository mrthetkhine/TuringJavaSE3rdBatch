/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class StringMutable {
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        /*
        String str = "";
        
        for (int i = 0; i < 100000; i++) {
            str+= "Hello";
        }
        */
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str.append("Hello");
        }
        
        long end = System.currentTimeMillis();
        long time = (end - start)/1000;
        System.out.println("Sec "+ time);
    }
}
