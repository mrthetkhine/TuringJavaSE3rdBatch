/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thetkhine
 */
class OurData implements Comparable
{
    private String name;
    private int age;
    
    OurData(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        OurData another = (OurData)obj;
        int ageDiff = this.age - another.age;
        if(ageDiff == 0)
        {
            return this.name.compareTo(another.name);
        }
        else
        {
            return ageDiff;
        }
        
    }

    @Override
    public String toString() {
        return "OurData{" + "name=" + name + ", age=" + age + '}';
    }
    
}
public class Sorting {
    public static void main(String[] args) {
        List<OurData> arr = new ArrayList<OurData>();
        
        arr.add(new OurData("one",31));
        arr.add(new OurData("two",19));
        arr.add(new OurData("three",13));
        arr.add(new OurData("five",13));
        arr.add(new OurData("four",91));
        
        Collections.sort(arr);
        
        for(OurData data : arr)
        {
            System.out.println(data);
        }
    }
}
