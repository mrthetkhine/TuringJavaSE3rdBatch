/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
public class WrapperProblem {
    public static void main(String[] args) {
        Boolean bool = false;
        System.out.println( bool == false);//primivte comparison
        
        Boolean another = new Boolean(false);
        System.out.println( bool == another);//ref comparison
        
        Boolean other = false;
        System.out.println( bool == other);
        System.out.println("Instance "+ (other instanceof Object ));
        
        System.out.println("Compare "+(bool.booleanValue() == other.booleanValue()));
    }
}
