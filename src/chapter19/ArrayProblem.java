/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class ArrayProblem {
    public static void main(String[] args) {
        int[]data = new int[3];
        //data[3] = 20;
        
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        
        System.out.println("Get 0 "+ dataList.get(0));
        //System.out.println("Get 3 "+ dataList.get(3));
       
    }
}
