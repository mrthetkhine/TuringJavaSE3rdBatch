/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Data implements Cloneable
{
    int no;
    String data;
    Data()
    {
        System.out.println("Data no argument constructor ");
    }
    Data(String data,int no)
    {
        this.data = data;
        this.no = no;
    }
    
    Data cloneData()
    {
        Data data2 = null;
        try {
            
            data2 = (Data) this.clone();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return data2;
    }
}
public class CloneDemo {
    public static void main(String[] args) {
       Data data = new Data("Hello",123);
       Data data2 = data.cloneData();
       
       System.out.println("Data.data "+data.data);
       System.out.println("Data2.data "+data2.data);
       System.out.println("Data2== data "+(data==data2));
       
        System.out.println("GetClass "+data.getClass());
        Class clazz = data.getClass();
        try {
            Data data3 = (Data) clazz.newInstance();
            Constructor[] cons = clazz.getDeclaredConstructors();
            System.out.println("Con length "+cons.length);
            for(Constructor con : cons)
            {
                System.out.println("Con "+ con.toGenericString());
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(CloneDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CloneDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName("chapter18.Memory");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
