/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;

/**
 *
 * @author thetkhine
 */
public class ReduceDemo {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10)+1);
        }
        
        for(Integer i : list)
        {
            System.out.println("Item "+i);
        }
        BinaryOperator<Integer> acc = (a,b)-> {
            System.out.println("A "+a + " B "+b);
            return a < b?a :b ;
        };
        Optional<Integer> sum = list
                                .stream()
                                .reduce(acc);
        System.out.println("Min "+ sum.get());
    }
}
