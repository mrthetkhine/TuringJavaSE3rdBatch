/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author thetkhine
 */
public class NesteLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer "+i);
            for (int j = 0; j < 4; j++) {
                System.out.println(" Inner "+j);
            }
        }
    }
}
