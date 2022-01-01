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
interface Walkable
{
    public void walk();
}
interface Flyable
{
    public void fly();
}
class Bird implements Flyable,Walkable
{

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void walk() {
        System.out.println("Bird walk");
    }
}
class Aeroplane implements Flyable
{
    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        
        flyable = new Aeroplane();
        flyable.fly();
    }
}
