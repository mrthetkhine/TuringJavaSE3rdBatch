/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/**
 *
 * @author thetkhine
 */
public class Base64Demo {
    public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
        String data = encoder.encodeToString("Hello. how are you? ".getBytes());
        System.out.println("Data "+ data);
        
        Decoder decoder = Base64.getDecoder();
        byte[] decodeBytes = decoder.decode(data);
        
        System.out.println("To String "+ new String(decodeBytes));
        
    }
}
