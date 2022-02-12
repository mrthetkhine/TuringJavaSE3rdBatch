/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author thetkhine
 */
public class HttpRequestDemo {
    public static void main(String[] args) {
        
        String url = "www.google.com";
        try
        {
            Socket socket = new Socket(url,80);
            
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            
            String request = "GET /index.html HTTP/1.1\r\nConnection: close\r\n\r\n";
            System.out.println("Request "+request);
            os.write(request.getBytes());
            
            int c ;
            while( (c = is.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception ie)
        {
            ie.printStackTrace();
        }
    }
}
