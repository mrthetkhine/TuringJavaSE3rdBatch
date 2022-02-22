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
public class FindManyRe {
    public static void main(String[] args) {
        String input = "00112 Hello12393";
        
        Pattern digits = Pattern.compile("[0-9]+");
        Matcher matcher = digits.matcher(input);
        
        System.out.println("Input "+input);
        while(matcher.find())
        {
            System.out.println("Find at "+matcher.start() + "end "+matcher.end());
            System.out.println("Str "+ input.substring(matcher.start(), matcher.end()));
        }
    }
}
