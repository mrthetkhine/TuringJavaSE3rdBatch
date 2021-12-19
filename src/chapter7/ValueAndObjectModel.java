/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */

public class ValueAndObjectModel {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = a;
        
        a++;
        
        System.out.println("A "+ a);
        System.out.println("B "+b);
        */
        Data a = new Data(10);
        Data b = a;
        
        a.value ++;
        System.out.println("A.value "+ a.value);
        System.out.println("B.value "+ b.value);
        
        b = new Data(100);
        b.value++;
        
        System.out.println("A.value "+ a.value);
        System.out.println("B.value "+ b.value);
    }
}
