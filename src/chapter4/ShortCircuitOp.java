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
public class ShortCircuitOp {
    static boolean getTrue()
    {
        System.out.println("Get True=>");
        return true;
    }
    static boolean getFalse()
    {
        System.out.println("Get False=>");
        return false;
    }
    public static void main(String[] args) {
        
        /*
        System.out.println("true && true "+ (true && true));
        System.out.println("true && false "+ (true && false));
        System.out.println("false && true "+ (false && true));
        System.out.println("false && false "+ (false && false));
        
        System.out.println("true || true "+ (true || true));
        System.out.println("true || false "+ (true || false));
        System.out.println("false|| true "+ (false || true));
        System.out.println("false|| false "+ (false || false));
        */
        //System.out.println("getFalse() && getTrue() "+ (getFalse() && getTrue()));
        //System.out.println("getFalse() & getTrue() "+ (getFalse() & getTrue()));
        
        //System.out.println("getTrue || getTrue() "+ (getTrue() || getTrue()));
        //System.out.println("getFalse || getTrue() "+ (getFalse() || getTrue()));
        
        
        System.out.println("getTrue | getFalse() "+ (getTrue() | getFalse()));
        
        System.out.println("! true "+ !true);
        
        boolean flag = true;
        flag &= false;
        
        System.out.println("Flag "+flag);
        
       
    }
}
