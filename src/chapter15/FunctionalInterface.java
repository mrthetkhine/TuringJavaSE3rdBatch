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
interface MyNumber{
    double getValue();
    //void nothing();
}
interface BinaryOp{
    double op(double a, double  b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        MyNumber num;
        num = ()->3.14f;
        System.out.println("Num "+num.getValue());
        
        num = ()-> 4;
        System.out.println("Num "+num.getValue());
        
        BinaryOp binary = (a,b)->a+b;
        System.out.println("Binary add "+ binary.op(2, 3));
        
        binary = (a,b)->a*b;
        System.out.println("Binary add "+ binary.op(2, 3));
        
        binary = (a,b)->{
            System.out.println("Adding ");
            return a +b;
        };
        System.out.println("Add "+binary.op(3,4));
    }
}
