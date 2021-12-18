/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class ImperativeMoney {
    
    static double add(String currency1, double value1, String currency2, double value2)
    {
        if(currency1.equals(currency2))
        {
            return value1 + value2;
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        String m1Currency = "$";
        double m1Value = 10;
        
        
        String m2Currency = "$";
        double m2Value = 20;
        
        double result = add(m1Currency,m1Value,m1Currency,m2Value);
        System.out.println("Result "+result);
    }
}
