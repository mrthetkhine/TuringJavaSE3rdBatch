/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ChannelWriteDemo {
    public static void main(String[] args) {
         Path filePath = Paths.get("./test/hello.txt");
        try(FileChannel fCh = (FileChannel)Files.newByteChannel(filePath,
                            StandardOpenOption.CREATE,
                            StandardOpenOption.WRITE))
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte)('A'+i));
            }
            byteBuffer.rewind();
            fCh.write(byteBuffer);
        } catch (IOException ex) {
            Logger.getLogger(MappedChannelDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
