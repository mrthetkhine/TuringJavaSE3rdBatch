/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author thetkhine
 */
public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<String>();
        //ArrayList<String> hashSet = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            hashSet.add("hello_"+i);
        }
        long start = System.currentTimeMillis();
        System.out.println("Hashset contain "+hashSet.contains("hello_993939"));
        
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("milisecond "+ time + " ms");
    }
}
