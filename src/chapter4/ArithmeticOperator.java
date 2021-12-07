package chapter4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thetkhine
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        
        System.out.println( "+ "+(a + b ));
        System.out.println("- "+ (a - b ));
        System.out.println("* "+ (a * b ));
        System.out.println("/ "+ (a / b ));
        System.out.println("% "+ (a % b ));
        
        System.out.println("+ "+ ('A'+ 2));
        
        byte c = 10;
        c = (byte)(c + 2);
        
        System.out.println("5/2 "+ (5/2));
        System.out.println("5.0/2 "+ (5.0/2));
        
        System.out.println("0/2 "+ (0/2));
        //System.out.println("0/0 "+ (1/0));
        System.out.println("1.0/0 "+ (1.0/0));
        System.out.println("0.0/0 "+ (0/0.0));
         
        float d = 0/0.0f; 
        System.out.println("NaN== NaN "+ (d==d));
        System.out.println("Never reach this line");
        
        System.out.println("3%2 "+ (3.0%2));
        
        
    }
}
