/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("./src/chapter22/PathDemo.java");
        System.out.println("Absolute "+path.toAbsolutePath());
        System.out.println("Path "+path.getParent());
        System.out.println("Get Root "+path.getRoot());
        
        System.out.println("File exist "+Files.exists(path));   
        System.out.println("Readable "+ Files.isReadable(path));
        System.out.println("Writable "+ Files.isWritable(path));
        System.out.println("Excutable "+ Files.isExecutable(path));
        System.out.println("Directory "+ Files.isDirectory(path));
        System.out.println("Regular file "+ Files.isRegularFile(path));
    }
}
