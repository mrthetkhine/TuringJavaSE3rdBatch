/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class ArraysDemo {
    public static void main(String[] args) {
        Integer[]arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        
        
        Integer[] arr2 = Arrays.copyOf(arr, 3);
        for (Integer i :arr2) {
            System.out.println("I "+i);
        }
        arr2 = Arrays.copyOfRange(arr, 1,3);
        System.out.println("Range");
        for (Integer i :arr2) {
            System.out.println("I "+i);
        }
        
        Arrays.fill(arr, 5);
        System.out.println("Fill");
         for (Integer i :arr) {
            System.out.println("I "+i);
        }
        Arrays.parallelSetAll(arr, (i)->i*2);
        System.out.println("parallelSetAll");
        for (Integer i :arr) {
            System.out.println("I "+i);
        }
    }
}
