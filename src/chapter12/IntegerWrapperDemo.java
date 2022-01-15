/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
public class IntegerWrapperDemo {
    public static void main(String[] args) {
        Integer i = 128;
        Integer j = 128;
        System.out.println("I == j "+(i==j));
        System.out.println("I == j "+(i.intValue()==j.intValue()));
        
        Integer k = Integer.valueOf("200");
        System.out.println("K "+k);
    }
}
