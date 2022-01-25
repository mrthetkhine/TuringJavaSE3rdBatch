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
public class StringPerformance {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        /*
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "Hello";
        }*/
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            str.append("Hello");
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+time);
        System.out.println("Length "+str.length());
        System.out.println("Capactiy "+str.capacity());
        str.setLength(30);
        System.out.println("Str "+str);
        
        str.setCharAt(0, 'J');
        System.out.println("Str "+str);
        
        str.insert(5, "Program");
        System.out.println("Str "+str);
        
        str.reverse();
        System.out.println("reverse Str "+str);
        
        System.out.println("ChartAt "+str.charAt(0));
        str.delete(0, 5);
        System.out.println("Str "+str);
        
        str.replace(0, 5,"Java");
        System.out.println("Str "+str);
    }
}
