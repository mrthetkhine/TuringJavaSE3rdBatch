/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class OverloadDemo {
    
    void method()
    {
        System.out.println("method with no parameter");
    }
    void method(int a)
    {
        System.out.println("Method with int parameter");
    }
    void method(String str)
    {
        System.out.println("Method with string parameter");
    }
    void method(int a, String b)
    {
        System.out.println("Method with int,string parameter");
    }
    void method(String a, int b)
    {
        System.out.println("Method with string,int parameter");
    }
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        
        obj.method();
        obj.method(3);
        obj.method("Hello");
        
        obj.method("Hello", 0);
        obj.method(0, "Hello");
    }
}
