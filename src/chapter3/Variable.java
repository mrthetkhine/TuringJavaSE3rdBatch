/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author thetkhine
 */
public class Variable {
    public static void main(String[] args) {
        int a = 100;
        a++;
        a = 200;
        
        System.out.println("A "+a);
        
        int b = a * 2;
        System.out.println("B "+b);
        {
            int c = 10;
            System.out.println("B "+b);
        }
        //System.out.println("C "+c);
        char c = 300;
        System.out.println("C "+c);
    }
}
