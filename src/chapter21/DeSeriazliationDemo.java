/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author thetkhine
 */
public class DeSeriazliationDemo {
    public static void main(String[] args) {
        
        Human h ;
        
        try(ObjectInputStream out = new ObjectInputStream(new FileInputStream("./test/obj.dat")))
        {
            h =(Human)out.readObject();
            
            System.out.println("Name "+h.name + " Age "+h.age);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
