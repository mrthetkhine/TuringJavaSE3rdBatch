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
public class NestedIfExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myanmar marks ");
        int myanmar = scanner.nextInt();
       
        System.out.println("Enter english marks ");
        int english = scanner.nextInt();
       
        System.out.println("Enter math marks");
        int math = scanner.nextInt();
        
        final int PASSING_MARK = 40;
        
        if( myanmar >= PASSING_MARK)
        {
            System.out.println("Inside Myanmar");
            if( english >= PASSING_MARK)
            {
                System.out.println("Inside English");
                if(math >= PASSING_MARK)
                {
                    System.out.println("Inside Math");
                    System.out.println("Pass");
                }
                else
                {
                    System.out.println("Math Fail");
                }
            }
            else
            {
                System.out.println("Eng Fail");
            }
           
        }
        else
        {
            System.out.println("Myanmar Fail");
        }
    }
}
