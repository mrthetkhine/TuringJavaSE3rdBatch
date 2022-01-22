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
interface MyFunc2
{
    MyClass func(int a);
}
class MyClass
{
    private int val;
    MyClass()
    {
        System.out.println("MyClass constructor");
    }
    
    MyClass(int v)
    {
        val = v;
        System.out.println("MyClass constructor val");
    }

    int getVal()
    {
        return val;
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        MyFunc2 func = MyClass::new;//MyClass(int v)
        MyClass obj = func.func(100);
        System.out.println("Obje "+obj.getVal());
    }
}
