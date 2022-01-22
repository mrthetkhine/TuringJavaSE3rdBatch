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
interface SomeCapture
{
    void op();
}
public class VarCapture {
    public static void main(String[] args) {
        
        int a = 10;
        SomeCapture func = ()->{
            System.out.println("A is "+a);
            //a++;
        };
        //a = 20;
        func.op();
    }
}
