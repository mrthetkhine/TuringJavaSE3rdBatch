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
public class EqualityOp {
    public static void main(String[] args) {
        System.out.println("2==3 "+ (2==3));
        //System.out.println("2==3 "+ (2=="3"));
        
        int a = -10;
        String sign = a>0 ? "Positive":"Negative";
        
        System.out.println("sign "+ sign);
    }
}
