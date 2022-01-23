/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Random;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
public class SplitIterator {
    public static void main(String[] args) {
         Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        Spliterator<Integer> split2 = spliterator.trySplit();
        
        if(split2 != null)
        {
            split2.forEachRemaining(n->System.out.println("Split "+n));
        }
        spliterator.forEachRemaining(n->System.out.println("N "+n));
    }
}
