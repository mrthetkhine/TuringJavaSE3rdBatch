/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class FileCopy {
    public static void main(String[] args) {
        Path source = Paths.get("./test/hello1.txt");
        Path target = Paths.get("./test/hello2.txt");
        
        try {
            Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(FileCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
