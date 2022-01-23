/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author thetkhine
 */
public class CollectDemo {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10)+1);
        }
        List<Integer> sortedList;
        sortedList = list.stream().sorted().collect(Collectors.toList());
        for (Integer item : sortedList) {
            System.out.println("Item "+item);
        }
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        for (Integer item : set) {
            System.out.println("Item =>"+item);
        }
        Iterator<Integer> iterator = list.stream().iterator();
        while(iterator.hasNext())
        {
            System.out.println("Iterator "+iterator.next());
        }
    }
}
