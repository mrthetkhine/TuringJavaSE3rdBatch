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
public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            System.out.println("I "+i);
            if( i== 5)
            {
                break;
            }
        }
        System.out.println("End of loop");
    }
}
