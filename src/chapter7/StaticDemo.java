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
public class StaticDemo {
    int data;
    static int counter;
    
    static{
        System.out.println("Static block run ");
        counter = 0;
    }
    static{
        System.out.println("Static block2 run ");
        
    }
    
    StaticDemo(int data)
    {
        this.data = data;
    }
    
    public void inc()
    {
        this.data ++;
        StaticDemo.counter ++;
    }
    
    public static void main(String[] args) {
        System.out.println("Main run");
        //data++;
        /*
        StaticDemo obj = new StaticDemo(10);
        StaticDemo obj2 = new StaticDemo(20);
        
        obj.inc();
        obj2.inc();
        
        System.out.println("Obj1.data "+obj.data);
        System.out.println("Obj2.data "+obj2.data);
        */
        
        System.out.println("Class .data "+StaticDemo.counter);
    }
}
