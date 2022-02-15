/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.net.www.http.HttpClient;

/**
 *
 * @author thetkhine
 */
public class HttpDemo {
    public static void main(String[] args) {
        try {
           URL url = new URL("https://www.google.com");
           URLConnection con = url.openConnection();
           InputStream in = con.getInputStream();
           
           int c ;
           while( (c=in.read())!=-1)
           {
               System.out.print((char)c);
           }
           in.close();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
