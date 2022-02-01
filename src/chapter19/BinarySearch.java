/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thetkhine
 */
public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        int index = Collections.binarySearch(list, -15);
        System.out.println("Index "+index);
    }
}
