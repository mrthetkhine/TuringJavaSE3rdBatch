/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author thetkhine
 */
class Human
{

    
    @Override
    public String toString() {
        return "Human{" + '}';
    }

    
}
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 == str2 "+ (str1==str2));
        
        String str3 = new String("Hello");
        System.out.println("str1 == str3 "+ (str1==str3));
        
        System.out.println("str1.equals "+ (str1.equals(str3)));
        
        System.out.println("ToUpperCase "+ str3.toUpperCase());
        System.out.println("St3 "+str3);
        
        char[]chars = {'h','e','l','l','o'};
        String str4 = new String(chars);
        System.out.println("Str4 "+ str4);
        
        String str5 = "的";
        System.out.println("CharAt 0 "+str5.charAt(0));
        System.out.println("Str5.length() "+str5.length());
        System.out.println("Hello.length "+ ("Helllo".length()));
        
        String result = "Hello "+ "World";
        System.out.println("Result "+result);
        
        Human h = new Human();
        System.out.println(""+h);
    }
}
