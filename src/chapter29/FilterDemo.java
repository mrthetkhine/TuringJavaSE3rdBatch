/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
public class FilterDemo {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10)+1);
        }
        Stream<Integer> iSteam = list.stream();
        iSteam.forEach(x-> System.out.println(x));
        
        Predicate<Integer> isEven = (x)-> x%2 == 0;
        Predicate<Integer> greaterThanFive = (x)-> x >5;
       
        Stream<Integer> evenList = list
                                    .stream()
                                    .filter(isEven)
                                    .filter(greaterThanFive);
                                     
        
        System.out.println("Even list");
        evenList.forEach(x-> System.out.println("Even "+x));
        
    }
}
