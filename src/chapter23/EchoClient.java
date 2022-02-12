/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author thetkhine
 */
public class EchoClient {
    public static void main(String[] args) {
        try
        {
            InetAddress ip = InetAddress.getLocalHost();
            Socket socket = new Socket(ip,9000);
            
            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            
            dout.write("Hello".getBytes());
            String output = din.readLine();
            System.out.println("Output server "+ output);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
