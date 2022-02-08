/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author thetkhine
 */
public class ShowDirectory {
    public static void main(String[] args)  {
        String dir = "./src/chapter10";
        Path filePath = Paths.get(dir);
        try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(filePath))
        {
            System.out.println("Name "+dir);
            for(Path p : dirStream)
            {
                BasicFileAttributes attr = Files.readAttributes(p,BasicFileAttributes.class );
                if(attr.isDirectory())
                {
                    System.out.println("Dir "+ p.getFileName());
                }
                else
                {
                    System.out.println("File "+p.getFileName());
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
