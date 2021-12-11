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
public class ControlStatement {
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 5; i++) {
            if(i==2)
            {
                break;
            }
            System.out.println("Hello World "+i);
        }
        
        int num = 3;
        int divisor =10;
        
        if(divisor != 0)
        {
            System.out.println("Division "+ num/divisor);
        }
       
    }
    
}
