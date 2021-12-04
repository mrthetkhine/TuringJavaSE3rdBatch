/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.math.BigDecimal;

/**
 *
 * @author thetkhine
 */
public class FloatingPointType {
    public static void main(String[] args) {
        int i=1;
        long myLong = 2;
        float f = 3.1f;
        
        f = i;
        f = myLong;
        
        double d = 3.1;
        d = f;
        //f = d;
        
        double result = 0.3-0.2;
        System.out.println("Eq "+result);
        System.out.println("Eq "+ (0.3-0.2));
        
        BigDecimal a = new BigDecimal(0.3);
        BigDecimal b = new BigDecimal(0.2);
        BigDecimal c = a.subtract(b) ;
        System.out.println("C "+c);
    }
}
