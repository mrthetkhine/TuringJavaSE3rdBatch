/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
       
        
        for (int i = 0; i < 5; i++) {
            s1.push(i);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("s1.pop "+s1.pop());
        }
    }
}
