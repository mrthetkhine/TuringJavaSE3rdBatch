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
public class MySystem {
    
    static void println(String str)
    {
        System.out.println(str);
    }
    static void println(int num)
    {
        System.out.println(num);
    }
    public static void main(String[] args) {
        MySystem.println("Hello");
        MySystem.println(23);
    }
}
