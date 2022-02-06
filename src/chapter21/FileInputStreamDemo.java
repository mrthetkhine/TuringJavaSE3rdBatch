/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author thetkhine
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        
        long start = System.nanoTime();
       try(FileInputStream fIn = new FileInputStream("./src/chapter21/FileDemo.java");
           FileOutputStream fOut = new FileOutputStream("./test/test.java")    )
       {
           /*
           int data ;
           while((data=fIn.read()) != -1)
           {
               System.out.print((char)data);
           }*/
           byte [] buffer = new byte[128];
           while(fIn.read(buffer) != -1)
           {
               fOut.write(buffer);
               System.out.println(new String(buffer));
               System.out.println("-------");
               System.out.println("Avialable "+ fIn.available());
           }
          
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Time "+time);
    }
}
