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
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if( i== 5)
            {
                continue;
            }
            System.out.println("I "+i);
        }
        System.out.println("==============");
        for (int i = 0; i < 10; i++) {
            if (i != 5)
            {
                System.out.println("I "+i);
            }
        }
    }
}
