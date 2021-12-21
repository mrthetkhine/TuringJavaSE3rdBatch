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
public class NestedClassDemo {
    int x = 10;
    void test()
    {
        Inner inner = new Inner();
        inner.display();
        
        //System.out.println("Y is "+y);
        for (int i = 0; i < 10; i++) {
            class InnerTwo{
                public void method()
                {
                    System.out.println("Hello");
                }
            }
            InnerTwo two = new InnerTwo();
            two.method();
        }
    }
    class Inner
    {
        int y = 20;
        public void display()
        {
            System.out.println("Outer x "+x);
        }
    }
    public static void main(String[] args) {
        //Inner inner = new Inner();
        NestedClassDemo outer = new NestedClassDemo();
        outer.test();
    }
}
