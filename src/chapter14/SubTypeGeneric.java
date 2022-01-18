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
class Parent<T>
{
    T data;
    
    Parent(T data)
    {
        this.data = data;
    }
}
class Child<T,V> extends Parent<T>
{
    V childData;
    Child(T data, V childData)
    {
        super(data);
        this.childData = childData;
    }
    
}
public class SubTypeGeneric {
    public static void main(String[] args) {
        Child<Integer,Float> child = new Child<Integer,Float>(1,3.1f);
        
        System.out.println("Data "+ child.data);
        System.out.println("Data "+ child.childData);
    }
}
