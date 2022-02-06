/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author thetkhine
 */
public class SeriazliationDemo {
    public static void main(String[] args) {
        
        Human h = new Human("Tk",16);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./test/obj.dat")))
        {
            out.writeObject(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
