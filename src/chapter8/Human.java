/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
public class Human {
    protected String name;
    private int age;
    
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Human contructor");
    }
    public void work()
    {
        System.out.println("Human work");
    }
    public void walk()
    {
        System.out.println("Walk");
    }
}
