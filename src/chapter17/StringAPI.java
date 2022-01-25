/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class StringAPI {
    public static void main(String[] args) {
        String str1 = "Hello的";
        char[]arr = new char[str1.length()] ;
        str1.getChars(0, 4, arr, 0);
        
        String str2 = new String(arr);
        System.out.println("Arr "+str2);
        
        byte[]bytes = new byte[str1.length()];
        bytes = str1.getBytes();
        
        for(byte b :bytes)
        {
            System.out.println("Ch "+ (char)b);
        }
        
        System.out.println("Equal "+("Hello".equalsIgnoreCase("hello")));
        System.out.println("Region Match "+("hello".regionMatches(1, "ello", 0, 4)));
        
        System.out.println("Start With "+("hello world".startsWith("hello")));
        System.out.println("End With "+("hello world".endsWith("world")));
        
        System.out.println("Locale "+Locale.getDefault());
        
        System.out.println("Compare to "+ ("A".compareTo("a")));
        //System.out.println("Compare "+("A"> "a"));
    }
}
