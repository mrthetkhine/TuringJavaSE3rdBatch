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
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        
        System.out.println("Str length "+ str.length());
        
        System.out.println("Uppercase "+ str.toUpperCase());
        System.out.println("Str "+ str);
        
        System.out.println("ChatAt(0) "+str.charAt(0));
        System.out.println("CodePoint "+ str.codePointAt(0));
        
        System.out.println("Compare "+ "A".compareTo("B"));
        System.out.println("Compare C B "+ "C".compareTo("B"));
        System.out.println("Compare C C "+ "C".compareTo("C"));
        
        System.out.println("Compare c C "+ "c".compareTo("C"));
        System.out.println("Compare c C "+ "c".compareToIgnoreCase("C"));
        
        System.out.println("Conact ".concat("Hello"));
        
        System.out.println("contain "+ "Hello".contains("Hell"));
        
        System.out.println("Equal "+ (str == str2));
        System.out.println("Equal "+ (str == str3));
        System.out.println("Equal "+ str.equals(str2));
        
        System.out.println("endWith "+ "Hello".endsWith("llo"));
        System.out.println("startWith "+ "Hello".startsWith("Hel"));
        
        System.out.println("Hello index "+ "Hello".indexOf("e"));
        System.out.println("Hello index "+ "Hello World".indexOf("o",5));
        
        System.out.println("Hello index "+ "".isEmpty());
        System.out.println("Hello lastIndexOf "+ "Hello World".lastIndexOf("o"));
        
         System.out.println("Hello replace "+ "Hello World".replace("World","Java"));
         
         String demoString ="Hello World";
         String[] strArr = demoString.split(" ");
         System.out.println("Str 0 "+ strArr[0]);
         System.out.println("Str 1 "+ strArr[1]);
    }
}
