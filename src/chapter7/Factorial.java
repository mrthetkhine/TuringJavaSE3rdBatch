/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class Factorial {
    
    static int nonRecFact(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static int fact(int n)
    {
        //System.out.println("N "+ n);
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int result = fact(10);
       
        System.out.println("Result "+result);
        
        result = nonRecFact(4);
        System.out.println("Result "+result);
    }
}
