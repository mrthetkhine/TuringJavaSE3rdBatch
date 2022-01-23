/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

/**
 *
 * @author thetkhine
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start  = System.currentTimeMillis();
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 100000000; i++) {
            list.add(random.nextInt(10)+1);
        }
        
        Optional<Integer> zero = Optional.of(0);
        Optional<Integer> sum = list.parallelStream()
                         .reduce(Integer::sum);
        
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Sum "+ sum.get());
        System.out.println("Time "+time + " ms");
        
    }
}
