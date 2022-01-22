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
interface VoidFunc
{
    void op();
}
public class PassLambda {
    public static void acceptExec(VoidFunc func)
    {
        func.op();
    }
    public static VoidFunc getFunc()
    {
        return ()->{
            System.out.println("Fucntion executed");
        };
    }
    
    public static void main(String[] args) {
        VoidFunc func = ()->System.out.println("Hello");
        acceptExec(func);
        
        acceptExec(()->{
            System.out.println("Line One");
            System.out.println("Line Two");
        });
        
        getFunc().op();
    }
}
