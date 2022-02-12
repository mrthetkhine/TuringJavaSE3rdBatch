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
import java.util.Random;

/**
 *
 * @author thetkhine
 */
class HttpRequestProcessor extends Thread
{
    Socket client;
    HttpRequestProcessor(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        String arr[] = {
        "Hello",
        "How are you",
        "WTH"};
        Random random = new Random();
        try(DataInputStream din = new DataInputStream(client.getInputStream());
            DataOutputStream dOut= new DataOutputStream(client.getOutputStream()))
        {
            String requestLine = din.readLine();
            String[] requestFields = requestLine.split(" ");
            System.out.println("Request line"+requestLine);
            
            //String header = din.readLine();
            //System.out.println("Header "+header);
            
            //dOut.write(("Echo from server "+requestLine +new Date()+"\r\n").getBytes());     
            
            String body = "<html>"+ (new Date())+ 
                        "<h2>Path "+ requestFields[1]+"</h2>"+
                        "<h1>"+arr[random.nextInt(arr.length)]+"</h1>"
                    +"</html>\r\n";
            String responseLine = "HTTP/1.1 200 Ok\r\nConnection:close\r\n";
            responseLine+= "Content-Type:text/html\r\n";
            responseLine+= "Content-Length:"+body.length()+"\r\n\r\n";
            System.out.println("Response line "+responseLine);
            
            dOut.write(responseLine.getBytes());
            dOut.write(body.getBytes());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class HttpServer {
    public static void main(String[] args) {
        try
        {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server start");
            while(true)
            {
               
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection got from client");
                new HttpRequestProcessor(clientSocket).start();
            }
            
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
