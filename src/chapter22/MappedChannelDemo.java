/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class MappedChannelDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("./src/chapter22/ChannelDemo.java");
        try(FileChannel fCh = (FileChannel)Files.newByteChannel(filePath))
        {
            long fSize = fCh.size();
            MappedByteBuffer mBuffer = fCh.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)mBuffer.get());
            }
        } catch (IOException ex) {
            Logger.getLogger(MappedChannelDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
