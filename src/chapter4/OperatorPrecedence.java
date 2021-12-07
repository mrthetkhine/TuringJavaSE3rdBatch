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
public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = (10 + 2) * 5;
        boolean data = (10+2)*5 > 65 && a != 0;
        System.out.println("a "+a);
        
    }
}
