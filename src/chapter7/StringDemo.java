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
public class StringDemo {
    public static void main(String[] args) {
        
        String str = "Hello";
        String str2 = "Hello";
        
        String str3 = new String("Hello");
        
        System.out.println("str.toLowerCase "+str.toLowerCase());
        System.out.println("Str "+str);
        
        System.out.println("str == str2 "+ (str == str2));
        System.out.println("str == str3 "+ (str == str3));
        
        System.out.println("Equals "+ ( str.equals(str3)));
        
        System.out.println("CharAt "+ str.charAt(0));
    }
}
