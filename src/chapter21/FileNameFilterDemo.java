/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author thetkhine
 */
class OnlyExt implements FilenameFilter
{

    String ext;
    OnlyExt(String ext)
    {
        this.ext = ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
public class FileNameFilterDemo {
    public static void main(String[] args) {
        File dir = new File("./code");
        System.out.println("Dir "+dir.getAbsolutePath());
        File files [] = dir.listFiles(new OnlyExt("html"));
        for(File f : files)
        {
            System.out.println("File "+f.getAbsolutePath());
        }
        File newDir = new File("./test2");
        newDir.mkdir();
    }
   
}
