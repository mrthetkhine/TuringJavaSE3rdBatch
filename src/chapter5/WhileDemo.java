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
public class WhileDemo {
    public static void main(String[] args) {
        
        int counter = 0;
        
        while(counter < 5)
        {
            System.out.println("Counter "+counter);
            counter ++;
        }
        System.out.println("End of while "+counter);
    }
}
