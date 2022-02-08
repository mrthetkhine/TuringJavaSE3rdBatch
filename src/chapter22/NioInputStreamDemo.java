/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class NioInputStreamDemo {
    public static void main(String[] args) {
          Path filePath = Paths.get("./test/hello1.txt");
          try(InputStream in = Files.newInputStream(filePath))
          {
              int i;
              do
              {
                  i = in.read();
                  if(i != -1)
                  {
                      System.out.print((char)i);
                  }
                  
              }while( i != -1);
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
    }
}
