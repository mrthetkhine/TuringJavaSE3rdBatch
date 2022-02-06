/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.Serializable;

/**
 *
 * @author thetkhine
 */
public class Human implements Serializable {
    String name;
    int age;
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
