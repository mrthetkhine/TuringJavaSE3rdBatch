/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
class Base<T>{
    T obj;
    
    Base(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return this.obj;
    }
} 
class Derived<T> extends Base<T>{

    Derived(T obj)
    {
        super(obj);
    }
}
public class GenericSuperDemo {
    public static void main(String[] args) {
        Derived<Integer> de = new Derived<Integer>(3);
        System.out.println("De "+de.get());
        
    }
}
