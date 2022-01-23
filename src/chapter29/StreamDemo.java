/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
public class StreamDemo {
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10)+1);
        }
        Stream<Integer> iSteam = list.stream();
        Optional<Integer> minValue = iSteam.min(Integer::compare);
        
        System.out.println("MinValue "+ minValue.get());
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+ time);
        
        Stream<Integer> sortedStream = list.stream().sorted();
        sortedStream.forEach(x->System.out.println("x "+x));
    }
}
