/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class MathDemo {
    static double toRadian(long degree)
    {
        return Math.PI/180*degree;
    }
    public static void main(String[] args) {
        System.out.println("Sin 90 "+Math.sin(toRadian(90)));
        System.out.println("Ceil "+Math.ceil(1.5));
        System.out.println("Abs "+Math.abs(-1.5));
        System.out.println("Round "+Math.round(1.45));
        System.out.println("Floor "+Math.floor(1.9));
        
       
    }
}
