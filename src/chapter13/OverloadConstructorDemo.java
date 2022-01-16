/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

/**
 *
 * @author thetkhine
 */
class Human
{
    String name;
    int age;
    
    Human(String name)
    {
        
        this(name,0);
        System.out.println("One argument constructor");
    }
    Human(String name, int age)
    {
        System.out.println("Two argument constructor");
        this.name = name;
        this.age = age;
    }
}
public class OverloadConstructorDemo {
    public static void main(String[] args) {
        Human h = new Human("TK");
    }
}
