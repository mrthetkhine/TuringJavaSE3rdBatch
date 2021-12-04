/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author thetkhine
 */
public class Zero {
    public static void main(String[] args) {
        int zero = 0;
        System.out.println("0== 0.0 "+ (0==0.0));
        float posZero = 0;
        float minusOne = -1;
        float negZero = 0 * minusOne;
        
        System.out.println("Eq "+ (posZero == negZero));
        System.out.println("Inf "+ (1/posZero));
        System.out.println("Inf "+ (1/negZero));
        
        System.out.println("NaN=> "+ (0/negZero));
        
    }
}
