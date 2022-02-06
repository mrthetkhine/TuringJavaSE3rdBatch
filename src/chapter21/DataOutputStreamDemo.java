/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author thetkhine
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("./test/test.dat"))
          )
        {
            dout.writeDouble(1234);
            dout.writeBytes("Hello");
            dout.writeInt(100);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
