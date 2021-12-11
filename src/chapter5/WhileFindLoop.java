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
public class WhileFindLoop {
    
    public static void main(String[] args) {
        
        boolean stop = false;
        int counter = 0;
        
        while(!stop)
        {
            System.out.println("Counter "+counter);
            if(counter == 5)
            {
                stop = true;
            }
            counter ++;
        }
    }
}
