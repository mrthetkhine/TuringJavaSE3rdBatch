/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

/**
 *
 * @author thetkhine
 */
public class Human {
     String name;
    int age;
    Gender gender;
    Human(String name, int age,Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
}
