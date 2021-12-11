/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class LadderIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter digit ");
        int digit = scanner.nextInt();
        /*
        if( digit == 0)
        {
        System.out.println("Zero");
        }
        else if(digit == 1)
        {
        System.out.println("One");
        }
        else
        {
        System.out.println("Not zero or one");
        }
         */
        switch (digit) {
            
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
            case 3:
                System.out.println("Two or three");
                break;
            default:
                System.out.println("Not zero or one");
                break;
            
        }
            
              
    }
    
}
