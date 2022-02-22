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
public class QunatifierDemo {
    public static void main(String[] args) {
        String input = "12345";
        Pattern pattern = Pattern.compile("\\d{3,5}");
        Matcher matcher = pattern.matcher(input);
        
        System.out.println("Find "+matcher.find());
        
        input = "1234567";
        pattern = Pattern.compile("^\\d{3,5}$");
        matcher = pattern.matcher(input);
        
        System.out.println("Find 1234567 "+matcher.find());
        
        input = "apple";
        pattern = Pattern.compile("(apple|orange)");
        matcher = pattern.matcher(input);
        
        System.out.println("Find (apple|orange) "+matcher.find());
        
        input = "orange";
        pattern = Pattern.compile("(apple|orange)");
        matcher = pattern.matcher(input);
        
        System.out.println("Find (apple|orange) "+matcher.find());
    }
}
