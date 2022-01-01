/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface IA 
{
    int DATA = 10;
    public void methodA();
}
interface IB extends IA
{
    public void methodB();
    default void hello()
    {
        System.out.println("Hello");
    }
    public static void staticMethod()
    {
        System.out.println("Static method");
    }
}
class A implements IB
{

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }
}
abstract class B implements IB
{
    @Override
    public void methodA() {
        System.out.println("Method A");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        IB b = new A();
        b.methodA();
        b.methodB();
        b.hello();
        IB.staticMethod();
    }
}
