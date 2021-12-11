/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        int no = random.nextInt(10)+1;
        
        Scanner scanner = new Scanner(System.in);
        int userInput ;
        do
        {
            System.out.println("Guess no ");
            userInput = scanner.nextInt();
            
            if( userInput < no)
            {
                System.out.println("Too small");
            }
            else if(userInput > no)
            {
                System.out.println("Too large");
            }
        }while( no != userInput);
        System.out.println("No is "+no);
    }
}
