/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class WhoIsDemo {
    public static void main(String[] args) {
        String host = "google.com";
        try {
            Socket socket = new Socket("whois.internic.net",43);
            
            InputStream is  = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            
            os.write((host+"\n").getBytes());
            
            int c ;
            while( (c = is.read())!=-1)
            {
                System.out.print((char)c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            //Logger.getLogger(WhoIsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
