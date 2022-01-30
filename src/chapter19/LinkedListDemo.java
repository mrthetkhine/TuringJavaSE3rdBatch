/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.LinkedList;

/**
 *
 * @author thetkhine
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> strList = new LinkedList<String>();
        strList.add("One");
        strList.add("Two");
        strList.add(1,"Four");
        
        strList.addFirst("First");
        strList.addLast("Last");
        for(String str : strList)
        {
            System.out.println("Str "+str);
        }
        strList.remove(1);
        strList.remove("Four");
        
        strList.removeFirst();
        
        System.out.println("remove ");
        for(String str : strList)
        {
            System.out.println("Str "+str);
        }
        System.out.println("Get 1 "+strList.get(1));
        strList.set(1, "Change");
        
        System.out.println("After change ");
        for(String str : strList)
        {
            System.out.println("Str "+str);
        }
    }
}
