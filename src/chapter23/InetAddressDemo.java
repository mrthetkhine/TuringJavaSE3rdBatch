/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            InetAddress localhost = InetAddress.getLocalHost();
            
            System.out.println("IP "+ ip);
            System.out.println("Localhost "+localhost);
            
            InetAddress []googleIps = InetAddress.getAllByName("www.google.com");
            for(InetAddress googleIp : googleIps)
            {
                System.out.println("Google Ip "+ googleIp);
            }
            
            System.out.println("Equal "+ip.equals( InetAddress.getByName("www.google.com")));
            System.out.println("Get Address "+ip.getAddress());
            System.out.println("Host Address "+ip.getHostAddress());
            System.out.println("Host name "+ip.getHostName());
            System.out.println("Multicas "+ip.isMulticastAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(InetAddressDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
