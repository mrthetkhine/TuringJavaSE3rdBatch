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
public class MethodCall {
    static void method1()
    {
        System.out.println("Method1");
        
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        for (int i = 0; i < 5; i++) {
            System.out.println("Stack "+ stacks[i].getFileName()+ " line "
                    + stacks[i].getLineNumber()+" method "+ stacks[i].getMethodName());
        }
    }
    static void a()
    {
        b();
    }
    static void b()
    {
        method1();
    }
    static void c()
    {
        d();
    }
    static void d()
    {
        method1();
    }
    
    public static void main(String[] args) {
        a();
    }
}
