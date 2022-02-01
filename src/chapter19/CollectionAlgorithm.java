/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author thetkhine
 */
public class CollectionAlgorithm {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list,4,5,6);
       
        for(Integer i : list)
        {
            System.out.println("I "+i);
        }
        
        Deque<Integer> dqueue = new LinkedBlockingDeque<Integer>();
        
        dqueue.add(3);
        dqueue.push(1);
        dqueue.push(2);
        
        Queue<Integer> queue = Collections.asLifoQueue(dqueue);
        System.out.println("Queue "+queue.poll());
        
        
        list2.add(6);
        list2.add(7);
        list2.add(8);
        
        Collections.copy(list, list2);
        for(Integer i : list)
        {
            System.out.println("I "+i);
        }
        System.out.println("Disjoint "+ Collections.disjoint(list, list2));
        
        
        System.out.println("Sublist "+ Collections.indexOfSubList(list, list2));
        System.out.println("Frequency "+Collections.frequency(list, 6));
        
        Collections.replaceAll(list, 6,16);
        
        for(Integer i : list)
        {
            System.out.println("I "+i);
        }
        Collections.shuffle(list);
        System.out.println("Shuffle");
        for(Integer i : list)
        {
            System.out.println("I "+i);
        }
    }
}
