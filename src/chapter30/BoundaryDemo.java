/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thetkhine
 */
public class BoundaryDemo {
    public static void main(String[] args) {
        String input = "Hello ";
        Pattern pattern = Pattern.compile("^Hello$");
        Matcher matcher = pattern.matcher(input);
        
        System.out.println("Find "+matcher.find());
        
        
        input = "A dogbite";
        pattern = Pattern.compile("\\bdog\\B");
        matcher = pattern.matcher(input);
        
        System.out.println("Find \\b"+ matcher.find());
        
        input = "dogbite";
        pattern = Pattern.compile("\\Adog");
        matcher = pattern.matcher(input);
        
        System.out.println("Find \\Adog "+ matcher.find());
        
        
        input = "dog dog";
        pattern = Pattern.compile("\\Gdog");
        matcher = pattern.matcher(input);
        
        System.out.println("Find \\Gdog "+ matcher.find() +" start "+matcher.start());
    }
}
