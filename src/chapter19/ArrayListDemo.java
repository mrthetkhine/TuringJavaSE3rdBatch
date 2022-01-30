/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        int[]data = new int[3];
        //data[3] = 20;
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(1,10);
        
        System.out.println("Get 0 "+ lst.get(0));
        System.out.println("Size "+lst.size());
       
        for (Integer i : lst) {
            System.out.println("I "+i);
        }
        System.out.println("Remove");
        lst.remove(2);
        lst.remove(new Integer(2));
        //System.out.println("Get 3 "+ dataList.get(3));
         for (Integer i : lst) {
            System.out.println("I "+i);
        }
         
        System.out.println("lst.contain "+lst.contains(10));
       
        Integer arr[] = new Integer[lst.size()];
        lst.toArray(arr);
        //lst.toArray();
        
        for(Integer i : arr)
        {
            System.out.println("Arr "+i);
        }
        System.out.println("IsEmpty "+lst.isEmpty());
        System.out.println("IndexOf "+ lst.indexOf(10));
        Collections.sort(lst);
        
         for (Integer i : lst) {
            System.out.println("I "+i);
        }
    }
}
