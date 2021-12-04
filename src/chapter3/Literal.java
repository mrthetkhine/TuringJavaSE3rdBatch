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
public class Literal {
    public static void main(String[] args) {
        int i = 0b101;
        System.out.println("I "+i);
        
        i = 100_200;
        i = 0xFF;
        System.out.println("i "+i);
        
        i = 012;
        System.out.println("i "+i);
    }
}
