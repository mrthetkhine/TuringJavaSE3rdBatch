/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author thetkhine
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        
        String host = "GET / HTTP/1.1\r\n\r\n";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            Socket socket = new Socket(ip,9000);
            
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
