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
interface SomeFun<T>
{
    T op(T t);
}
public class GenericFIDemo {
    
    
    public static void main(String[] args) {
        SomeFun<String> func;
        func =(str)-> str.concat("Hello");
        
        System.out.println("Func "+ func.op("Hi "));
        
        SomeFun<Double> doubleFunc;
        doubleFunc = (val)-> val *2;
        System.out.println("Double Func "+doubleFunc.op(3.1));
    }
}
