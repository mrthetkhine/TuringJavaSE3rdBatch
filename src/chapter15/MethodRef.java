/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author thetkhine
 */
interface VoidFunc2
{
    void op();
}
public class MethodRef {
    static void someMethod()
    {
        System.out.println("hello");
    }
    
    void instanceMethod()
    {
        System.out.println("Instance method");
    }
    public static void main(String[] args) {
        VoidFunc2 fun = MethodRef::someMethod;
        fun.op();
        
        MethodRef obj = new MethodRef();
        fun = obj::instanceMethod;
        fun.op();
    }
}
