/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ReadFile {
    public static void main(String[] args) {
        FileInputStream fin =null;
        try {
            //File file = new File("./");
            //System.out.println("File "+file.getAbsolutePath());
            fin = new FileInputStream("./src/chapter13/ReadFile.java");
            int i = 0;
            do 
            {
                try {
                    i = fin.read();
                    System.out.print((char)i);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }while(i != -1);
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally{
            if(fin != null)
            {
                try {
                    fin.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
