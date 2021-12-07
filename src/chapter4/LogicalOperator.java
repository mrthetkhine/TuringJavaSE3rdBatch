/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author thetkhine
 */
public class LogicalOperator {
    public static void main(String[] args) {
        
        System.out.println("true & true "+ (true & true));
        System.out.println("true & false "+ (true & false));
        System.out.println("false & true "+ (false & true));
        System.out.println("false & false "+ (false & false));
        
        System.out.println("true | true "+ (true | true));
        System.out.println("true | false "+ (true | false));
        System.out.println("false | true "+ (false | true));
        System.out.println("false | false "+ (false | false));
        
        
        System.out.println("true ^ true "+ (true ^ true));
        System.out.println("true ^ false "+ (true ^ false));
        System.out.println("false ^ true "+ (false ^ true));
        System.out.println("false ^ false "+ (false ^ false));
    }
}
