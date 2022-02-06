/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author thetkhine
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
         try(DataInputStream din = new DataInputStream(new FileInputStream("./test/test.dat"))
          )
        {
            //dout.writeDouble(1234);
            //dout.writeBytes("Hello");
            //dout.writeInt(100);
            double dob = din.readDouble();
            System.out.println("Double "+dob);
            
            byte[] buffer = new byte[5];
            din.read(buffer);
            String str = new String(buffer);
            System.out.println("Str "+str);
            
            int intData = din.readInt();
            System.out.println("Int "+intData);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
