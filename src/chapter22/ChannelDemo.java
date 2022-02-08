/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class ChannelDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("./src/chapter22/ChannelDemo.java");
        int count ;
        try(SeekableByteChannel sCh = Files.newByteChannel(filePath))
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            do
            {
                 count = sCh.read(byteBuffer);
                 System.out.println("Count "+count);
                 if(count != -1)
                 {
                     byteBuffer.rewind();
                 }
                 for (int i = 0; i < count; i++) {
                     System.out.print((char)byteBuffer.get(i));
                  }
            }
            while(count != -1);
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
