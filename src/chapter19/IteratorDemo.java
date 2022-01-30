/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        
        Iterator<Integer> itr = lst.iterator();
        
        while(itr.hasNext())
        {
            System.out.println("Next "+itr.next());
        }
        
        
    }
}
