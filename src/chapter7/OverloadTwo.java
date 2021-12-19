/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import chapter6.Stack;
/**
 *
 * @author thetkhine
 */
public class OverloadTwo {
    
    void method(int a)
    {
        System.out.println("Int method "+a);
    }
    void method(short b )
    {
        System.out.println("Short method "+b);
    }
   /*
    void method(float f)
    {
         System.out.println("Short method "+f);
    }
*/
    public static void main(String[] args) {
        OverloadTwo obj = new OverloadTwo();
        
        int s = 34;
        obj.method(s);
        
        //Stack stack = new Stack();
        
    }
}
