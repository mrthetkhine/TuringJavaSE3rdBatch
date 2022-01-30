/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.PriorityQueue;

/**
 *
 * @author thetkhine
 */
public class PrirorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("One");
        pq.add("Two");
        pq.add("Three");
        
        System.out.println("Peek "+pq.peek());
        System.out.println("Poll "+pq.poll());
        System.out.println("Poll "+pq.poll());
        
    }
}
