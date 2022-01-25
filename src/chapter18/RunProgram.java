/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class RunProgram {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("ls");
            InputStream in = p.getInputStream();
            int ch;
            while( (ch=in.read()) != -1 )
            {
                System.out.print((char)ch);
            }
            in.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
