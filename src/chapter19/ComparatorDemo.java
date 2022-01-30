/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thetkhine
 */
class Human implements Comparable
{
    String name;
    int age;
    
    Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Object obj) {
        Human another = (Human)obj;
        return this.age - another.age;
    }
    
}
class HumanComparator implements Comparator<Human>
{

    @Override
    public int compare(Human obj1, Human obj2) {
        return obj1.age - obj2.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<Human>();
        humans.add(new Human("One",38));
        humans.add(new Human("Two",4));
        humans.add(new Human("Three",45));
        
        Comparator<Human> comparator = (obj1,obj2)-> obj1.age-obj2.age;
        //humans.sort(comparator);
        //humans.sort(new HumanComparator());
        
        
        Collections.sort(humans,Collections.reverseOrder());
        
        for(Human h : humans)
        {
            System.out.println(h);
        }
        
       
    }
}
