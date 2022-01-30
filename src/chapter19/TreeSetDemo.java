/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.TreeSet;

/**
 *
 * @author thetkhine
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        
        set.add("One");
        set.add("Two");
        set.add("One");
        
        for (String str : set) {
            System.out.println("Str "+str);
        }
        System.out.println(set);
    }
}
