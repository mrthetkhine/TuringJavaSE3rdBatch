/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author thetkhine
 */
class RequestProcessor extends Thread
{
    Socket client;
    RequestProcessor(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try(DataInputStream din = new DataInputStream(client.getInputStream());
            DataOutputStream dOut= new DataOutputStream(client.getOutputStream()))
        {
            String line = din.readLine();
            System.out.println("From client "+line);
            
            dOut.write(("Echo from server "+line +new Date()+"\r\n").getBytes());            
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class EchoServer {
    public static void main(String[] args) {
        try
        {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server start");
            while(true)
            {
               
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection got from client");
                new RequestProcessor(clientSocket).start();
            }
            
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
