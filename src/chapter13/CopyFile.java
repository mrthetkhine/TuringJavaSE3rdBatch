/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class CopyFile {
    public static void main(String[] args) {
    
        try(FileInputStream fin  =new FileInputStream("./src/chapter13/CopyFile.java");
            FileOutputStream fout = new FileOutputStream("./test.java") )
        {
            int i = 0;
            do 
            {
               i = fin.read();
               fout.write(i);
               System.out.print((char)i);
            }while(i != -1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ie)
        {
            ie.printStackTrace();
        }
        
    }
}
