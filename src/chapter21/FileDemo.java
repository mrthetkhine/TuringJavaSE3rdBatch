/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.File;

/**
 *
 * @author thetkhine
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./src/chapter21/FileDemo.java");
        System.out.println("File "+file.getAbsolutePath());
        System.out.println("Path "+file.getPath());
        System.out.println("Name "+file.getName());
        System.out.println("parent "+file.getParent());
        
        System.out.println("File "+file.isFile());
        System.out.println("Exist "+file.exists());
        System.out.println("Directory "+file.isDirectory());
        System.out.println("LastModdi "+file.lastModified());
        System.out.println("Size "+file.length());
        
        File directory = new File("./src/chapter20");
        System.out.println("Is Directory "+directory.isDirectory());
        for (File f : directory.listFiles()) {
            System.out.println("File "+f.getAbsolutePath());
        }
    }
}
