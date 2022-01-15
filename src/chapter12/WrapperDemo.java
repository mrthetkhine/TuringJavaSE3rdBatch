/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.util.ArrayList;

/**
 *
 * @author thetkhine
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer num = 12;
        System.out.println("Wrapper "+num);
        System.out.println("InstanceOf "+ (num instanceof Object));
        
        ArrayList list = new ArrayList();
        list.add("One");
        list.add(2);
        
        Object obj = list.get(0);
        
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(num);
        //numList.add("One");
    }
}
